package com.cyril.wechat.bean.result.menu;

import java.io.Serializable;
import java.util.List;

/**
 * 微信菜单详情对象
 * 
 * @author Cyril
 * @date 2018年2月23日
 */
public class WechatMenuButtonResult implements Serializable {
	private static final long serialVersionUID = 6961062576224986978L;

	/**
	 * 菜单标题
	 */
	private String name;
	
	/**
	 * 二级菜单数组
	 */
	private List<WechatMenuButtonResult> sub_button;
	
	/**
	 * 菜单的响应动作类型
	 */
	private String type;
	
	/**
	 * 菜单KEY值
	 */
	private String key;
	
	/**
	 * 网页 链接，用户点击菜单可打开链接
	 */
	private String url;
	
	/**
	 * 调用新增永久素材接口返回的合法media_id
	 */
	private String media_id;
	
	/**
	 * 小程序的appid（仅认证公众号可配置）
	 */
	private String appid;
	
	/**
	 * 小程序的页面路径
	 */
	private String pagepath;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<WechatMenuButtonResult> getSub_button() {
		return sub_button;
	}

	public void setSub_button(List<WechatMenuButtonResult> sub_button) {
		this.sub_button = sub_button;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getMedia_id() {
		return media_id;
	}

	public void setMedia_id(String media_id) {
		this.media_id = media_id;
	}

	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getPagepath() {
		return pagepath;
	}

	public void setPagepath(String pagepath) {
		this.pagepath = pagepath;
	}

	@Override
	public String toString() {
		return "WechatMenuButtonResult [name=" + name + ", sub_button=" + sub_button + ", type=" + type + ", key=" + key
				+ ", url=" + url + ", media_id=" + media_id + ", appid=" + appid + ", pagepath=" + pagepath + "]";
	}
}