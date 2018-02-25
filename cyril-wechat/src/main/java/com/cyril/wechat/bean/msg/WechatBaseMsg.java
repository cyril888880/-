package com.cyril.wechat.bean.msg;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

/**
 * 基础微信消息
 * 
 * @author Cyril
 * @date 2018年2月23日
 */
public class WechatBaseMsg implements Serializable {
	private static final long serialVersionUID = 8183144603406845663L;

	/**
	 * 开发者 微信号
	 */
	private String toUserName;
	
	/**
	 * 发送方帐号（一个OpenID）
	 */
	private String fromUserName;
	
	/**
	 * 消息创建时间 （单位 : 秒）
	 */
	private int createTime;
	
	/**
	 * 事件类型
	 */
	private String msgType;

	@XmlElement(name="ToUserName")
	public String getToUserName() {
		return toUserName;
	}

	@XmlElement(name="FromUserName")
	public String getFromUserName() {
		return fromUserName;
	}

	@XmlElement(name="CreateTime")
	public int getCreateTime() {
		return createTime;
	}

	@XmlElement(name="MsgType")
	public String getMsgType() {
		return msgType;
	}

	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}

	public void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}

	public void setCreateTime(int createTime) {
		this.createTime = createTime;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	@Override
	public String toString() {
		return "WechatBaseMsg [toUserName=" + toUserName + ", fromUserName=" + fromUserName + ", createTime="
				+ createTime + ", msgType=" + msgType + "]";
	}
}