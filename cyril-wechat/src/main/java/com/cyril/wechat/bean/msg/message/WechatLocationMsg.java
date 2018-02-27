package com.cyril.wechat.bean.msg.message;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.cyril.wechat.bean.msg.WechatBaseMsg;

/**
 * 地理位置消息
 * 
 * @author Cyril
 * @date 2018年2月27日
 */
@XmlRootElement(name="xml")
public class WechatLocationMsg extends WechatBaseMsg implements Serializable {
	private static final long serialVersionUID = 8760567460595999236L;

	/**
	 * 地理位置维度
	 */
	private String locationX;
	
	/**
	 * 地理位置经度
	 */
	private String locationY;
	
	/**
	 * 地图缩放大小
	 */
	private String scale;
	
	/**
	 * 地理位置信息
	 */
	private String label;
	
	/**
	 * 消息id，64位整型
	 */
	private String msgId;

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

	@XmlElement(name="MsgId")
	public String getMsgId() {
		return msgId;
	}

	public void setLocationX(String locationX) {
		this.locationX = locationX;
	}

	public void setLocationY(String locationY) {
		this.locationY = locationY;
	}

	public void setScale(String scale) {
		this.scale = scale;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	@Override
	public String toString() {
		return "WechatLocationMsg [locationX=" + locationX + ", locationY=" + locationY + ", scale=" + scale
				+ ", label=" + label + ", msgId=" + msgId + "]";
	}
}
