package com.acube.common.util;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.ws.http.HTTPException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpVersion;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;

import com.acube.common.exception.AcubeException;

public class WebServiceUtil {

	private static Logger logger = LoggerFactory.getLogger(WebServiceUtil.class);

	public static String post(String url, NameValuePair[] nameValuePairs) throws IOException {

		String result = "";
		HttpClient client = new HttpClient();
		PostMethod postMethod = null;
		try {

			if (logger.isInfoEnabled()) {
				String param = "";
				for (NameValuePair nameValuePair : nameValuePairs) {
					param += nameValuePair.getName() + "=" + nameValuePair.getValue() + ", ";
				}
				logger.info("Call Url = " + url + ", Data :: " + param);
			}

			client.getParams().setParameter("http.useragent", "Test Client");

			postMethod = new PostMethod(url);

			// postMethod.setRequestHeader("Content-Type",
			// "application/json; charset=UTF-8");
			// postMethod.setRequestHeader("Content-Type",
			// "text/html; charset=UTF-8");
			// postMethod.addRequestHeader("Content-Type",
			// "multipart/form-data");

			postMethod.setRequestHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
			if (nameValuePairs != null) {
				postMethod.setRequestBody(nameValuePairs);
			}

			client.getParams().setParameter("http.protocol.version", HttpVersion.HTTP_1_0);
			// Execute the method
			int statusCode = client.executeMethod(postMethod);
			if (statusCode == 200) {
				if (logger.isDebugEnabled()) {
					logger.debug("result = " + postMethod.getResponseBodyAsString());
				}

				result = postMethod.getResponseBodyAsString();
			}
			postMethod.releaseConnection();
			if (logger.isDebugEnabled()) {
				logger.debug("statusCode=" + statusCode);
			}
			// Write the body, flush and close

		} catch (HttpException e) {
			if (logger.isErrorEnabled()) {
				logger.error("post", e);
			}
			logger.error("Oops, something went wrong in the HTTP proxy, " + e.toString());
			throw new AcubeException(e.toString());
		} catch (Exception e) {
			if (logger.isErrorEnabled()) {
				logger.error("post", e);
			}
			logger.error("Oops, error, " + e.toString());
			throw new AcubeException(e.toString());
		} finally {
			if (postMethod != null)
				postMethod.releaseConnection();
		}
		return result;
	}

	public static Map<String, Object> postJson(String url, String jsonData) {

		if (logger.isInfoEnabled()) {
			logger.info("Call Url = " + url + ", Json Data :: " + jsonData);
		}
		Map<String, Object> ret = new HashMap<String, Object>();

		HttpClient client = new HttpClient();
		PostMethod postMethod = null;
		try {

			client.getParams().setParameter("http.useragent", "Test Client");

			postMethod = new PostMethod(url);
			postMethod.setRequestHeader("Content-Type", "application/json; charset=UTF-8");
			StringRequestEntity requestEntity = new StringRequestEntity(jsonData, "application/json", "UTF-8");
			postMethod.setRequestEntity(requestEntity);

			client.getParams().setParameter("http.protocol.version", HttpVersion.HTTP_1_0);
			// Execute the method
			int statusCode = client.executeMethod(postMethod);

			String response = postMethod.getResponseBodyAsString();
			String loggingResponse = response;
			if (logger.isInfoEnabled()) {
				if (loggingResponse.length() > 2000) {
					loggingResponse = response.substring(0, 2000) + "  .....";
				}
				logger.info("[statusCode::" + statusCode + ", response::" + loggingResponse);
			}

			if (statusCode / 100 == 2) {
				ret.put("status", HttpStatus.Series.SUCCESSFUL.value());
			} else if (statusCode / 100 == 4) {
				ret.put("status", HttpStatus.Series.CLIENT_ERROR.value());
			} else if (statusCode / 100 == 5) {
				ret.put("status", HttpStatus.Series.SERVER_ERROR.value());
			}

			ret.put("response", response);

			if (logger.isDebugEnabled()) {
				logger.debug("###" + ret);
			}
			postMethod.releaseConnection();

		} catch (HttpException e) {
			if (logger.isErrorEnabled()) {
				logger.error("postJson", e);
			}
			logger.error("Oops, something went wrong in the HTTP proxy, " + e.toString());
			throw new AcubeException(e.toString());
		} catch (Exception e) {
			if (logger.isErrorEnabled()) {
				logger.error("postJson", e);
			}
			logger.error("Oops, error, " + e.toString());
			throw new AcubeException("Exception Occur");
		} finally {
			if (postMethod != null)
				postMethod.releaseConnection();
		}

		return ret;
	}

