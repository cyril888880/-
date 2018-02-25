package com.cyril.wechat.bean.msg.menu;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

/**
 * 图片列表
 * 
 * @author Cyril
 * @date 2018年2月25日
 */
public class WechatMenuPicList implements Serializable{
	private static final long serialVersionUID = -5922544491299020959L;
	
	/**
	 * 图片Item集合
	 */
	private List<WechatMenuItem> item;

	@XmlElement(name = "item")
	public List<WechatMenuItem> getItem() {
		return item;
	}

	public void setItem(List<WechatMenuItem> item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "WechatMenuPicList [item=" + item + "]";
	}
}