package com.acube.pvs.service.monitor;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.acube.common.domain.jqgrid.JQueryGrid;
import com.acube.common.exception.AcubeException;
import com.acube.common.util.CmnDateUtils;
import com.acube.common.util.RemoteConnViaSsh;
import com.acube.pvs.domain.BatchServerInfo;
import com.acube.pvs.domain.PsUiAlarmConf;
import com.acube.pvs.domain.PsUiAlarmConfKey;
import com.acube.pvs.domain.monitor.PvsProcessTree;
import com.acube.pvs.domain.monitor.SysResource;
import com.acube.pvs.domain.monitor.SysResourceTree;
import com.acube.pvs.exception.PvException;
import com.acube.pvs.mapper.CodeListDao;
import com.acube.pvs.mapper.mbg.PsUiAlarmConfMapper;
import com.acube.pvs.mapper.monitor.MonitorDao;
import com.acube.security.spring.SecurityUtil;

@Service
public class MonitorServiceImpl implements MonitorService {

	private Logger log = LoggerFactory.getLogger(MonitorServiceImpl.class);

	@Autowired
	MonitorDao monitorDao;
	@Autowired
	CodeListDao codeListDao;

	@Value("#{pvsProp.userId}")
	private String userId;

	@Value("#{pvsProp.userPswd}")
	private String userPswd;

	@Value("#{T(java.util.Arrays).asList(pvsProp['pmsRealIpArr'])}")
	private List<String> pmsRealIpArr;

	@Value("#{pvsProp.processStatusValidSeconds}")
	private int processStatusValidSeconds;

	@Value("#{pvsProp['pms.1.hostname']}")
	private String pmsServer1;

	@Value("#{pvsProp['pms.2.hostname']}")
	private String pmsServer2;

	@Value("#{pvsProp.validCpuCount}")
	private int validCpuCount;

	@Value("#{pvsProp.validMemCount}")
	private int validMemCount;

	@Value("#{pvsProp.validDiskCount}")
	private int validDiskCount;

	@Value("#{pvsProp.diskCount}")
	private int diskCount;

	@Value("#{pvsProp.isTestServerYN}")
	private String isTestServerYN;
	
	
	@Autowired
	private PsUiAlarmConfMapper psUiAlarmConfMapper;

	@Override
	public JQueryGrid<PvsProcessTree> getProcessStatusData() {

		String wasTime = CmnDateUtils.addDate(new Date(), 0, "yyyyMMddHHmmss");

		return new JQueryGrid<PvsProcessTree>(monitorDao.getProcessStatusData(wasTime, processStatusValidSeconds));
	}

	@Override
	public void processHandling(String command) {

		String[] hostNameAndCmd = command.split("\\|\\|");

		if (hostNameAndCmd.length != 2) {
			throw new PvException("invalid command(" + command + "). please check.");
		}

		String targetIp = "";

		for (String hostAndIp : pmsRealIpArr) {

			String[] each = hostAndIp.split("\\|");
			if (hostNameAndCmd[0].equals(each[0])) {
				targetIp = each[1];
			}
		}

		if (StringUtils.isEmpty(targetIp)) {
			throw new PvException("Unknown hostname(" + targetIp + "). Please check config file.");
		}

		String result = RemoteConnViaSsh.reqCommand(new BatchServerInfo(targetIp, userId, userPswd), hostNameAndCmd[1] + " " + SecurityUtil.getCurrentUser().getUserId());

		if (!result.equals("SUCCESS")) {
			throw new AcubeException("FAIL", result);
		}

	}

	@Override
	@Transactional
	public void updateAlarmConf(PsUiAlarmConf[] list) {

		PsUiAlarmConfKey key = new PsUiAlarmConfKey();

		for (PsUiAlarmConf a : list) {
			key.setId(a.getId());
			psUiAlarmConfMapper.updateByPrimaryKeySelective(a);
		}
	}

	@Override
	public JQueryGrid<SysResourceTree> getLastestSysResources() {

		Date currentDate = new Date();
		String start = CmnDateUtils.plusOrMinusMinsDate(currentDate, -5);
		String end = CmnDateUtils.plusOrMinusMinsDate(currentDate, +5);

		String errorMsg = "";

		List<SysResourceTree> systemSummaryList = monitorDao.getLastestSystemSummary(diskCount, start, end);

		int cpuListCount = 0;
		int memListCount = 0;
		int diskListCount = 0;

		for (SysResourceTree st : systemSummaryList) {
			if (st.getCategory().equals("cpu")) {
				cpuListCount++;
			}

			if (st.getCategory().equals("mem")) {
				memListCount++;
			}

			if (st.getCategory().equals("disk")) {
				diskListCount++;
			}
		}

		// PMS서버 cron이 리소스 정보를 수집하고 있지 못할 경우 화면에 메세지를 보여주는데 메시지를 보여줄지 말지
		if (isTestServerYN.equals("N")) {

			if (cpuListCount != validCpuCount)
				errorMsg += "count(CPU) is invalid.<br>";

			if (memListCount != validMemCount)
				errorMsg += "count(Memory) is invalid.<br>";

			if (diskListCount != validDiskCount)
				errorMsg += "count(Disk) is invalid.";
		}

		return new JQueryGrid<SysResourceTree>(systemSummaryList, errorMsg);
	}

	@Override
	public JQueryGrid<SysResourceTree> getLastestDiskResources() {

		Date currentDate = new Date();
		String start = CmnDateUtils.plusOrMinusMinsDate(currentDate, -5);
		String end = CmnDateUtils.plusOrMinusMinsDate(currentDate, +5);

		return new JQueryGrid<SysResourceTree>(monitorDao.getLastestDiskSummary(diskCount, start, end));
	}

	@Override
	public List<SysResource> getLastestCpuResources(String pmsServer1, String pmsServer2) {
		
		Date currentDate = new Date();
		String start = CmnDateUtils.plusOrMinusMinsDate(currentDate, -5);
		String end = CmnDateUtils.plusOrMinusMinsDate(currentDate, +5);

		return monitorDao.getLatestCpuInfo(pmsServer1, pmsServer2, start, end);
	}

	@Override
	public List<SysResource> getLastestMemoryResources(String pmsServer1, String pmsServer2) {
		
		Date currentDate = new Date();
		String start = CmnDateUtils.plusOrMinusMinsDate(currentDate, -5);
		String end = CmnDateUtils.plusOrMinusMinsDate(currentDate, +5);

		return monitorDao.getLatestMemInfo(pmsServer1, pmsServer2, start, end);
	}

}
