package com.cyril.wechat.bean.msg.event;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.cyril.wechat.bean.msg.WechatBaseMsg;

/**
 * 用户已关注时扫码事件推送
 * 
 * @author Cyril
 * @date 2018年2月28日
 */
@XmlRootElement(name="xml")
public class WechatScanEvent extends WechatBaseMsg implements Serializable {
	private static final long serialVersionUID = -4933462660647363370L;

	/**
	 * 事件类型
	 */
	private String event;

	/**
	 * 事件KEY值，是一个32位无符号整数，即创建二维码时的二维码scene_id
	 */
	private String eventKey;
	
	/**
	 * 二维码的ticket，可用来换取二维码图片
	 */
	private String ticket;
	
	@XmlElement(name="EventKey")
	public String getEventKey() {
		return eventKey;
	}

	@XmlElement(name="Ticket")
	public String getTicket() {
		return ticket;
	}

	@XmlElement(name="Event")
	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	@Override
	public String toString() {
		return "WechatSubscribeEvent [event=" + event + ", eventKey=" + eventKey + ", ticket=" + ticket + "]";
	}
}