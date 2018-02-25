package com.cyril.wechat.bean.result.menu;

import java.io.Serializable;

import com.cyril.wechat.bean.result.WechatBaseResult;

/**
 * 微信创建自定义菜单返回结果
 * 
 * @author Cyril
 * @date 2018年2月25日
 */
public class WechatCreateConditionalMenuResult extends WechatBaseResult implements Serializable {
	private static final long serialVersionUID = 2974277070173021290L;
	
	/**
	 * menuid为菜单id，可以通过自定义菜单查询接口获取。
	 */
	private String menuid;

	public String getMenuid() {
		return menuid;
	}

	public void setMenuid(String menuid) {
		this.menuid = menuid;
	}

	@Override
	public String toString() {
		return "WechatCreateConditionalMenuResult [menuid=" + menuid + "]";
	}
}