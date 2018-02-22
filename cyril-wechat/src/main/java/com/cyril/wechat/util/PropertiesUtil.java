package com.cyril.wechat.util;

import java.io.IOException;
import java.net.URL;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * properties 工具类
 * 
 * @author Cyril
 * @date 2018年2月19日
 */
public abstract class PropertiesUtil {
	private static final Logger logger = LoggerFactory.getLogger(PropertiesUtil.class);
	private static Map<String, Properties> propertieCache = new ConcurrentHashMap<>();
	private static ClassLoader classLoad = PropertiesUtil.class.getClassLoader();;

	/**
	 * 根据key获取String类型的properties属性, 获取不到返回默认值
	 * @param key
	 * @param fileName
	 * @param defaultValue
	 * @return
	 */
	public static String getPropertyString(String key, String fileName, String defaultValue) {
		return getProperty(key, fileName, defaultValue);
	}
	
	/**
	 * 根据key获取String类型的properties属性, 获取不到返回null
	 * @param key
	 * @param fileName
	 * @return
	 */
	public static String getPropertyString(String key, String fileName) {
		return getProperty(key, fileName);
	}
	
	/**
	 * 根据key获取int类型的properties属性, 获取不到返回默认值
	 * @param key
	 * @param fileName
	 * @param defaultValue
	 * @return
	 */
	public static int getPropertyInt(String key, String fileName, int defaultValue) {
		return getProperty(key, fileName, defaultValue);
	}
	
	/**
	 * 根据key获取int类型的properties属性, 获取不到抛出 NumberFormatException
	 * @param key
	 * @param fileName
	 * @return
	 * @throws NumberFormatException
	 */
	public static int getPropertyInt(String key, String fileName) throws NumberFormatException{
		return Integer.valueOf(getProperty(key, fileName));
	}
	
	/**
	 * 根据key获取long类型的properties属性, 获取不到返回默认值
	 * @param key
	 * @param fileName
	 * @param defaultValue
	 * @return
	 */
	public static long getPropertyLong(String key, String fileName, long defaultValue) {
		return getProperty(key, fileName, defaultValue);
	}
	
	/**
	 * 根据key获取long类型的properties属性, 获取不到抛出 NumberFormatException
	 * @param key
	 * @param fileName
	 * @return
	 * @throws NumberFormatException
	 */
	public static long getPropertyLong(String key, String fileName) throws NumberFormatException {
		return Long.valueOf(getProperty(key, fileName));
	}
	
	/**
	 * 根据key获取double类型的properties属性, 获取不到返回默认值
	 * @param key
	 * @param fileName
	 * @param defaultValue
	 * @return
	 */
	public static double getPropertyDouble(String key, String fileName, double defaultValue) {
		return getProperty(key, fileName, defaultValue);
	}
	
	/**
	 * 根据key获取double类型的properties属性, 获取不到抛出 NumberFormatException
	 * @param key
	 * @param fileName
	 * @return
	 * @throws NumberFormatException
	 */
	public static double getPropertyDouble(String key, String fileName) throws NumberFormatException {
		return Double.valueOf(getProperty(key, fileName));
	}
	
	private static String getProperty(String key, String fileName, String defaultValue) {
		String value = getProperty(key, fileName);
		return StringUtil.isNotEmpty(value) ? value : defaultValue;
	}
	
	private static int getProperty(String key, String fileName, int defaultValue) {
		String value = getProperty(key, fileName);
		return StringUtil.isNotEmpty(value) ? Integer.valueOf(value) : defaultValue;
	}
	
	private static Long getProperty(String key, String fileName, long defaultValue) {
		String value = getProperty(key, fileName);
		return StringUtil.isNotEmpty(value) ? Long.valueOf(value) : defaultValue;
	}
	
	private static Double getProperty(String key, String fileName, double defaultValue) {
		String value = getProperty(key, fileName);
		return StringUtil.isNotEmpty(value) ? Double.valueOf(value) : defaultValue;
	}
	
	private static String getProperty(String key, String fileName){
		Properties properties = propertieCache.get(key);
		
		if(ObjectUtil.isNotEmpty(properties)) {
			return properties.getProperty(key);
		}
		
		return getPropertiesValue(fileName, key);
	}
	
	private static String getPropertiesValue(String fileName, String key) {
		try {
			Properties properties = getProperties(fileName);
			return ObjectUtil.isNotEmpty(properties) ? properties.getProperty(key) : null;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			return "";
		}
	}
	
	private static Properties getProperties(String fileName) throws IOException {
		return loadProperties(new Properties(), fileName);
	}
	
	private static Properties loadProperties(Properties properties, String fileName) throws IOException {
		URL url = getUrl(fileName);
		
		if(ObjectUtil.isEmpty(url)) {
			return null;
		}
		
		properties.load((url).openStream());
		putCache(fileName, properties);
		return properties;
	}
	
	private static URL getUrl(String fileName) {
		return classLoad.getResource(fileName);
	}
	
	private static void putCache(String fileName, Properties properties) {
		propertieCache.put(fileName, properties);
	}
}