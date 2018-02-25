package com.cyril.wechat.bean.msg.menu;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.cyril.wechat.bean.msg.WechatBaseMsg;

/**
 * 弹出拍照或者相册发图的事件推送
 * 
 * @author Cyril
 * @date 2018年2月25日
 */
@XmlRootElement(name="xml")
public class WechatMenuPicPhotoOrAlbumEvent extends WechatBaseMsg implements Serializable {
	private static final long serialVersionUID = 4896895847812890444L;

	/**
	 * 事件类型
	 */
	private String event;
	
	/**
	 * 事件KEY值，由开发者在创建菜单时设定
	 */
	private String eventKey;
	
	/**
	 * 发送的图片信息
	 */
	private WechatMenuPicSysphotoSendPicsInfo sendPicsInfo;

	@XmlElement(name="Event")
	public String getEvent() {
		return event;
	}

	@XmlElement(name="EventKey")
	public String getEventKey() {
		return eventKey;
	}

	@XmlElement(name="SendPicsInfo")
	public WechatMenuPicSysphotoSendPicsInfo getSendPicsInfo() {
		return sendPicsInfo;
	}

	public void setSendPicsInfo(WechatMenuPicSysphotoSendPicsInfo sendPicsInfo) {
		this.sendPicsInfo = sendPicsInfo;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public void setEventKey(String eventKey) {
		this.eventKey = eventKey;
	}

	@Override
	public String toString() {
		return "WechatMenuPicPhotoOrAlbumEvent [event=" + event + ", eventKey=" + eventKey + ", sendPicsInfo="
				+ sendPicsInfo + "]";
	}
}