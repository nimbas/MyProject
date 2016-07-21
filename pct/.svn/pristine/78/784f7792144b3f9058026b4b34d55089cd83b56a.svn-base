package com.acube.pvs.web.mvc;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.acube.pvs.domain.PsUiAlarmConf;
import com.acube.pvs.domain.PsUiAlarmConfExample;
import com.acube.pvs.mapper.CodeListDao;
import com.acube.pvs.mapper.mbg.PsUiAlarmConfMapper;
import com.acube.pvs.service.monitor.MonitorService;
import com.google.gson.Gson;

@Controller
@RequestMapping(value = "/view/monitor/")
public class MvcMonitorController {

	private final static Logger log = LoggerFactory.getLogger(MvcMonitorController.class);

	
	/*@Autowired LoginInfo loginInfo;*/
	 
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

	// processStatus 화면 오픈
	@RequestMapping(value = { "processStatus" }, method = { RequestMethod.GET })
	public String goProcessMonitor(Model model) throws Exception {

		/*model.addAttribute("userLevel",userDao.getUserByID(loginInfo.currentUser().getUserId()).getLevels());*/
		// user level 구하는 부분 변경.
		return "pvs/monitor/processStatus";
	}

	// sysResources 화면 오픈
	@RequestMapping(value = { "sysResources" }, method = { RequestMethod.GET })
	public String goSysResource(Model model) {

		model.addAttribute("pmsServer1", pmsServer1);
		model.addAttribute("pmsServer2", pmsServer2);

		List<PsUiAlarmConf> alarmList =psUiAlarmConfMapper.selectByExample(new PsUiAlarmConfExample());
		Gson g = new Gson();
		
		try {
		model.addAttribute("sysAlarmConfData", g.toJson(alarmList));
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("sysAlarmConfData", "");
		}

		return "pvs/monitor/sysResources";
	}

	@RequestMapping(value = "queueStatus", method = RequestMethod.GET)
	public String goQueueMonitor(Model model) {
		model.addAttribute("pmsServer1", pmsServer1);
		model.addAttribute("pmsServer2", pmsServer2);
		return "view/monitor/chartTest";
	}
	
	

}