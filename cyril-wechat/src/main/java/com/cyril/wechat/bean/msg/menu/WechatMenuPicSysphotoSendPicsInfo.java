package com.cyril.wechat.bean.msg.menu;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

/**
 * 发送的图片信息
 * 
 * @author Cyril
 * @date 2018年2月25日
 */
public class WechatMenuPicSysphotoSendPicsInfo implements Serializable {
	private static final long serialVersionUID = 7636693844542881388L;

	/**
	 * 发送的图片数量
	 */
	private int count;

	/**
	 * 图片集合
	 */
	private WechatMenuPicList picList;
	
	@XmlElement(name="Count")
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@XmlElement(name="PicList")
	public WechatMenuPicList getPicList() {
		return picList;
	}

	public void setPicList(WechatMenuPicList picList) {
		this.picList = picList;
	}

	@Override
	public String toString() {
		return "WechatMenuPicSysphotoSendPicsInfo [count=" + count + ", picList=" + picList + "]";
	}
}