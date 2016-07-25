package com.acube.pvs.web;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.acube.common.domain.Result;
import com.acube.common.domain.ResultCode;
import com.acube.common.exception.AcubeException;
import com.acube.common.service.co.LogicalDateService;
import com.acube.pvs.service.CommandService;
import com.acube.pvs.service.ExcelService;
import com.acube.pvs.service.MapService;
import com.acube.pvs.service.NeService;
import com.acube.pvs.service.ParameterService;
import com.acube.pvs.service.ProdFeatureService;
import com.acube.security.service.SecurityService;

@Controller
@RequestMapping
public class ExcelUploadController {

	private final static Logger logger = LoggerFactory.getLogger(ExcelUploadController.class);

	@Autowired
	LogicalDateService dateService;
	@Autowired
	ExcelService excelService;
	@Autowired
	NeService neService;
	@Autowired
	ProdFeatureService featureService;
	@Autowired
	ParameterService parameterService;
	@Autowired
	CommandService commandService;
	@Autowired
	MapService mapService;
	@Autowired
	SecurityService securityService;

	@RequestMapping(value = { "/excelUpload/{uploadCmd}" }, method = { RequestMethod.GET })
	public String uploadPage(@PathVariable String uploadCmd) {

		return "pvs/upload/fileUpload";
	}
	
	/**
	 * 일괄 엑셀 등록 처리
	 * 
	 * @param provFtr
	 * @return
	 */
	@RequestMapping(value = { "/excelUpload/{uploadCmd}" }, method = { RequestMethod.POST })
	@ResponseBody
	public Result upload(@RequestParam("file") MultipartFile multipartFile, @PathVariable String uploadCmd) {
		List<Object> list = new ArrayList<Object>() ;
		try{
			File excel = excelService.saveFile(multipartFile);
			Date workDate = dateService.getCurrentDate();
			String userId = securityService.getCurrentUser().getUserId();
			if("neInfo".equals(uploadCmd)){//ne 정보 일괄 엑셀 등록 처리
				neService.processNeForExcel(list, excel, workDate , userId, "uploadNeInfos");	
			}else if("feature".equals(uploadCmd)){//Feature 정보 일괄 엑셀 등록 처리
				// featureService.processFeatureForExcel(list, excel, workDate, userId, "uploadFeatures");	
			}else if("prodFeature".equals(uploadCmd)){//Product 별 Feature 정보 일괄 엑셀 등록 처리
				// featureService.processProdFeatureForExcel(list, excel, workDate, userId, "uploadProductFeatures");	
			}else if("parameter".equals(uploadCmd)){//Parameter 정보 일괄 엑셀 등록 처리
				parameterService.processParameterForExcel(list, excel, workDate, userId, "uploadParameters");	
			}else if("cmdParameter".equals(uploadCmd)){//Command Parameter 정보 일괄 엑셀 등록 처리
				parameterService.processCmdParamForExcel(list, excel, workDate, userId, "uploadCommandParameters");	
			}else if("command".equals(uploadCmd)){//Command 정보 일괄 엑셀 등록 처리
				commandService.processCommandForExcel(list, excel, workDate, userId, "uploadCommandParameters");	
			}else if("sourceCmd".equals(uploadCmd)){//Source Command 정보 일괄 엑셀 등록 처리
				mapService.processSourceCmdForExcel(list, excel, workDate, userId, "uploadSourceCommands");	
			}else if("targetCmd".equals(uploadCmd)){//Target Command 정보 일괄 엑셀 등록 처리
				mapService.processTargetCmdForExcel(list, excel, workDate, userId, "uploadTargetCommands");	
			}else if("mapParameter".equals(uploadCmd)){// Pamameter Map 정보 일괄 엑셀 등록 처리
				mapService.processMapParameterForExcel(list, excel, workDate, userId, "uploadMapParameter");	
			}
			
		}catch(AcubeException e){
			return new Result(ResultCode.FAIL, e.toString(), list);
		}
		return new Result(ResultCode.SUCCESS, list);
	}
}