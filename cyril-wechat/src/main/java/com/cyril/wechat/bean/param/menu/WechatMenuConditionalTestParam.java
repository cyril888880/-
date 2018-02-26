package com.cyril.wechat.bean.param.menu;

import java.io.Serializable;

/**
 * 测试个性化菜单匹配结果参数
 * 
 * @author Cyril
 * @date 2018年2月26日
 */
public class WechatMenuConditionalTestParam implements Serializable {
	private static final long serialVersionUID = -915642423923364709L;
	
	/**
	 * user_id可以是粉丝的OpenID，也可以是粉丝的微信号
	 */
	private String user_id;

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	@Override
	public String toString() {
		return "WechatMenuConditionalTestParam [user_id=" + user_id + "]";
	}
}