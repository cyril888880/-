package com.cyril.wechat.common;

/**
 * 微信公众号 菜单的响应动作类型枚举
 * 
 * @author Cyril
 * @date 2018年2月22日
 */
public enum WechatMenuTypeEnum {
	CLICK("click"),
	VIEW("view"),
	SCANCODE_PUSH("scancode_push"),
	SCANCODE_WAITMSG("scancode_waitmsg"),
	PIC_SYSPHOTO("pic_sysphoto"),
	PIC_PHOTO_OR_ALBUM("pic_photo_or_album"),
	PIC_WEXIN("pic_weixin"),
	LOCATION_SELECT("location_select"),
	MEDIA_ID("media_id"),
	VIEW_LIMITED("view_limited"),
	MINIPROGRAM("miniprogram");
	
	private WechatMenuTypeEnum(String type) {
		this.type = type;
	}

	private final String type;
	
	public String getType() {
		return type;
	}
}