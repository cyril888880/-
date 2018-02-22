package com.cyril.wechat.common;

/**
 * properties文件名枚举
 * @author Cyril
 * @date 2018年2月22日
 */
public enum WechatPropertiesFileNameEnum {
	WECHAT("wechat.properties"),
	WECHAT_URL("wechaturl.properties");
	
	private WechatPropertiesFileNameEnum(String name) {
		this.name = name;
	}

	private final String name;

	public String getName() {
		return name;
	}
}