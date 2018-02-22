package com.cyril.wechat.common;

/**
 * 微信域名枚举
 * 
 * @author Cyril
 * @date 2018年2月22日
 */
public enum WechatDomainNameEnum {
	GENERAL(0, "https://api.weixin.qq.com/"),
	SHANGHAI(1, "https://sh.api.weixin.qq.com/"),
	SHENZHEN(2, "https://sz.api.weixin.qq.com/"),
	XIANGGANG(3, "https://hk.api.weixin.qq.com/");
	
	
	private final int code;
	
	private final String domainName;

	WechatDomainNameEnum(int code, String domainName) {
		this.code = code;
		this.domainName = domainName;
	}

	public int getCode() {
		return code;
	}

	public String getDomainName() {
		return domainName;
	}
	
	public static WechatDomainNameEnum valueOf(int code) {
		for(WechatDomainNameEnum value : values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		
		return null;
	}
}