package com.cyril.wechat.bean.msg.menu;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

/**
 * 弹出地理位置选择器的事件推送
 * 
 * @author Cyril
 * @date 2018年2月25日
 */
public class WechatMenuSendLocationInfo implements Serializable {
	private static final long serialVersionUID = 6745283622734035028L;

	/**
	 * X坐标信息
	 */
	private String locationX;
	
	/**
	 * Y坐标信息
	 */
	private String locationY;
	
	/**
	 * 精度，可理解为精度或者比例尺、越精细的话 scale越高
	 */
	private String scale;
	
	/**
	 * 地理位置的字符串信息
	 */
	private String label;
	
	/**
	 * 朋友圈POI的名字，可能为空
	 */
	private String poiname;

	@XmlElement(name="Location_X")
	public String getLocationX() {
		return locationX;
	}

	@XmlElement(name="Location_Y")
	public String getLocationY() {
		return locationY;
	}

	@XmlElement(name="Scale")
	public String getScale() {
		return scale;
	}

	@XmlElement(name="Label")
	public String getLabel() {
		return label;
	}

	@XmlElement(name="Poiname")
	public String getPoiname() {
		return poiname;
	}

	@Override
	public String toString() {
		return "WechatMenuSendLocationInfo [locationX=" + locationX + ", locationY=" + locationY + ", scale=" + scale
				+ ", label=" + label + ", poiname=" + poiname + "]";
	}
}