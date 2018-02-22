package com.cyril.wechat.common;

/**
 * 微信配置 properties Key枚举
 * 
 * @author Cyril
 * @date 2018年2月20日
 */
public enum WechatPropertiesKeyEnum {
	HTTPCLIENT_CONNECTION_TIMEOUT("httpclient.connection.timeout"),
	HTTPCLIENT_SO_TIMEOUT("httpclient.so.timeout"),
	HTTPCLIENT_DEFAULT_MAX_CONNECTIONS_PER_HOST("httpclient.default.max.connections.per.host"),
	HTTPCLIENT_MAX_TOTAL_CONNECTIONS("httpclient.max.total.connections"),
	HTTPCLIENT_CHATSET("httpclient.charset"),
	WECHAT_DOMAIN_NAME("wechat.domain.name");
	
	private final String propertiesKey;

	private WechatPropertiesKeyEnum(String propertiesKey) {
		this.propertiesKey = propertiesKey;
	}

	public String getPropertiesKey() {
		return propertiesKey;
	}
}