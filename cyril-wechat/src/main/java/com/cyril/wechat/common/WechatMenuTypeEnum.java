package com.cyril.wechat.common;

/**
 * 微信公众号 菜单的响应动作类型枚举
 * 
 * @author Cyril
 * @date 2018年2月22日
 */
public enum WechatMenuTypeEnum {
	VIEW("view", "网页类型"),
	CLICK("click", "点击类型"),
	MINIPROGRAM("miniprogram", "小程序类型");
	
	private WechatMenuTypeEnum(String type, String desc) {
		this.type = type;
		this.desc = desc;
	}

	private final String type;
	
	private final String desc;

	public String getType() {
		return type;
	}

	public String getDesc() {
		return desc;
	}
}