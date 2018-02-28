package com.cyril.wechat.bean.msg.reply;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.cyril.wechat.common.WechatReplyMsgTypeEnum;

/**
 * 回复图片消息
 * 
 * @author Cyril
 * @date 2018年2月28日
 */
@XmlRootElement(name="xml")
public class WechatImageReply implements Serializable{
	private static final long serialVersionUID = -5319628547546234448L;

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
	 * image类型
	 */
	private WechatReplyMsgTypeEnum msgType = WechatReplyMsgTypeEnum.IMAGE;
	
	/**
	 * 通过素材管理中的接口上传多媒体文件，得到的id
	 */
	private String mediaId;
	
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

	@XmlElement(name = "MediaId")
	public String getMediaId() {
		return mediaId;
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

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	@Override
	public String toString() {
		return "WechatImageReply [toUserName=" + toUserName + ", fromUserName=" + fromUserName + ", createTime="
				+ createTime + ", msgType=" + msgType + ", mediaId=" + mediaId + "]";
	}
}