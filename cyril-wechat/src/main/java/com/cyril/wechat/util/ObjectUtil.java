package com.cyril.wechat.util;

import org.apache.commons.lang3.ObjectUtils;

/**
 * Object 工具类
 * 
 * @author Cyril
 * @date 2018年2月19日
 */
public abstract class ObjectUtil extends ObjectUtils {
	private ObjectUtil() {
		
	}
	
	public static boolean isEmpty(Object obj) {
		return null == obj;
	}
	
	public static boolean isNotEmpty(Object obj) {
		return !isEmpty(obj);
	}
}