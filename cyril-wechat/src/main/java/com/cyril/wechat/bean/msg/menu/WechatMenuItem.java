package com.cyril.wechat.bean.msg.menu;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

/**
 * 图片Item
 * @author Cyril
 * @date 2018年2月25日
 */
public class WechatMenuItem implements Serializable {
	private static final long serialVersionUID = -4413049939744415728L;
	
	/**
	 * 图片的MD5值，开发者若需要，可用于验证接收到图片
	 */
	private String picMd5Sum;

	@XmlElement(name="PicMd5Sum")
	public String getPicMd5Sum() {
		return picMd5Sum;
	}

	public void setPicMd5Sum(String picMd5Sum) {
		this.picMd5Sum = picMd5Sum;
	}

	@Override
	public String toString() {
		return "WechatMenuItem [picMd5Sum=" + picMd5Sum + "]";
	}
}