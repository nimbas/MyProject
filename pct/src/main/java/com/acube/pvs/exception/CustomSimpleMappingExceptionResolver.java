package com.acube.pvs.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

public class CustomSimpleMappingExceptionResolver extends SimpleMappingExceptionResolver {

	public CustomSimpleMappingExceptionResolver (){
		super();
	}
		 
	@Override
	protected ModelAndView doResolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex){
		 
	    ModelAndView modelAndView = super.doResolveException(request, response, handler, ex);
	    
	    modelAndView.getModelMap().addAttribute("errorMessage", ex.getMessage());       
	    return modelAndView;
	}
}
