package com.cyril.wechat.bean.param.menu;

import java.io.Serializable;

import com.cyril.wechat.common.WechatMenuTypeEnum;

/**
 * miniprogram类型菜单
 * 打开小程序
 * 
 * @author Cyril
 * @date 2018年2月22日
 */
public class WechatMiniprogramMenuParam extends WechatBaseMenuParam implements Serializable{
	private static final long serialVersionUID = 3968158012627844895L;

	/**
	 * 菜单的响应动作类型
	 */
	private WechatMenuTypeEnum type = WechatMenuTypeEnum.MINIPROGRAM;
	
	/**
	 * 网页 链接，用户点击菜单可打开链接，不超过1024字节，
	 * 不支持小程序的老版本客户端将打开本url
	 */
	private String url;
	
	/**
	 * 小程序的appid（仅认证公众号可配置）
	 */
	private String appId;
	
	/**
	 * 小程序的页面路径
	 */
	private String pagepath;
	
	public WechatMiniprogramMenuParam() {
		super();
	}

	public WechatMiniprogramMenuParam(String name, String url, String appId, String pagepath) {
		super(name);
		this.url = url;
		this.appId = appId;
		this.pagepath = pagepath;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getPagepath() {
		return pagepath;
	}

	public void setPagepath(String pagepath) {
		this.pagepath = pagepath;
	}

	public String getType() {
		return type.getType();
	}

	@Override
	public String toString() {
		return "WechatMiniprogramMenuParam [type=" + type + ", url=" + url + ", appId=" + appId + ", pagepath="
				+ pagepath + "]";
	}
}