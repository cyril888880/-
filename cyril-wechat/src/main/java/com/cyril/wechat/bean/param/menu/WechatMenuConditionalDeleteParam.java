package com.cyril.wechat.bean.param.menu;

import java.io.Serializable;

/**
 * 个性化菜单删除参数
 * 
 * @author Cyril
 * @date 2018年2月26日
 */
public class WechatMenuConditionalDeleteParam implements Serializable {
	private static final long serialVersionUID = 4509818425697054197L;
	
	/**
	 * menuid为菜单id，可以通过自定义菜单查询接口获取
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
		return "WechatMenuConditionalDeleteParam [menuid=" + menuid + "]";
	}
}