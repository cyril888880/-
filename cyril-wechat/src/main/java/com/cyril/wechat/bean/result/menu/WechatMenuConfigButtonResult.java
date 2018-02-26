package com.cyril.wechat.bean.result.menu;

import java.io.Serializable;

/**
 * 菜单按钮
 * 
 * @author Cyril
 * @date 2018年2月26日
 */
public class WechatMenuConfigButtonResult implements Serializable {
	private static final long serialVersionUID = 7405726180783146392L;

	/**
	 * 菜单的类型
	 */
	private String type;
	
	/**
	 * 菜单名称
	 */
	private String name;
	
	/**
	 * 对于不同的菜单类型，value的值意义不同
	 */
	private String value;
	
	/**
	 * 对于不同的菜单类型，value的值意义不同
	 */
	private String url;
	
	/**
	 * 对于不同的菜单类型，value的值意义不同
	 */
	private String key;
	
	/**
	 * 子菜单
	 */
	private WechatMenuConfigSubButtonResullt sub_button;
	
	/**
	 * 图文消息的信息
	 */
	private WechatMenuConfigNewsInfoResullt news_info;
	
	/**
	 * 图文消息的标题
	 */
	private String title;
	
	/**
	 * 摘要
	 */
	private String digest;
	
	/**
	 * 作者
	 */
	private String author;
	
	/**
	 * 是否显示封面，0为不显示，1为显示
	 */
	private String show_cover;
	
	/**
	 * 封面图片的URL
	 */
	private String cover_url;
	
	/**
	 * 正文的URL
	 */
	private String content_url;
	
	/**
	 * 原文的URL，若置空则无查看原文入口
	 */
	private String source_url;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public WechatMenuConfigSubButtonResullt getSub_button() {
		return sub_button;
	}

	public void setSub_button(WechatMenuConfigSubButtonResullt sub_button) {
		this.sub_button = sub_button;
	}

	public WechatMenuConfigNewsInfoResullt getNews_info() {
		return news_info;
	}

	public void setNews_info(WechatMenuConfigNewsInfoResullt news_info) {
		this.news_info = news_info;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDigest() {
		return digest;
	}

	public void setDigest(String digest) {
		this.digest = digest;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getShow_cover() {
		return show_cover;
	}

	public void setShow_cover(String show_cover) {
		this.show_cover = show_cover;
	}

	public String getCover_url() {
		return cover_url;
	}

	public void setCover_url(String cover_url) {
		this.cover_url = cover_url;
	}

	public String getContent_url() {
		return content_url;
	}

	public void setContent_url(String content_url) {
		this.content_url = content_url;
	}

	public String getSource_url() {
		return source_url;
	}

	public void setSource_url(String source_url) {
		this.source_url = source_url;
	}

	@Override
	public String toString() {
		return "WechatMenuConfigButtonResult [type=" + type + ", name=" + name + ", value=" + value + ", url=" + url
				+ ", key=" + key + ", sub_button=" + sub_button + ", news_info=" + news_info + ", title=" + title
				+ ", digest=" + digest + ", author=" + author + ", show_cover=" + show_cover + ", cover_url="
				+ cover_url + ", content_url=" + content_url + ", source_url=" + source_url + "]";
	}
}