package com.cyril.wechat.bean.result.menu;

import java.io.Serializable;

import com.cyril.wechat.bean.result.WechatBaseResult;

/**
 * 菜单配合返回结果
 * 
 * @author Cyril
 * @date 2018年2月26日
 */
public class WechatMenuConfigResult extends WechatBaseResult implements Serializable {
	private static final long serialVersionUID = -2582775823307539276L;

	/**
	 * 菜单是否开启，0代表未开启，1代表开启
	 */
	private int is_menu_open;
	
	/**
	 * 菜单信息
	 */
	private WechatMenuSelfMenuInfoResult selfmenu_info;

	public int getIs_menu_open() {
		return is_menu_open;
	}

	public void setIs_menu_open(int is_menu_open) {
		this.is_menu_open = is_menu_open;
	}

	public WechatMenuSelfMenuInfoResult getSelfmenu_info() {
		return selfmenu_info;
	}

	public void setSelfmenu_info(WechatMenuSelfMenuInfoResult selfmenu_info) {
		this.selfmenu_info = selfmenu_info;
	}

	@Override
	public String toString() {
		return "WechatMenuConfigResult [is_menu_open=" + is_menu_open + ", selfmenu_info=" + selfmenu_info + "]";
	}
}