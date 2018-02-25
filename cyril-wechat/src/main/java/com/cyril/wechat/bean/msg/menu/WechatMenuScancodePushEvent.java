package com.cyril.wechat.bean.msg.menu;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.cyril.wechat.bean.msg.WechatBaseMsg;

/**
 * 扫码推事件的事件推送
 * 
 * @author Cyril
 * @date 2018年2月25日
 */
@XmlRootElement(name="xml")
public class WechatMenuScancodePushEvent extends WechatBaseMsg implements Serializable {
	private static final long serialVersionUID = -8833085474751890578L;

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

	public void setEvent(String event) {
		this.event = event;
	}

	public void setEventKey(String eventKey) {
		this.eventKey = eventKey;
	}

	public void setScanCodeInfo(String scanCodeInfo) {
		this.scanCodeInfo = scanCodeInfo;
	}

	public void setScanType(String scanType) {
		this.scanType = scanType;
	}

	public void setScanResult(String scanResult) {
		this.scanResult = scanResult;
	}

	@Override
	public String toString() {
		return "WechatMenuScancodePushEvent [event=" + event + ", eventKey=" + eventKey + ", scanCodeInfo="
				+ scanCodeInfo + ", scanType=" + scanType + ", scanResult=" + scanResult + "]";
	}
}