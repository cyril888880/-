package com.cyril.wechat.bean.msg.message;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.cyril.wechat.bean.msg.WechatBaseMsg;

/**
 * 语音消息
 * 
 * @author Cyril
 * @date 2018年2月27日
 */
@XmlRootElement(name="xml")
public class WechatVoiceMsg extends WechatBaseMsg implements Serializable {
	private static final long serialVersionUID = 7177246520656420379L;

	/**
	 * 语音消息媒体id，可以调用多媒体文件下载接口拉取数据
	 */
	private String mediaId;
	
	/**
	 * 语音格式，如amr，speex等
	 */
	private String format;
	
	/**
	 * 消息id，64位整型
	 */
	private String msgID;
	
	/**
	 * 语音识别结果，UTF8编码
	 */
	private String recognition;

	@XmlElement(name="MediaID")
	public String getMediaId() {
		return mediaId;
	}
	
	@XmlElement(name="Format")
	public String getFormat() {
		return format;
	}

	@XmlElement(name="MsgID")
	public String getMsgID() {
		return msgID;
	}

	@XmlElement(name="Recognition")
	public String getRecognition() {
		return recognition;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public void setMsgID(String msgID) {
		this.msgID = msgID;
	}

	public void setRecognition(String recognition) {
		this.recognition = recognition;
	}
}