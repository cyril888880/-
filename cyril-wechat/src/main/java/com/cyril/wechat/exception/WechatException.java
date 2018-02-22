package com.cyril.wechat.exception;

/**
 * 微信异常信息
 * 
 * @author Cyril
 * @date 2018年2月18日
 */
public class WechatException extends Exception {
	private static final long serialVersionUID = -2895042039075824463L;

	private final int errorCode;

	private final String errorMessage;

	public WechatException(int errorCode, String errorMessage) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public WechatException(int errorCode, String errorMessage, Throwable cause) {
		super(errorCode + ":" + errorMessage, cause);
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
}
