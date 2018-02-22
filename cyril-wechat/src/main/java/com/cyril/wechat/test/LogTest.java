package com.cyril.wechat.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest {
	public static void main(String[] args) {
		System.out.println("输出");
		final Logger logger = LoggerFactory.getLogger(LogTest.class);
		for(int i = 0 ; i < 100 ; i++) {
			logger.info("测试日志输出");
			logger.error("测试日志输出");
			logger.warn("测试日志输出");
			logger.debug("测试日志输出");
		}
		
	}
}