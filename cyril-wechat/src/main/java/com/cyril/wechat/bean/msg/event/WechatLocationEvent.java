package com.cyril.wechat.bean.msg.event;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.cyril.wechat.bean.msg.WechatBaseMsg;

/**
 * 上报地理位置事件
 * 
 * @author Cyril
 * @date 2018年2月28日
 */
@XmlRootElement(name="xml")
public class WechatLocationEvent extends WechatBaseMsg implements Serializable {
	private static final long serialVersionUID = -7626394731970732374L;

	/**
	 * 事件类型
	 */
	private String event;

	/**
	 * 地理位置纬度
	 */
	private String latitude;
	
	/**
	 * 地理位置经度
	 */
	private String longitude;
	
	/**
	 * 地理位置精度
	 */
	private String precision;

	@XmlElement(name="Event")
	public String getEvent() {
		return event;
	}

	@XmlElement(name="Latitude")
	public String getLatitude() {
		return latitude;
	}

	@XmlElement(name="Longitude")
	public String getLongitude() {
		return longitude;
	}

	@XmlElement(name="Precision")
	public String getPrecision() {
		return precision;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public void setPrecision(String precision) {
		this.precision = precision;
	}

	@Override
	public String toString() {
		return "WechatLocationEvent [event=" + event + ", latitude=" + latitude + ", longitude=" + longitude
				+ ", precision=" + precision + "]";
	}
}