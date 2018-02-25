package com.cyril.wechat.bean.result.menu;

import java.io.Serializable;

import com.cyril.wechat.bean.result.WechatBaseResult;

/**
 * 微信菜单返回对象
 * 
 * @author Cyril
 * @date 2018年2月23日
 */
public class WechatMenuResult extends WechatBaseResult implements Serializable {
	private static final long serialVersionUID = -2676462304295516193L;

	/**
	 * 微信自定义菜单
	 */
	private WechatCustomMenuResult menu;
	
	/**
	 * 微信个性菜单
	 */
	private WechatConditionalMenuResult conditionalmenu;

	public WechatCustomMenuResult getMenu() {
		return menu;
	}

	public void setMenu(WechatCustomMenuResult menu) {
		this.menu = menu;
	}

	public WechatConditionalMenuResult getConditionalmenu() {
		return conditionalmenu;
	}

	public void setConditionalmenu(WechatConditionalMenuResult conditionalmenu) {
		this.conditionalmenu = conditionalmenu;
	}

	@Override
	public String toString() {
		return "WechatMenuResult [menu=" + menu + ", conditionalmenu=" + conditionalmenu + "]";
	}
}