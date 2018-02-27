package com.cyril.wechat.bean.msg.message;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.cyril.wechat.bean.msg.WechatBaseMsg;

/**
 * 图片消息
 * 
 * @author Cyril
 * @date 2018年2月27日
 */
@XmlRootElement(name="xml")
public class WechatImageMsg extends WechatBaseMsg implements Serializable {
	private static final long serialVersionUID = 398158182392345592L;

	/**
	 * 图片链接(由系统生成)
	 */
	private String picUrl;
	
	/**
	 * 图片消息媒体id，可以调用多媒体文件下载接口拉取数据
	 */
	private String mediaId;
	
	/**
	 * 消息id，64位整型
	 */
	private String msgId;

	@XmlElement(name="PicUrl")
	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	@XmlElement(name="MediaId")
	public String getMediaId() {
		return mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
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
		return "WechatImageMsg [picUrl=" + picUrl + ", mediaId=" + mediaId + ", msgId=" + msgId + "]";
	}
}