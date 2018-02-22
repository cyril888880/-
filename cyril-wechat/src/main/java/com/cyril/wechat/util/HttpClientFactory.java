package com.cyril.wechat.util;

import com.cyril.wechat.helper.HttpClientHelper;
import com.cyril.wechat.util.ObjectUtil;
import com.cyril.wechat.util.PropertiesUtil;
import static com.cyril.wechat.common.WechatPropertiesKeyEnum.*;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.MultiThreadedHttpConnectionManager;
import org.apache.commons.httpclient.params.HttpClientParams;
import org.apache.commons.httpclient.params.HttpMethodParams;

/**
 * HttpClient工厂
 * 
 * @author Cyril
 * @date 2018年2月20日
 */
class HttpClientFactory {
	private static HttpClientFactory instance;
	private static final String WECHAT_CONFIG = "wechat.properties";
	private HttpClientHelper helper;
	
	static HttpClientFactory getInstance() {
		if(ObjectUtil.isEmpty(instance)) {
			synchronized (HttpClientFactory.class) {
				if(ObjectUtil.isEmpty(instance)) {
					instance = new HttpClientFactory();
				}
			}
		}
		
		return instance;
	}
	
	private HttpClientFactory() {
		initialize();
	}
	
	private void initialize() {
		this.helper = new HttpClientHelper();
		this.helper.setConnectionTimeOut(PropertiesUtil.getPropertyInt(HTTPCLIENT_CONNECTION_TIMEOUT.getPropertiesKey(), WECHAT_CONFIG, 30000));
		this.helper.setSoTimeout(PropertiesUtil.getPropertyInt(HTTPCLIENT_SO_TIMEOUT.getPropertiesKey(), WECHAT_CONFIG, 60000));
		this.helper.setDefaultMaxConnectionsPerHost(PropertiesUtil.getPropertyInt(HTTPCLIENT_DEFAULT_MAX_CONNECTIONS_PER_HOST.getPropertiesKey(), WECHAT_CONFIG, 1024));
		this.helper.setMaxTotalConnections(PropertiesUtil.getPropertyInt(HTTPCLIENT_MAX_TOTAL_CONNECTIONS.getPropertiesKey(), WECHAT_CONFIG, 10240));
		this.helper.setCharSet(PropertiesUtil.getPropertyString(HTTPCLIENT_CHATSET.getPropertiesKey(), WECHAT_CONFIG, "UTF-8"));
	}
	
	public HttpClient getHttpClient() {
		MultiThreadedHttpConnectionManager connectionManager = new MultiThreadedHttpConnectionManager();
		connectionManager.getParams().setConnectionTimeout(this.helper.getConnectionTimeOut());
		connectionManager.getParams().setSoTimeout(this.helper.getSoTimeout());
		connectionManager.getParams().setDefaultMaxConnectionsPerHost(this.helper.getDefaultMaxConnectionsPerHost());
		connectionManager.getParams().setMaxTotalConnections(this.helper.getMaxTotalConnections());
		connectionManager.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET, this.helper.getCharSet());
		return new HttpClient(new HttpClientParams(), connectionManager);
	}
}