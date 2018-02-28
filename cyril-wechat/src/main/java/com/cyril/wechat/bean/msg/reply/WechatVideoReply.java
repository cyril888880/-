package com.cyril.wechat.bean.msg.reply;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.cyril.wechat.common.WechatReplyMsgTypeEnum;

/**
 * 回复语音消息
 * 
 * @author Cyril
 * @date 2018年2月28日
 */
@XmlRootElement(name="xml")
public class WechatVideoReply implements Serializable{
	private static final long serialVersionUID = -6385811848327080839L;

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
	 * video类型
	 */
	private WechatReplyMsgTypeEnum msgType = WechatReplyMsgTypeEnum.VIDEO;
	
	/**
	 * 通过素材管理中的接口上传多媒体文件，得到的id
	 */
	private String mediaId;
	
	/**
	 * 视频消息的标题
	 */
	private String title;
	
	/**
	 * 视频消息的描述
	 */
	private String description;
	
	@XmlElement(name = "Title")
	public String getTitle() {
		return title;
	}

	@XmlElement(name = "Description")
	public String getDescription() {
		return description;
	}
	
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

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "WechatVideoReply [toUserName=" + toUserName + ", fromUserName=" + fromUserName + ", createTime="
				+ createTime + ", msgType=" + msgType + ", mediaId=" + mediaId + ", title=" + title + ", description="
				+ description + "]";
	}
}