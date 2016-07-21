package com.acube.common.exception;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.acube.common.domain.Result;
import com.acube.common.domain.ResultCode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class BaseExceptionResolver implements HandlerExceptionResolver {

	private final static Logger logger = LoggerFactory.getLogger(BaseExceptionResolver.class);

	@Autowired
	private MessageSource messageSource;

	private String view = null;

	private String exceptionName; // 예외 클래스명(패키지명포함)
	private String exceptionSimpleName; // 예외 클래스명(클래스명만)
	private String exceptionDescription; // 예외 메세지 내용

	public void setView(String view) {
		this.view = view;
	}

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {

		exceptionSimpleName = ex.getClass().getSimpleName();
		exceptionName = ex.getClass().getName();
		exceptionDescription = ex.getLocalizedMessage();

		// 시스템정의 예외처리면, 메세지치환처리
		// cause 넘어온 getMessage에는 시스템정의 예외코드를 받음
		// 여기서 나온 예외코드로 시스템정의 상세메세지를 가져옴
		if (ex instanceof AcubeException) {
			setCustomException(exceptionDescription);
		} else {
			setCustomException("err.500");
		}
		Result result = new Result(ResultCode.FAIL, exceptionDescription, new ExceptionMsg(exceptionName, exceptionDescription, ex));

		String resultJson = null;
		try {

			ObjectMapper mapper = new ObjectMapper();
			resultJson = mapper.writeValueAsString(result);

		} catch (Exception e) {
			// e.printStackTrace();
		}

		request.setAttribute("result", result);
		request.setAttribute("exception", resultJson);

		if (handler instanceof HandlerMethod) {
			HandlerMethod maControl = (HandlerMethod) handler;
			Method pmrResolver = (Method) maControl.getMethod();
			Class<?> clss = pmrResolver.getReturnType();
			String clsName = clss.getName();
			// 일단 URL은 리턴형이 String임을 착안한다.
			// 아닌 경우도 있음.. 단순 String을 리턴하는 @ResponseBody인 경우도 있긴한데..
			// 이렇게 작성하지 않도록 가이드할것...
			if ("java.lang.String".equals(clsName)) {
				request.setAttribute("returnType", "view");
			}
		}
		return new ModelAndView(view);
	}

	/**
	 * 시스템정의 예외메세지
	 * 
	 * @param customExceptioinName
	 * @throws NoSuchMessageException
	 * @throws UnsupportedEncodingException
	 */
	public void setCustomException(String customExceptioinName) {

		try {
			exceptionName = customExceptioinName;
			exceptionDescription = messageSource.getMessage(customExceptioinName, null, LocaleContextHolder.getLocale());
		} catch (NoSuchMessageException e) {
			//
		}
	}

}