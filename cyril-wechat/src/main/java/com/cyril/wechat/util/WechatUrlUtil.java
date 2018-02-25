package com.cyril.wechat.util;

import static com.cyril.wechat.common.WechatUrlPropertiesKeyEnum.GLOBAL_ACCESS_TOKEN_URL;
import static com.cyril.wechat.common.WechatUrlPropertiesKeyEnum.MENU_CREATE_URL;
import static com.cyril.wechat.common.WechatUrlPropertiesKeyEnum.MENU_DELETE_URL;
import static com.cyril.wechat.common.WechatUrlPropertiesKeyEnum.MENU_FIND_URL;

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
	 * 获取全局 access_token URL
	 * @param appId
	 * @param appSecret
	 * @return
	 */
	static String getGlobalAccessTokenUrl(String appId, String appSecret) {
		return getUrl(GLOBAL_ACCESS_TOKEN_URL.getKey())
				.replace("APPID", appId)
				.replace("APPSECRET", appSecret);
	}
	
	/**
	 * 获取创建自定义菜单 URL
	 * @param accessToken
	 * @return
	 */
	static String getCreateMenuUrl(String accessToken) {
		return getUrl(MENU_CREATE_URL.getKey())
				.replace("ACCESS_TOKEN", accessToken);
	}
	
	/**
	 * 查询自定义菜单URL
	 * @param accessToken
	 * @return
	 */
	static String getFindMenuUrl(String accessToken) {
		return getUrl(MENU_FIND_URL.getKey())
				.replace("ACCESS_TOKEN", accessToken);
	}
	
	/**
	 * 删除自定义菜单URL
	 * @param accessToken
	 * @return
	 */
	static String getDeleteMenuUrl(String accessToken) {
		return getUrl(MENU_DELETE_URL.getKey())
				.replace("ACCESS_TOKEN", accessToken);
	}
	
	private static String getUrl(String key) {
		return DOMAIN_NAME + PropertiesUtil.getPropertyString(key, WechatPropertiesFileNameEnum.WECHAT_URL.getName());
	}
}