package com.cyril.wechat.bean.msg.message;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.cyril.wechat.bean.msg.WechatBaseMsg;

/**
 * 小视频消息
 * 
 * @author Cyril
 * @date 2018年2月27日
 */
@XmlRootElement(name="xml")
public class WechatShortVideoMsg extends WechatBaseMsg implements Serializable {
	private static final long serialVersionUID = 1226716856803335884L;

	/**
	 * 视频消息媒体id，可以调用多媒体文件下载接口拉取数据
	 */
	private String mediaId;
	
	/**
	 * 视频消息缩略图的媒体id，可以调用多媒体文件下载接口拉取数据
	 */
	private String thumbMediaId;
	
	/**
	 * 消息id，64位整型
	 */
	private String msgId;

	@XmlElement(name="MediaId")
	public String getMediaId() {
		return mediaId;
	}
	
	@XmlElement(name="ThumbMediaId")
	public String getThumbMediaId() {
		return thumbMediaId;
	}

	@XmlElement(name="MsgId")
	public String getMsgId() {
		return msgId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	public void setThumbMediaId(String thumbMediaId) {
		this.thumbMediaId = thumbMediaId;
	}

	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	@Override
	public String toString() {
		return "WechatVideoMsg [mediaId=" + mediaId + ", thumbMediaId=" + thumbMediaId + ", msgId=" + msgId + "]";
	}
}