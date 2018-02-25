package com.cyril.wechat.helper;

import java.io.Serializable;

/**
 * 微信签名辅助类
 * 
 * @author Cyril
 * @date 2018年2月23日
 */
public class WechatSignatureHelper implements Serializable{
	private static final long serialVersionUID = 4344554853318947083L;

	/**
	 * 时间戳
	 */
	private String timestamp;
	
	/**
	 * 随机数
	 */
	private String nonce;
	
	public WechatSignatureHelper() {
		super();
	}

	public WechatSignatureHelper(String timestamp, String nonce) {
		super();
		this.timestamp = timestamp;
		this.nonce = nonce;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getNonce() {
		return nonce;
	}

	public void setNonce(String nonce) {
		this.nonce = nonce;
	}

	@Override
	public String toString() {
		return "WechatSignatureHelper [timestamp=" + timestamp + ", nonce=" + nonce + "]";
	}
}