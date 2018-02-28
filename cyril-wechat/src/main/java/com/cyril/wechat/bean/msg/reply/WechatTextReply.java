package com.cyril.wechat.bean.msg.reply;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.cyril.wechat.common.WechatReplyMsgTypeEnum;

/**
 * 回复微信文本消息
 * 
 * @author Cyril
 * @date 2018年2月28日
 */
@XmlRootElement(name="xml")
public class WechatTextReply implements Serializable{
	private static final long serialVersionUID = -8260674231804014749L;

	/**
	 * 接收方帐号（收到的OpenID）
	 */
	private String toUserName;
	
	/**
	 * 开发者微信号
	 */
	private String fromUserName;
	
	/**
	 * 消息创建时间 （整型）
	 */
	private Integer createTime;
	
	/**
	 * text类型
	 */
	private WechatReplyMsgTypeEnum msgType;
	
	/**
	 * 回复的消息内容（换行：在content中能够换行，微信客户端就支持换行显示）
	 */
	private String content;
	
	@XmlElement(name = "FromUserName")
	public String getFromUserName() {
		return fromUserName;
	}

	@XmlElement(name = "CreateTime")	
	public Integer getCreateTime() {
		return createTime;
	}

	@XmlElement(name = "MsgType")
	public String getMsgType() {
		return msgType.getType();
	}

	@XmlElement(name = "Content")
	public String getContent() {
		return content;
	}

	@XmlElement(name = "ToUserName")
	public String getToUserName() {
		return toUserName;
	}

	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}

	public void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}

	public void setCreateTime(Integer createTime) {
		this.createTime = createTime;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "WechatTextReply [toUserName=" + toUserName + ", fromUserName=" + fromUserName + ", createTime="
				+ createTime + ", msgType=" + msgType + ", content=" + content + "]";
	}
	
	public static void main(String[] args) {
		WechatTextReply reply = new WechatTextReply();
		reply.setContent("sss");
		reply.setCreateTime(111);
		reply.setFromUserName("123");
		reply.setToUserName("asdasd");
	}
}