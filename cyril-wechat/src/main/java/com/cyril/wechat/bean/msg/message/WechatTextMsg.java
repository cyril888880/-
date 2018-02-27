package com.cyril.wechat.bean.msg.message;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.cyril.wechat.bean.msg.WechatBaseMsg;

/**
 * 文本消息
 * 
 * @author Cyril
 * @date 2018年2月27日
 */
@XmlRootElement(name="xml")
public class WechatTextMsg extends WechatBaseMsg implements Serializable {
	private static final long serialVersionUID = 1905887724551370157L;

	/**
	 * 文本消息内容
	 */
	private String content;
	
	/**
	 * 消息id，64位整型
	 */
	private String msgId;

	@XmlElement(name="Content")
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@XmlElement(name="MsgId")
	public String getMsgId() {
		return msgId;
	}

	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	@Override
	public String toString() {
		return "WechatTextMsg [content=" + content + ", msgId=" + msgId + "]";
	}
}
