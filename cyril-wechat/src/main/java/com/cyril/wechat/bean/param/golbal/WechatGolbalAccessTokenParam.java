package com.cyril.wechat.bean.param.golbal;

/**
 * 获取全局access_token参数
 * 
 * @author Cyril
 * @date 2018年2月20日
 */
public class WechatGolbalAccessTokenParam {
	private String appId;
	
	private String appSecret;

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
}