package com.cyril.wechat.common;

/**
 * 微信错误枚举
 * 
 * @author Cyril
 * @date 2018年2月19日
 */
public enum WechatErrorEnum {
	SYSTEM_ERROR(-2, "系统错误");//系统内部错误, 与微信无关
	
	WechatErrorEnum(int code, String desc) {
		this.code = code;
		this.desc = desc;
	}
	
	private final int code;
	
	private final String desc;

	public int getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}
}