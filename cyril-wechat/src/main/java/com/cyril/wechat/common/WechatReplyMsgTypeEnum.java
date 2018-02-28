package com.cyril.wechat.common;

/**
 * 微信被动回复消息类型枚举
 * 
 * @author Cyril
 * @date 2018年2月28日
 */
public enum WechatReplyMsgTypeEnum {
	TEXT("text");
	
	/**
	 * 回复消息类型
	 */
	private final String type;
	
	private WechatReplyMsgTypeEnum(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}
}