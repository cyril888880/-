package com.cyril.wechat.bean.result.menu;

import java.io.Serializable;
import java.util.List;

/**
 * 微信配置二级菜单
 * 
 * @author Cyril
 * @date 2018年2月26日
 */
public class WechatMenuConfigSubButtonResullt implements Serializable {
	private static final long serialVersionUID = 281175674280128320L;
	List<WechatMenuConfigButtonResult> list;

	public List<WechatMenuConfigButtonResult> getList() {
		return list;
	}

	public void setList(List<WechatMenuConfigButtonResult> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "WechatMenuConfigSubButtonResullt [list=" + list + "]";
	}
}