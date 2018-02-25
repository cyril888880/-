package com.cyril.wechat.bean.msg.menu;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.cyril.wechat.bean.msg.WechatBaseMsg;

/**
 * 点击菜单拉取消息时的事件推送
 * 
 * @author Cyril
 * @date 2018年2月23日
 */
@XmlRootElement(name="xml")
public class WechatMenuClickEvent extends WechatBaseMsg implements Serializable {
	private static final long serialVersionUID = -870784873804787402L;

	/**
	 * 事件类型
	 */
	private String event;
	
	/**
	 * 事件KEY值，与自定义菜单接口中KEY值对应
	 */
	private String eventKey;

	@XmlElement(name="Event")
	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	@XmlElement(name="EventKey")
	public String getEventKey() {
		return eventKey;
	}

	public void setEventKey(String eventKey) {
		this.eventKey = eventKey;
	}

	@Override
	public String toString() {
		return "WechatMenuClickEvent [event=" + event + ", eventKey=" + eventKey + "]";
	}
}