package com.cyril.wechat.bean.result.golbal;

import com.cyril.wechat.bean.result.WechatBaseResult;

/**
 * 微信全局access_token
 * 
 * @author Cyril
 * @date 2018年2月20日
 */
public class WechatGolbalAccessTokenResult extends WechatBaseResult {
	private static final long serialVersionUID = -6802621853818306055L;

	/**
	 * 微信全局凭证
	 */
	private String access_token;
	
	/**
	 * 有效时间，单位：秒
	 */
	private int expires_in;

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public int getExpires_in() {
		return expires_in;
	}

	public void setExpires_in(int expires_in) {
		this.expires_in = expires_in;
	}

	@Override
	public String toString() {
		return "WechatGolbalAccessTokenResult [access_token=" + access_token + ", expires_in=" + expires_in + "]";
	}
}