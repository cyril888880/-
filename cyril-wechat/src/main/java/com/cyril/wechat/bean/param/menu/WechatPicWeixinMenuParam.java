package com.cyril.wechat.bean.param.menu;

import java.io.Serializable;

import com.cyril.wechat.common.WechatMenuTypeEnum;

/**
 * pic_weixin类型菜单
 * 弹出微信相册发图器用户点击按钮后，微信客户端将调起微信相册，
 * 完成选择操作后，将选择的相片发送给开发者的服务器，
 * 并推送事件给开发者，同时收起相册，随后可能会收到开发者下发的消息。
 * 
 * @author Cyril
 * @date 2018年2月23日
 */
public class WechatPicWeixinMenuParam extends WechatBaseMenuParam implements Serializable {
	private static final long serialVersionUID = -7661340719748772272L;

	/**
	 * 菜单的响应动作类型
	 */
	private WechatMenuTypeEnum type = WechatMenuTypeEnum.PIC_WEXIN;
	
	/**
	 * 菜单KEY值，用于消息接口推送，不超过128字节
	 */
	private String key;
	
	public WechatPicWeixinMenuParam() {
		super();
	}

	public WechatPicWeixinMenuParam(String name, String key) {
		super(name);
		this.key = key;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getType() {
		return type.getType();
	}

	@Override
	public String toString() {
		return "WechatPicWeixinMenuParam [type=" + type + ", key=" + key + "]";
	}
}