	public static String get(String url) throws IOException {

		String result = "";
		HttpClient client = new HttpClient();
		GetMethod getMethod = null;
		try {
			if (logger.isInfoEnabled()) {
				logger.info("Call Url = " + url);
			}
			client.getParams().setParameter("http.useragent", "Test Client");

			getMethod = new GetMethod(url);
			client.getParams().setParameter("http.protocol.version", HttpVersion.HTTP_1_0);
			int statusCode = client.executeMethod(getMethod);

			if (statusCode == 200) {
				if (logger.isDebugEnabled()) {
					logger.debug("result = " + getMethod.getResponseBodyAsString());
				}
				result = getMethod.getResponseBodyAsString();
			}
			getMethod.releaseConnection();
			if (logger.isDebugEnabled()) {
				logger.debug("statusCode=" + statusCode);
			}
			// Write the body, flush and close

		} catch (HttpException e) {
			if (logger.isErrorEnabled()) {
				logger.error("get", e);
			}
			logger.error("Oops, something went wrong in the HTTP proxy, " + e.toString());
			throw new AcubeException(e.toString());
		} catch (Exception e) {
			if (logger.isErrorEnabled()) {
				logger.error("get", e);
			}
			logger.error("Oops, error, " + e.toString());
			throw new AcubeException(e.toString());

		} finally {
			if (getMethod != null)
				getMethod.releaseConnection();
		}
		return result;
	}

	public static String sendJSONByGetMethod(String url, NameValuePair[] nameValuePairs) throws IOException {

		String result = "";
		HttpClient client = new HttpClient();
		GetMethod getMethod = null;
		try {

			if (logger.isInfoEnabled()) {
				String param = "";
				for (NameValuePair nameValuePair : nameValuePairs) {
					param += nameValuePair.getName() + "=" + nameValuePair.getValue() + ", ";
				}
				logger.info("Call Url = " + url + ", Data :: " + param);
			}

			client.getParams().setParameter("http.useragent", "Test Client");

			getMethod = new GetMethod(url);
			getMethod.setRequestHeader("Content-Type", "application/json; charset=UTF-8");

			getMethod.setQueryString(nameValuePairs);
			client.getParams().setParameter("http.protocol.version", HttpVersion.HTTP_1_0);
			int statusCode = client.executeMethod(getMethod);

			if (statusCode == 200) {
				if (logger.isDebugEnabled()) {
					logger.debug("result = " + getMethod.getResponseBodyAsString());
				}
				result = getMethod.getResponseBodyAsString();
			}
			getMethod.releaseConnection();
			if (logger.isDebugEnabled()) {
				logger.debug("statusCode=" + statusCode);
			}
			// Write the body, flush and close

		} catch (HTTPException e) {
			if (logger.isErrorEnabled()) {
				logger.error("sendJSONByGetMethod", e);
			}
			logger.error("Oops, something went wrong in the HTTP proxy, " + e.toString());
			throw new AcubeException(e.toString());
		} catch (Exception e) {
			if (logger.isErrorEnabled()) {
				logger.error("sendJSONByGetMethod", e);
			}
			logger.error("Oops, error, " + e.toString());
			throw new AcubeException(e.toString());
		} finally {
			if (getMethod != null)
				getMethod.releaseConnection();
		}
		return result;
	}
}
