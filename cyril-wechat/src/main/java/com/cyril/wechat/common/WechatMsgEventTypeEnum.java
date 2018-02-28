package com.cyril.wechat.common;

/**
 * 微信event类型枚举
 * @author Cyril
 * @date 2018年2月24日
 */
public enum WechatMsgEventTypeEnum {
	CLICK("CLICK", "点击菜单拉取消息时的事件推送"),
	VIEW("VIEW", "点击菜单跳转链接时的事件推送"),
	SCANCODE_PUSH("scancode_push", "扫码推事件的事件推送"),
	SCANCODE_WAITMSG("scancode_waitmsg", "扫码推事件且弹出“消息接收中”提示框的事件推送"),
	PIC_SYSPHOTO("pic_sysphoto", "弹出系统拍照发图的事件推送"),
	PIC_PHOTO_OR_ALBUM("pic_photo_or_album", "弹出拍照或者相册发图的事件推送"),
	PIC_WEIXIN("pic_weixin", "弹出微信相册发图器的事件推送"),
	LOCATION_SELECT("location_select", "弹出地理位置选择器的事件推送"),
	SUBSCRIBE("subscribe", "关注事件"),
	UNSUBSCRIBE("unsubscribe", "取消关注事件"),
	SCAN("SCAN", "用户已关注时扫码事件推送"),
	LOCATION("LOCATION", "上报地理位置事件");
	
	WechatMsgEventTypeEnum(String type, String desc) {
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

	public static WechatMsgEventTypeEnum getMsgEventType(String type) {
		for(WechatMsgEventTypeEnum value : values()) {
			if(value.getType().equals(type)) {
				return value;
			}
		}
		
		return null;
	}
}