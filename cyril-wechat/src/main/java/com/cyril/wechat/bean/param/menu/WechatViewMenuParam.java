package com.cyril.wechat.bean.param.menu;

import java.io.Serializable;

import com.cyril.wechat.common.WechatMenuTypeEnum;

/**
 * View类型菜单
 * 跳转URL用户点击view类型按钮后，
 * 微信客户端将会打开开发者在按钮中填写的网页URL，
 * 可与网页授权获取用户基本信息接口结合，获得用户基本信息
 * @author Cyril
 * @date 2018年2月22日
 */
public class WechatViewMenuParam extends WechatBaseMenuParam implements Serializable{
	private static final long serialVersionUID = 1602674274545492453L;

	/**
	 * 菜单的响应动作类型
	 */
	private WechatMenuTypeEnum type = WechatMenuTypeEnum.VIEW;
	
	/**
	 * 网页 链接，用户点击菜单可打开链接，
	 * 不超过1024字节
	 */
	private String url;

	public WechatViewMenuParam() {
		super();
	}

	public WechatViewMenuParam(String name, String url) {
		super(name);
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getType() {
		return type.getType();
	}

	@Override
	public String toString() {
		return "WechatViewMenuParam [type=" + type + ", url=" + url + "]";
	}
}