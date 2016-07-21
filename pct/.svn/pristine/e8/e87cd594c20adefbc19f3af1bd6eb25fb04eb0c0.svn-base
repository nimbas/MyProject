package com.acube.pvs.service.monitor;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;

import com.acube.common.AbstractApplicationContextTest;
import com.acube.common.util.CmnDateUtils;
import com.acube.common.util.RemoteConnViaSsh;
import com.acube.pvs.domain.BatchServerInfo;
import com.acube.pvs.domain.monitor.PvsProcessTree;
import com.acube.pvs.domain.monitor.SysResource;
import com.acube.pvs.exception.PvException;
import com.acube.pvs.mapper.CodeListDao;
import com.acube.pvs.mapper.monitor.MonitorDao;
import com.acube.security.spring.SecurityUtil;

public class MvcMonitorControllerTest extends AbstractApplicationContextTest {

	private static final Logger logger = LoggerFactory.getLogger(MvcMonitorControllerTest.class);

	@Resource(name="monitorDao")
	MonitorDao monitorDao;
	@Resource(name="codeListDao")
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

	public List<PvsProcessTree> getProcessStatusData() {

		String wasTime = CmnDateUtils.addDate(new Date(), 0, "yyyyMMddHHmmss");
		List<PvsProcessTree> list = monitorDao.getProcessStatusData(wasTime, processStatusValidSeconds);
		return list;
	}

	//@Test
	public void getProcessStatusDataTest() throws Exception {

		logger.debug("================test==============");
		
		List<PvsProcessTree> ppl = getProcessStatusData();

		for (PvsProcessTree p : ppl) {
			System.out.println(p.toString());
		}

	}

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
			throw new PvException(result);
		}

	}

	public Map<String, Object> getLatestSysResouces() {

		Map<String, Object> outerMap = new HashMap<String, Object>();

		Date currentDate = new Date();
		String start = CmnDateUtils.plusOrMinusMinsDate(currentDate, -5);
		String end = CmnDateUtils.plusOrMinusMinsDate(currentDate, +5);

		String errorMsg = "";

		List<SysResource> cpuList = monitorDao.getLatestCpuInfo(pmsServer1, pmsServer2, start, end);

		List<SysResource> memList = monitorDao.getLatestMemInfo(pmsServer1, pmsServer2, start, end);

		List<SysResource> diskList = monitorDao.getLatestDiskInfo(pmsServer1, pmsServer2, diskCount, start, end);

		// PMS서버 cron이 리소스 정보를 수집하고 있지 못할 경우 화면에 메세지를 보여주는데 메시지를 보여줄지 말지
		if (isTestServerYN.equals("N")) {

			if (cpuList.size() != validCpuCount)
				errorMsg += "count(CPU) is invalid.<br>";

			if (memList.size() != validMemCount)
				errorMsg += "count(Memory) is invalid.<br>";

			if (diskList.size() != validDiskCount)
				errorMsg += "count(Disk) is invalid.";
		}

		outerMap.put("cpu", cpuList);
		outerMap.put("mem", memList);
		outerMap.put("disk", diskList);

		outerMap.put("errorMsg", errorMsg);

		return outerMap;
	}

}
