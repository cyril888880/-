package com.cyril.wechat.bean.param.golbal;

import java.io.Serializable;

/**
 * 获取全局access_token参数
 * 
 * @author Cyril
 * @date 2018年2月20日
 */
public class WechatGolbalAccessTokenParam implements Serializable {
	private static final long serialVersionUID = -5998715633982430439L;

	/**
	 * 第三方用户唯一凭证
	 */
	private String appId;
	
	/**
	 * 第三方用户唯一凭证密钥
	 */
	private String appSecret;

	public WechatGolbalAccessTokenParam() {
		super();
	}

	public WechatGolbalAccessTokenParam(String appId, String appSecret) {
		super();
		this.appId = appId;
		this.appSecret = appSecret;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getAppSecret() {
		return appSecret;
	}

	public void setAppSecret(String appSecret) {
		this.appSecret = appSecret;
	}

	@Override
	public String toString() {
		return "WechatGolbalAccessTokenParam [appId=" + appId + ", appSecret=" + appSecret + "]";
	}
}