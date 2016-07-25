package com.acube.pvs.service;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.multipart.MultipartFile;

import com.acube.common.domain.BaseDomain;


public interface ExcelService {
	List<Object> processExcel(File excelFile, int sheet, Class<? extends BaseDomain> clazz);
	List<Object> processExcel(File excelFile, String sheetName, Class<? extends BaseDomain> clazz);
	/**
	 * @param request
	 * @return
	 * @throws IOException
	 * @throws Exception
	 */
	File upload(HttpServletRequest request) ;
	/**
	 * @param request
	 * @param path
	 * @return
	 * @throws IOException
	 * @throws Exception
	 */
	File upload(HttpServletRequest request, String path) ;
	/**
	 * @param response
	 * @param filepath
	 * @param orgFileName
	 */
	void download(HttpServletResponse response, String filepath, String orgFileName);
	/**
	 * @param request
	 * @return
	 * @throws IOException
	 * @throws Exception
	 */
	List<MultipartFile> uploadFiles(HttpServletRequest request) ;
	/**
	 * @param multipartFile
	 * @return
	 */
	File saveFile(MultipartFile multipartFile);
}
