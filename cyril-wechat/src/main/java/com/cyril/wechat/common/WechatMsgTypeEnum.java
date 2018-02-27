package com.cyril.wechat.common;

/**
 * 微信推送消息类型
 * 
 * @author Cyril
 * @date 2018年2月23日
 */
public enum WechatMsgTypeEnum {
	EVENT("event"),
	TEXT("text"),
	IMAGE("image"),
	VOICE("voice"),
	VIDEO("video"),
	SHORT_VIDEO("shortvideo"),
	LOCATION("location"),
	LINK("link");
	
	WechatMsgTypeEnum(String type) {
		this.type = type;
	}

	private final String type;

	public String getType() {
		return type;
	}
	
	public static WechatMsgTypeEnum getMsgType(String type) {
		for(WechatMsgTypeEnum value : values()) {
			if(value.getType().equals(type)) {
				return value;
			}
		}
		
		return null;
	}
}