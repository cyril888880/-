package com.cyril.wechat.bean.msg.event;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.cyril.wechat.bean.msg.WechatBaseMsg;

/**
 * 关注事件
 * 
 * @author Cyril
 * @date 2018年2月28日
 */
@XmlRootElement(name="xml")
public class WechatSubscribeEvent extends WechatBaseMsg implements Serializable {
	private static final long serialVersionUID = -5809302826594508572L;

	/**
	 * 事件类型
	 */
	private String event;

	/**
	 * 事件KEY值，qrscene_为前缀，后面为二维码的参数值
	 * 仅扫码关注时出现
	 */
	private String eventKey;
	
	/**
	 * 二维码的ticket，可用来换取二维码图片
	 * 仅扫码关注时出现
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