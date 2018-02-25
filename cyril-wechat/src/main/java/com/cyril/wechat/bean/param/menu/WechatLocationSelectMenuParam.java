package com.cyril.wechat.bean.param.menu;

import java.io.Serializable;

import com.cyril.wechat.common.WechatMenuTypeEnum;

/**
 * location_select类型菜单
 * 弹出地理位置选择器用户点击按钮后，微信客户端将调起地理位置选择工具，
 * 完成选择操作后，将选择的地理位置发送给开发者的服务器，
 * 同时收起位置选择工具，随后可能会收到开发者下发的消息
 * @author Cyril
 * @date 2018年2月23日
 */
public class WechatLocationSelectMenuParam extends WechatBaseMenuParam implements Serializable {
	private static final long serialVersionUID = -8673652783411962585L;

	/**
	 * 菜单的响应动作类型
	 */
	private WechatMenuTypeEnum type = WechatMenuTypeEnum.LOCATION_SELECT;
	
	/**
	 * 菜单KEY值，用于消息接口推送，不超过128字节
	 */
	private String key;
	

	public WechatLocationSelectMenuParam() {
		super();
	}

	public WechatLocationSelectMenuParam(String name, String key) {
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
		return "WechatLocationSelectMenuParam [type=" + type + ", key=" + key + "]";
	}
}