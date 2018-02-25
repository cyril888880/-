package com.cyril.wechat.bean.msg.menu;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.cyril.wechat.bean.msg.WechatBaseMsg;

/**
 * 扫码推事件且弹出“消息接收中”提示框的事件推送
 * 
 * @author Cyril
 * @date 2018年2月25日
 */
@XmlRootElement(name="xml")
public class WechatMenuScancodeWaitmsgEvent extends WechatBaseMsg implements Serializable {
	private static final long serialVersionUID = -6564926132614832472L;

	/**
	 * 事件类型
	 */
	private String event;
	
	/**
	 * 事件KEY值，由开发者在创建菜单时设定
	 */
	private String eventKey;
	
	/**
	 * 扫描信息
	 */
	private String scanCodeInfo;
	
	/**
	 * 扫描类型，一般是qrcode
	 */
	private String scanType;
	
	/**
	 * 扫描结果，即二维码对应的字符串信息
	 */
	private String scanResult;

	@XmlElement(name="Event")
	public String getEvent() {
		return event;
	}

	@XmlElement(name="EventKey")
	public String getEventKey() {
		return eventKey;
	}

	@XmlElement(name="ScanCodeInfo")
	public String getScanCodeInfo() {
		return scanCodeInfo;
	}

	@XmlElement(name="ScanType")
	public String getScanType() {
		return scanType;
	}

	@XmlElement(name="ScanResult")
	public String getScanResult() {
		return scanResult;
	}

	@Override
	public String toString() {
		return "WechatMenuScancodeWaitmsgEvent [event=" + event + ", eventKey=" + eventKey + ", scanCodeInfo="
				+ scanCodeInfo + ", scanType=" + scanType + ", scanResult=" + scanResult + "]";
	}
}