package com.cyril.wechat.bean.msg.event;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.cyril.wechat.bean.msg.WechatBaseMsg;

/**
 * 取消关注事件
 * 
 * @author Cyril
 * @date 2018年2月28日
 */
@XmlRootElement(name="xml")
public class WechatUnsubscribeEvent extends WechatBaseMsg implements Serializable {
	private static final long serialVersionUID = -2532423875123174731L;
	/**
	 * 事件类型
	 */
	private String event;

	@XmlElement(name="Event")
	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	@Override
	public String toString() {
		return "WechatSubscribeEvent [event=" + event + "]";
	}
}