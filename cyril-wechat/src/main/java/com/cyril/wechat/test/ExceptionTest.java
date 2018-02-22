package com.cyril.wechat.test;

import org.slf4j.LoggerFactory;

import com.cyril.wechat.exception.WechatException;

public class ExceptionTest {
	public void throwException() throws WechatException {
		throw new WechatException(1, "异常测试", returnNullPointerException());
	}
	
	public NullPointerException returnNullPointerException() {
		return new NullPointerException("空指针异常");
	}
	
	public static void main(String[] args){
		try {
			new ExceptionTest().throwException();
		} catch (WechatException e) {
			LoggerFactory.getLogger(ExceptionTest.class).error("errorCode : {}, errorMessage : {}, e : {}", e.getErrorCode(), e.getErrorMessage(), e);
			
		}
	}
}