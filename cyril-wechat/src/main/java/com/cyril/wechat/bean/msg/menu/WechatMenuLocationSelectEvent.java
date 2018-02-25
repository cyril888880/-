package com.cyril.wechat.bean.msg.menu;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.cyril.wechat.bean.msg.WechatBaseMsg;

/**
 * 弹出地理位置选择器的事件推送
 * 
 * @author Cyril
 * @date 2018年2月23日
 */
@XmlRootElement(name="xml")
public class WechatMenuLocationSelectEvent extends WechatBaseMsg implements Serializable {
	private static final long serialVersionUID = 5075242530619997582L;

	/**
	 * 事件类型
	 */
	private String event;
	
	/**
	 * 事件KEY值，设置的跳转URL
	 */
	private String eventKey;
	
	/**
	 * 发送的位置信息
	 */
	private WechatMenuSendLocationInfo sendLocationInfo;

	@XmlElement(name="Event")
	public String getEvent() {
		return event;
	}

	@XmlElement(name="EventKey")
	public String getEventKey() {
		return eventKey;
	}

	@XmlElement(name="SendLocationInfo")
	public WechatMenuSendLocationInfo getSendLocationInfo() {
		return sendLocationInfo;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public void setEventKey(String eventKey) {
		this.eventKey = eventKey;
	}

	public void setSendLocationInfo(WechatMenuSendLocationInfo sendLocationInfo) {
		this.sendLocationInfo = sendLocationInfo;
	}

	@Override
	public String toString() {
		return "WechatMenuLocationSelectEvent [event=" + event + ", eventKey=" + eventKey + ", SendLocationInfo="
				+ sendLocationInfo + "]";
	}
}