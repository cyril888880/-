package com.cyril.wechat.util;

import java.io.UnsupportedEncodingException;
import java.util.Map;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethodBase;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * 发送请求工具类
 * 
 * @author Cyril
 * @date 2018年2月20日
 */
public abstract class HttpClientUtil {
	private static Logger logger = LoggerFactory.getLogger(HttpClientUtil.class);
	private static HttpClient client = null;
	
	static {
		initialize();
	}
	
	private static void initialize() {
		client = HttpClientFactory.getInstance().getHttpClient();
	}
	
	public static <T> T sendPostForWechat(String targetUrl, Map<String, String> params, Class<T> resultClass) {
		return JSONObject.parseObject(sendPostForWechat(targetUrl, params), resultClass);
	}
	
	public static <T> T sendPostForWechat(String targetUrl, String params, Class<T> resultClass) {
		return JSONObject.parseObject(sendPostForWechat(targetUrl, params), resultClass);
	}
	
	public static <T> T sendGetForWechat(String url, Class<T> resultClass) {
		return JSONObject.parseObject(sendGet(url), resultClass);
	}
	
	private static String sendPostForWechat(String targetUrl, Map<String, String> params) {
		return sendPostForWechat(targetUrl, JSON.toJSONString(params));
	}
	
	private static String sendPostForWechat(String targetUrl, String params) {
		return sendPost(targetUrl, params);
	}
	
	private static String sendPost(String targetUrl, String params) {
		Assert.isNotEmpty(targetUrl, "发送Post请求失败, URL为Null!");
		
		try {
			return sendPost(loadPostMethod(targetUrl, params));
		} catch (Exception e) {
			logger.error("发送Post请求失败 : {}", targetUrl);
			return "";
		}
	}
	
	private static String sendPost(PostMethod postMethod) throws Exception {
		try {
			return clientExecuteMethod(postMethod);
		} 
		finally {
			releaseConnection(postMethod);
		}
	}
	
	private static String clientExecuteMethod(HttpMethodBase httpMethodBase) throws Exception {
		client.executeMethod(httpMethodBase);
		String result = httpMethodBase.getResponseBodyAsString();
		
		if(logger.isDebugEnabled()) {
			logger.debug(result);
		}
		
		return result;
	}
	
	private static PostMethod loadPostMethod(String targetUrl, String params) {
		PostMethod postMethod = new PostMethod(targetUrl);
		postMethod.setRequestHeader("Content-Type","application/json;charset=UTF-8");
		postMethod.setRequestEntity(loadRequestEntity(params));
		return postMethod;
	}
	
	private static RequestEntity loadRequestEntity(String params) {
		try {
			return new StringRequestEntity(params, "application/json", "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	private static void releaseConnection(HttpMethodBase httpMethodBase) {
		try {
			if(ObjectUtil.isNotEmpty(httpMethodBase)) {
				httpMethodBase.releaseConnection();
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
	}
	
	private static String sendGet(String targetUrl) {
		Assert.isNotEmpty(targetUrl, "发送Get请求失败, URL为Null!");
		
		try {
			return sendGet(loadGetMethod(targetUrl));
		} catch (Exception e) {
			logger.error("发送GET请求失败 : {}", targetUrl);
			return "";
		}
	}
	
	private static String sendGet(GetMethod getMethod) throws Exception {
		try {
			return clientExecuteMethod(getMethod);
		} 
		finally {
			releaseConnection(getMethod);
		}
	}
	
	private static GetMethod loadGetMethod(String targetUrl) {
		GetMethod getMethod = new GetMethod(targetUrl);
		getMethod.getParams().setContentCharset("UTF-8");
		getMethod.setRequestHeader("Connection", "close");
		return getMethod;
	}
}