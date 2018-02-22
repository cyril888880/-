package com.cyril.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cyril.wechat.bean.param.golbal.WechatGolbalAccessTokenParam;
import com.cyril.wechat.bean.result.golbal.WechatGolbalAccessTokenResult;
import com.cyril.wechat.util.WechatUtil;

public class TestHttpClient {
	static Logger logger = LoggerFactory.getLogger(TestHttpClient.class);
	public static String appId = "wxcc2215ce9d130449";
	
	public static String appSecret = "20cb0fbae34bb20ba38820e6d94081b2";
	
	public static void main(String[] args) {
		testGolbalAccessToken();
	}
	
	public static void testGolbalAccessToken() {
		WechatGolbalAccessTokenParam accessToken = new WechatGolbalAccessTokenParam();
		accessToken.setAppId(appId);
		accessToken.setAppSecret(appSecret);
		WechatGolbalAccessTokenResult result = WechatUtil.getGlobalAccessToken(accessToken);
		logger.info("全局AccessToken测试 : accessToken{},有效时间{}", result.getAccess_token(), result.getExpires_in());
	}
}