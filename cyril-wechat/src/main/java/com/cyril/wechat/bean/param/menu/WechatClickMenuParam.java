package com.cyril.wechat.bean.param.menu;

import java.io.Serializable;

import com.cyril.wechat.common.WechatMenuTypeEnum;

/**
 * Click类型菜单
 * 点击推事件用户点击click类型按钮后，
 * 微信服务器会通过消息接口推送消息类型为event的结构给开发者（参考消息接口指南），
 * 并且带上按钮中开发者填写的key值，开发者可以通过自定义的key值与用户进行交互
 * 
 * @author Cyril
 * @date 2018年2月22日
 */
public class WechatClickMenuParam extends WechatBaseMenuParam implements Serializable{
	private static final long serialVersionUID = -8221134346224386839L;

	/**
	 * 菜单的响应动作类型
	 */
	private WechatMenuTypeEnum type = WechatMenuTypeEnum.CLICK;
	
	/**
	 * 菜单KEY值，用于消息接口推送，不超过128字节
	 */
	private String key;
	
	public WechatClickMenuParam() {
		super();
	}

	public WechatClickMenuParam(String name, String key) {
		super(name);
		this.key = key;
	}

	public String getType() {
		return type.getType();
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

}