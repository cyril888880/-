package com.cyril.wechat.bean.msg.menu;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.cyril.wechat.bean.msg.WechatBaseMsg;

/**
 * 点击菜单跳转链接时的事件推送
 * 
 * @author Cyril
 * @date 2018年2月23日
 */
@XmlRootElement(name="xml")
public class WechatMenuViewEvent extends WechatBaseMsg implements Serializable {
	private static final long serialVersionUID = 4086935552160741574L;
	
	/**
	 * 事件类型
	 */
	private String event;
	
	/**
	 * 事件KEY值，设置的跳转URL
	 */
	private String eventKey;
	
	/**
	 * 指菜单ID，如果是个性化菜单，则可以通过这个字段，知道是哪个规则的菜单被点击了。
	 */
	private String menuId;

	@XmlElement(name="Event")
	public String getEvent() {
		return event;
	}

	@XmlElement(name="EventKey")
	public String getEventKey() {
		return eventKey;
	}

	@XmlElement(name="MenuId")
	public String getMenuId() {
		return menuId;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public void setEventKey(String eventKey) {
		this.eventKey = eventKey;
	}

	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}

	@Override
	public String toString() {
		return "WechatMenuViewEvent [event=" + event + ", eventKey=" + eventKey + ", menuId=" + menuId + "]";
	}
}