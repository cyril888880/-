package com.cyril.wechat.util;

import static com.cyril.wechat.common.WechatUrlPropertiesKeyEnum.*;

/**
 * 微信URL工具类
 * 
 * @author Cyril
 * @date 2018年2月20日
 */
abstract class WechatUrlUtil {
	private static final String URL_CONFIG = "wechaturl.properties";
	
	/**
	 * 获取全局 access_token Url
	 * @param appId
	 * @param appSecret
	 * @return
	 */
	static String getGlobalAccessTokenUrl(String appId, String appSecret) {
		return getUrl(GLOBAL_ACCESS_TOKEN_URL.getKey())
				.replace("APPID", appId)
				.replace("APPSECRET", appSecret);
	}
	
	private static String getUrl(String key) {
		return PropertiesUtil.getPropertyString(key, URL_CONFIG);
	}
}