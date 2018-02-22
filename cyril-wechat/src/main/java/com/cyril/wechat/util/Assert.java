package com.cyril.wechat.util;

/**
 * 断言
 * 
 * @author Cyril
 * @date 2018年2月20日
 */
public abstract class Assert {
	public static void isNotNull(Object object, String message) {
		if(null == object) {
			throw new IllegalArgumentException(message);
		}
	}
	
	public static void isNotEmpty(String arg, String message) {
		if(StringUtil.isEmpty(arg)) {
			throw new IllegalArgumentException(message);
		}
	}
}