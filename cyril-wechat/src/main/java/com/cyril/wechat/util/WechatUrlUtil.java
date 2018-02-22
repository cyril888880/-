package com.cyril.wechat.util;

import static com.cyril.wechat.common.WechatUrlPropertiesKeyEnum.GLOBAL_ACCESS_TOKEN_URL;

import com.cyril.wechat.common.WechatDomainNameEnum;
import com.cyril.wechat.common.WechatPropertiesFileNameEnum;
import com.cyril.wechat.common.WechatPropertiesKeyEnum;

/**
 * 微信URL工具类
 * 
 * @author Cyril
 * @date 2018年2月20日
 */
abstract class WechatUrlUtil {
	private static String DOMAIN_NAME;
	
	static {
		initialize();
	}
	
	private static void initialize() {
		int domainNameCode = PropertiesUtil.getPropertyInt(WechatPropertiesKeyEnum.WECHAT_DOMAIN_NAME.getPropertiesKey()
				, WechatPropertiesFileNameEnum.WECHAT.getName(), WechatDomainNameEnum.GENERAL.getCode());
		DOMAIN_NAME = WechatDomainNameEnum.valueOf(domainNameCode).getDomainName();
	}
	
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
		return DOMAIN_NAME + PropertiesUtil.getPropertyString(key, WechatPropertiesFileNameEnum.WECHAT_URL.getName());
	}
}