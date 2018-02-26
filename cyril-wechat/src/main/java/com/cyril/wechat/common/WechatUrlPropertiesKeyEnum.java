package com.cyril.wechat.common;

/**
 * 微信API URL properties Key枚举
 * 
 * @author Cyril
 * @date 2018年2月20日
 */
public enum WechatUrlPropertiesKeyEnum {
	GLOBAL_ACCESS_TOKEN_URL("GLOBAL.ACCESS.TOKEN.URL"),
	MENU_CREATE_URL("MENU.CREATE.URL"),
	MENU_FIND_URL("MENU.FIND.URL"),
	MENU_DELETE_URL("MENU.DELETE.URL"),
	MENU_CREATE_CONDITIONAL_URL("MENU.CREATE.CONDITIONAL.URL"),
	MENU_DELETE_CONDITIONAL_URL("MENU.DELETE.CONDITIONAL.URL"),
	MENU_TEST_CONDITIONAL_URL("MENU.TEST.CONDITIONAL.URL"),
	MENU_CONFIG_URL("MENU.CONFIG.URL");
	
	private WechatUrlPropertiesKeyEnum(String key) {
		this.key = key;
	}

	private final String key;

	public String getKey() {
		return key;
	}
}