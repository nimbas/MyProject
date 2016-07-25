package com.acube.pvs.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.simple.JSONValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.acube.common.domain.BaseDomain;
import com.acube.common.exception.AcubeException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class ExcelServiceImpl implements ExcelService{
	
	@Value("#{pvsProp['attach.temp.path']}") private String uploadTemporayPath ;
	private static final String DEFAULT_FILEINPUT_NAME = "attach";
	
	private final static Logger logger = LoggerFactory.getLogger(ExcelServiceImpl.class);
	
	@PostConstruct
	public void init() {
		File destinationPath = new File(uploadTemporayPath);

		if(!destinationPath.exists()){
			destinationPath.mkdirs();

			if (logger.isDebugEnabled()) {
				logger.debug("init : directroy " + destinationPath + " maked.");
			}
		}else{
			// 초기 임시 저장소 clear한다. 
			File destination = new File(uploadTemporayPath);
			if(destination.isDirectory()){
				for(File file : destination.listFiles()){
					file.delete();
				}
			}
		}
	}
	
	/**
	* {@inheritDoc}
	*/
	@Override
	public List<Object> processExcel(File excelFile, String sheetName, Class<? extends BaseDomain> clazz) {
		
		List<Object> excelList = new ArrayList<Object>();
		//List<String> headerMap = new ArrayList<String>();
		HashMap<String, String> headerMap = new HashMap<String, String>();
		try {
	        FileInputStream file = new FileInputStream(excelFile);
	        //Create Workbook instance holding reference to .xlsx file
	        Workbook workbook = new XSSFWorkbook(file); //HSSF : Office 2007+ XML.
	        
	        Sheet sheet = workbook.getSheet(sheetName);
	        
	        FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator();
	        
	        //Iterate through each rows one by one
	        Iterator<Row> rowIterator = sheet.iterator();
	        
	        int idx = 0 ;
	        boolean header = false ;
	        while (rowIterator.hasNext()) {
	            Row row = rowIterator.next();
	            //For each row, iterate through all the columns
	            Iterator<Cell> cellIterator = row.cellIterator();
	            if(!header) {
	            	while (cellIterator.hasNext()) {
	            		Cell cell = cellIterator.next();
	            		cell.setCellType(Cell.CELL_TYPE_STRING);
	            		headerMap.put(""+cell.getColumnIndex(), cell.getStringCellValue());
		            }
	            	idx ++ ;
	            	if(idx == 2){
	            		header = true;
	            	}
	            }else{
	            	HashMap<String, String> dataMap = new HashMap<String, String>();
		            while (cellIterator.hasNext()) {	            	
		            	
		                Cell cell = cellIterator.next();
		                cell.setCellType(Cell.CELL_TYPE_STRING);
		                dataMap.put(headerMap.get(""+cell.getColumnIndex()), cell.getStringCellValue());
		            }
		            String jsonText = JSONValue.toJSONString(dataMap);
		            ObjectMapper om = new ObjectMapper();
		            String className = clazz.getName();
		            Object obj = (Object)om.readValue(jsonText, Class.forName(className));
		            excelList.add(obj);
	            }
	        }
	        file.close();
	    }
	    catch (Exception e) {
	    	if(logger.isErrorEnabled()){
	    		logger.error("ERR", e);
	    	}
	    }
		return excelList;
	}

	/**
	* {@inheritDoc}
	*/
	@Override
	public List<Object> processExcel(File excelFile, int sheetNum, Class<? extends BaseDomain> clazz) {
		List<Object> excelList = new ArrayList<Object>();
		//List<String> headerMap = new ArrayList<String>();
		HashMap<String, String> headerMap = new HashMap<String, String>();
		try {
	        FileInputStream file = new FileInputStream(excelFile);
	        //Create Workbook instance holding reference to .xlsx file
	        Workbook workbook = new XSSFWorkbook(file); //HSSF : Office 2007+ XML.
	        
	        Sheet sheet = workbook.getSheetAt(sheetNum);
	        
	        FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator();
	        
	        //Iterate through each rows one by one
	        Iterator<Row> rowIterator = sheet.iterator();
	        
	        boolean header = false ;
	        while (rowIterator.hasNext()) {
	            Row row = rowIterator.next();
	            //For each row, iterate through all the columns
	            Iterator<Cell> cellIterator = row.cellIterator();
	            if(!header) {
	            	while (cellIterator.hasNext()) {
	            		Cell cell = cellIterator.next();
	            		cell.setCellType(Cell.CELL_TYPE_STRING);
	            		//headerMap.add(cell.getStringCellValue());
	            		headerMap.put(""+cell.getColumnIndex(), cell.getStringCellValue());
		            }
	            	header = true;
	            }else{
	            	HashMap<String, String> dataMap = new HashMap<String, String>();
		            while (cellIterator.hasNext()) {	            	
		            	
		                Cell cell = cellIterator.next();
		                cell.setCellType(Cell.CELL_TYPE_STRING);
		                dataMap.put(headerMap.get(""+cell.getColumnIndex()), cell.getStringCellValue());
		            }
		            String jsonText = JSONValue.toJSONString(dataMap);
		            ObjectMapper om = new ObjectMapper();
		            String className = clazz.getName();
		            Object obj = (Object)om.readValue(jsonText, Class.forName(className));
		            excelList.add(obj);
	            }
	            System.out.println("");
	        }
	        file.close();
	    }
	    catch (Exception e){
	    	if(logger.isErrorEnabled()){
	    		logger.error("ERR", e);
	    	}
	    }
		return excelList;
	}
	
	/**
	* {@inheritDoc}
	*/
	@Override
	public File upload(HttpServletRequest request)  {
		return upload(request, uploadTemporayPath);
	}

	/**
	* {@inheritDoc}
	*/
	@Override
	public File upload(HttpServletRequest request, String path)  {
		File retFile = null ;
		try {
			MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
			MultipartFile multipartFile = multipartRequest.getFile(DEFAULT_FILEINPUT_NAME);

			File destinationPath = new File(path);

			if (logger.isDebugEnabled()) {
				logger.debug(" upload : fileList = " + multipartFile );
			}
			if (multipartFile != null && !multipartFile.isEmpty()) {
				retFile = getAttachFileList(destinationPath, multipartFile);
				
				
				// 파일이 복사될 위치 지정.
				/*File destination = new File(uploadTemporayPath+ "/war/" + multipartFile.getOriginalFilename());
				FileCopyUtils.copy(multipartFile.getInputStream(), new FileOutputStream(destination));*/
				
			}
		} catch (Exception e) {
			if(logger.isErrorEnabled()){
	    		logger.error("ERR", e);
	    	}
			throw new AcubeException(e.toString());
		}
		return retFile ;
	}
	
	/**
	* {@inheritDoc}
	*/
	@Override
	public void download(HttpServletResponse response, String filepath, String orgFileName) {
		FileInputStream fis = null;
		try {
			response.setHeader("Content-Disposition",
					"attachment;fileName=\"" + StringUtils.replace(orgFileName, "+", "%20")
							+ "\";");
			File file = new File(filepath);
			response.setContentType("application/octet-stream");
			response.setContentLength((int) file.length());
			response.setHeader("Content-Transfer-Encoding", "binary");
			OutputStream out;
			out = response.getOutputStream();
			fis = new FileInputStream(file);
			FileCopyUtils.copy(fis, out);
			out.flush();
		} catch (Exception e) {
			if(logger.isErrorEnabled()){
	    		logger.error("ERR", e);
	    	}
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	private File getAttachFileList(File destinationPath, MultipartFile multipartFile) 
	throws IOException, FileNotFoundException, Exception {
		
		File destination = null ;
		try {
			if (logger.isDebugEnabled()) {
				logger.debug("fileName=" + multipartFile.getOriginalFilename() 
						+ ", fileSize=" + multipartFile.getSize());
			}

			if (!multipartFile.isEmpty()) {
				// 파일이 복사될 위치 지정.
				destination = File.createTempFile("file", multipartFile.getName(),
						destinationPath);
				FileCopyUtils.copy(multipartFile.getInputStream(),new FileOutputStream(destination));

			}
		} catch (Exception e) {
			if(logger.isErrorEnabled()){
	    		logger.error("ERR", e);
	    	}
			throw e;
		}
		return destination ;
	}

	/**
	* {@inheritDoc}
	*/
	@Override
	public List<MultipartFile> uploadFiles(HttpServletRequest request) {
		try {
			MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
			List<MultipartFile> multipartFiles = multipartRequest.getFiles(DEFAULT_FILEINPUT_NAME);
			return multipartFiles ;
		} catch (Exception e) {
			if(logger.isErrorEnabled()){
	    		logger.error("ERR", e);
	    	}
			throw new AcubeException(e.toString());
		}		
	}
	
	/**
	* {@inheritDoc}
	*/
	@Override
	public File saveFile(MultipartFile multipartFile)  {
		File retFile = null ;
		try {

			File destinationPath = new File(uploadTemporayPath);

			if (logger.isDebugEnabled()) {
				logger.debug(" upload : fileList = " + multipartFile );
			}
			if (multipartFile != null && !multipartFile.isEmpty()) {
				retFile = getAttachFileList(destinationPath, multipartFile);
				
				
				// 파일이 복사될 위치 지정.
				/*File destination = new File(uploadTemporayPath+ "/war/" + multipartFile.getOriginalFilename());
				FileCopyUtils.copy(multipartFile.getInputStream(), new FileOutputStream(destination));*/
				
			}
		} catch (Exception e) {
			if(logger.isErrorEnabled()){
	    		logger.error("ERR", e);
	    	}
			throw new AcubeException(e.toString());
		}
		return retFile ;
	}
	
}
