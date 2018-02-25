package com.cyril.wechat.bean.result.menu;

import java.io.Serializable;
import java.util.List;

/**
 * 微信自定义菜单对象
 * 
 * @author Cyril
 * @date 2018年2月23日
 */
public class WechatCustomMenuResult implements Serializable{
	private static final long serialVersionUID = 4977452888683778665L;

	/**
	 * 菜单ID
	 */
	private int menuid;
	
	/**
	 * 菜单按钮
	 */
	private List<WechatMenuButtonResult> button;

	public int getMenuid() {
		return menuid;
	}

	public void setMenuid(int menuid) {
		this.menuid = menuid;
	}

	public List<WechatMenuButtonResult> getButton() {
		return button;
	}

	public void setButton(List<WechatMenuButtonResult> button) {
		this.button = button;
	}

	@Override
	public String toString() {
		return "WechatCustomMenuResult [menuid=" + menuid + ", button=" + button + "]";
	}
}