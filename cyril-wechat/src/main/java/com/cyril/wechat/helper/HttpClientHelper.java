package com.cyril.wechat.helper;

/**
 * HttpClient 辅助类
 * 
 * @author Cyril
 * @date 2018年2月20日
 */
public class HttpClientHelper {
	/**
	 * 连接超时,单位毫秒
	 */
	private int connectionTimeOut;
	
	/**
	 * 读取超时,单位毫秒
	 */
	private int soTimeout;
	
	/**
	 * 设置每个主机的默认最大连接
	 */
	private int defaultMaxConnectionsPerHost;
	
	/**
	 * 设置总连接数
	 */
	private int maxTotalConnections;
	
	/**
	 * 设置获取内容编码
	 */
	private String charSet;

	public int getConnectionTimeOut() {
		return connectionTimeOut;
	}

	public void setConnectionTimeOut(int connectionTimeOut) {
		this.connectionTimeOut = connectionTimeOut;
	}

	public int getSoTimeout() {
		return soTimeout;
	}

	public void setSoTimeout(int soTimeout) {
		this.soTimeout = soTimeout;
	}

	public int getDefaultMaxConnectionsPerHost() {
		return defaultMaxConnectionsPerHost;
	}

	public void setDefaultMaxConnectionsPerHost(int defaultMaxConnectionsPerHost) {
		this.defaultMaxConnectionsPerHost = defaultMaxConnectionsPerHost;
	}

	public int getMaxTotalConnections() {
		return maxTotalConnections;
	}

	public void setMaxTotalConnections(int maxTotalConnections) {
		this.maxTotalConnections = maxTotalConnections;
	}

	public String getCharSet() {
		return charSet;
	}

	public void setCharSet(String charSet) {
		this.charSet = charSet;
	}
}