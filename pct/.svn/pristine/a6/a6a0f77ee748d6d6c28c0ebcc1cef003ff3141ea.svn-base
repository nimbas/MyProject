package com.acube.pvs.web.rest;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.acube.common.domain.Result;
import com.acube.common.domain.ResultCode;
import com.acube.common.domain.jqgrid.JQueryGrid;
import com.acube.common.domain.searchFilter.SearchFilter;
import com.acube.pvs.domain.PsUiAlarmConf;
import com.acube.pvs.domain.PsUiAlarmConfExample;
import com.acube.pvs.domain.QueueDataSub;
import com.acube.pvs.domain.monitor.PvsProcessTree;
import com.acube.pvs.domain.monitor.SysResourceTree;
import com.acube.pvs.mapper.CodeListDao;
import com.acube.pvs.mapper.mbg.PsUiAlarmConfMapper;
import com.acube.pvs.service.monitor.MonitorService;
import com.google.gson.Gson;

@RestController
@RequestMapping(value = "/view/monitor/")
public class RestMonitorController {

	private final static Logger log = LoggerFactory.getLogger(RestMonitorController.class);

	/* @Autowired LoginInfo loginInfo; */
	@Autowired
	MonitorService monitorService;
	@Autowired
	CodeListDao codeListDao;
	
	@Autowired
	PsUiAlarmConfMapper psUiAlarmConfMapper;
	
	/* @Autowired UserDao userDao; */

	@Value("#{chart.queueStatus}")
	private String QUEUE_STATUS;
	@Value("#{chart.processStatus}")
	private String PROCESS_STATUS;

	@Value("#{pvsProp['pms.1.hostname']}")
	private String pmsServer1;

	@Value("#{pvsProp['pms.2.hostname']}")
	private String pmsServer2;

	// processStatus 상태 polling
	@RequestMapping(value = { "processStatus/polling" }, method = { RequestMethod.GET })
	public JQueryGrid<PvsProcessTree> getProcessStatusData2() {

		JQueryGrid<PvsProcessTree> pvsProcessTree = monitorService.getProcessStatusData();

		return pvsProcessTree;
	}

	// processStatus 서버프로세스 제어(ADMIN만 제어가능)
	@RequestMapping(value = { "processStatus/processHandling" }, method = { RequestMethod.GET })
	public Result processHandling(@RequestParam("command") String command) {
		monitorService.processHandling(command);
		return new Result(ResultCode.SUCCESS, "The Request has been executed.");

	}

	// sysResources 상태 polling - system summary
	@RequestMapping(value = { "sysResources/polling" }, method = { RequestMethod.GET })
	JQueryGrid<SysResourceTree> getSysResources() {

		JQueryGrid<SysResourceTree> sysResourceTree = monitorService.getLastestSysResources();

		return sysResourceTree;
	}
	
	// sysResources 상태 polling - disk
	@RequestMapping(value = { "sysResources/polling/disk" }, method = { RequestMethod.GET })
	JQueryGrid<SysResourceTree> getDiskResources() {

		JQueryGrid<SysResourceTree> sysResourceTree = monitorService.getLastestDiskResources();

		return sysResourceTree;
	}
	
	// sysResources 상태 polling - cpu
	@RequestMapping(value = { "sysResources/polling/cpu" }, method = { RequestMethod.GET })
	String getCpuResources() {
		Gson g = new Gson();
		return g.toJson(monitorService.getLastestCpuResources(pmsServer1,pmsServer2));
	}
	
	// sysResources 상태 polling - memory
	@RequestMapping(value = { "sysResources/polling/memory" }, method = { RequestMethod.GET })
	String getMemoryResources() {
		Gson g = new Gson();
		return g.toJson(monitorService.getLastestMemoryResources(pmsServer1,pmsServer2));
	}


	@RequestMapping(value = { "sysResources/getAlarmConf" }, method = { RequestMethod.GET })
	public List<PsUiAlarmConf> getAlarmConf() {
		return psUiAlarmConfMapper.selectByExample(new PsUiAlarmConfExample());
	}

	@RequestMapping(value = { "sysResources/updateAlarmConf" }, method = { RequestMethod.PUT })
	public Result updateAlarmConf(@RequestBody PsUiAlarmConf[] list) {

		log.debug("====AlarmConf====");
		for (PsUiAlarmConf a : list) {

			log.debug(a.toString());

		}
		log.debug("====AlarmConf====");
		
		monitorService.updateAlarmConf(list);
		return new Result(ResultCode.SUCCESS, "Successfully saved.");
	}

	// queue status 상태 polling(예전 pv서버와 file연동 로직임. 추후 개발시 DB polling으로 수정할것!!!)
	@SuppressWarnings("unchecked")
	@RequestMapping(value = { "queueStatus/polling" }, method = { RequestMethod.GET })
	public JSONObject makeQueueSummary() {

		try {

			int random_limt = 110;
			JSONObject obj = new JSONObject();
			JSONArray list = new JSONArray();

			String[] name = { "HLR", "BlackBerry", "Seven", "IAP", "U2000_GPON", "VoIP", "ERR", "HSS" };
			long unixTime = System.currentTimeMillis() / 1000L;

			for (int i = 0; i < name.length; i++) {
				JSONObject jObj = new JSONObject();
				jObj.put("name", name[i]);
				jObj.put("x", Long.valueOf(unixTime));

				jObj.put("y", Integer.valueOf(0));
				list.add(jObj);
			}

			obj.put("identifier", "name");
			obj.put("label", "name");
			obj.put("items", list);

			FileWriter file = new FileWriter(QUEUE_STATUS);
			file.write(obj.toJSONString());
			file.flush();
			file.close();

			return (JSONObject) new JSONParser().parse(new FileReader(QUEUE_STATUS));
		} catch (Exception e) {
			log.error("QueueStatus " + e.toString());
		}

		return new JSONObject();
	}

	@RequestMapping(value = "queueGridData", method = RequestMethod.GET)
	public Object makeQueueData() {

		long unixTime = System.currentTimeMillis() / 1000L;

		String[] qName = { "Primary Request Queue", "Nortel Router", "SSW Request Queue", "ERR Process Queue", "Primary Reponse Queue", "Primary Output Queue" };

		List<QueueDataSub> list = new ArrayList<QueueDataSub>();
		for (int i = 0; i < 6; i++) {

			long enqCount = (int) (Math.random() * 300000);
			long deqCount = (int) (Math.random() * 300000);
			if (enqCount <= deqCount) {
				deqCount = enqCount - (int) (Math.random() * 5);
			}
			long quingCount = enqCount - deqCount;
			String health = (enqCount > 250000) ? "BAD" : "GOOD";

			list.add(new QueueDataSub(qName[i], health, enqCount, deqCount, quingCount, unixTime));
		}

		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("items", list);
		return map;
	}

}