package com.cyril.wechat.bean.param.menu;

import java.io.Serializable;

/**
 * 微信公众号基础菜单参数
 * @author Cyril
 * @date 2018年2月22日
 */
public class WechatBaseMenuParam implements Serializable{
	private static final long serialVersionUID = 8276890297730183322L;
	
	/**
	 * 菜单标题，不超过16个字节，子菜单不超过60个字节
	 */
	private String name;

	public WechatBaseMenuParam() {
		super();
	}

	public WechatBaseMenuParam(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}