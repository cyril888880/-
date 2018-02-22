package com.cyril.wechat.bean.result;

import java.io.Serializable;

/**
 * 微信返回结果基础对象
 * 
 * @author Cyril
 * @date 2018年2月19日
 */
public class WechatBaseResult implements Serializable {
	private static final long serialVersionUID = -1323879722879395427L;

	/**
	 * 错误码
	 */
	private int errcode;
	
	/**
	 * 错误信息
	 */
	private String errmsg;

	public int getErrcode() {
		return errcode;
	}

	public void setErrcode(int errcode) {
		this.errcode = errcode;
	}

	public String getErrmsg() {
		return errmsg;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}

	@Override
	public String toString() {
		return "WechatBaseResult [errcode=" + errcode + ", errmsg=" + errmsg + "]";
	}
}