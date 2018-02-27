package com.cyril.wechat.bean.msg.message;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.cyril.wechat.bean.msg.WechatBaseMsg;

/**
 * 链接消息
 * 
 * @author Cyril
 * @date 2018年2月27日
 */
@XmlRootElement(name="xml")
public class WechatLinkMsg extends WechatBaseMsg implements Serializable {
	private static final long serialVersionUID = -2706139219361678526L;

	/**
	 * 消息标题
	 */
	private String title;
	
	/**
	 * 消息描述
	 */
	private String description;
	
	/**
	 * 消息链接
	 */
	private String url;
	
	/**
	 * 消息id，64位整型
	 */
	private String msgId;

	@XmlElement(name="Title")
	public String getTitle() {
		return title;
	}

	@XmlElement(name="Description")
	public String getDescription() {
		return description;
	}

	@XmlElement(name="Url")
	public String getUrl() {
		return url;
	}

	@XmlElement(name="MsgId")
	public String getMsgId() {
		return msgId;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	@Override
	public String toString() {
		return "WechatLinkMsg [title=" + title + ", description=" + description + ", url=" + url + ", msgId=" + msgId
				+ "]";
	}
}