package com.cyril.wechat.common;

/**
 * 微信API URL properties Key枚举
 * 
 * @author Cyril
 * @date 2018年2月20日
 */
public enum WechatUrlPropertiesKeyEnum {
	GLOBAL_ACCESS_TOKEN_URL("GLOBAL.ACCESS.TOKEN.URL");
	
	private WechatUrlPropertiesKeyEnum(String key) {
		this.key = key;
	}

	private final String key;

	public String getKey() {
		return key;
	}
}