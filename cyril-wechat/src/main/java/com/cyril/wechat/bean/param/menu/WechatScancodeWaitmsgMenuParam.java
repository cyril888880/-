package com.cyril.wechat.bean.param.menu;

import java.io.Serializable;

import com.cyril.wechat.common.WechatMenuTypeEnum;

/**
 * scancode_waitmsg类型菜单
 * 扫码推事件且弹出“消息接收中”提示框用户点击按钮后，
 * 微信客户端将调起扫一扫工具，完成扫码操作后，将扫码的结果传给开发者，
 * 同时收起扫一扫工具，然后弹出“消息接收中”提示框，随后可能会收到开发者下发的消息
 * 
 * @author Cyril
 * @date 2018年2月23日
 */
public class WechatScancodeWaitmsgMenuParam extends WechatBaseMenuParam implements Serializable {
	private static final long serialVersionUID = 3252514091562938938L;

	/**
	 * 菜单的响应动作类型
	 */
	private WechatMenuTypeEnum type = WechatMenuTypeEnum.SCANCODE_WAITMSG;
	
	/**
	 * 菜单KEY值，用于消息接口推送，不超过128字节
	 */
	private String key;

	public WechatScancodeWaitmsgMenuParam() {
		super();
	}

	public WechatScancodeWaitmsgMenuParam(String name, String key) {
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
		return "WechatScancodeWaitmsgMenuParam [type=" + type + ", key=" + key + "]";
	}
}