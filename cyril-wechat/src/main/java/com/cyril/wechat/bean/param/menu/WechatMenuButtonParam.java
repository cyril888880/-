package com.cyril.wechat.bean.param.menu;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 微信菜单参数
 * 
 * @author Cyril
 * @date 2018年2月22日
 */
public class WechatMenuButtonParam implements Serializable {
	private static final long serialVersionUID = 8392846446721406973L;

	/**
	 * 菜单最大长度
	 */
	private static final int MAX_SIZE = 3;
	
	/**
	 * 一级菜单数组
	 */
	private List<WechatBaseMenuParam> button = new ArrayList<>(MAX_SIZE);

	public List<WechatBaseMenuParam> getButton() {
		return button;
	}

	public void setButton(WechatBaseMenuParam button) {
		if(checkButtonSize()) {
			throw new IllegalArgumentException("一级菜单数组最多为3个");
		}
		
		this.button.add(button);
	}
	
	private boolean checkButtonSize() {
		return button.size() >= MAX_SIZE;
	}

	@Override
	public String toString() {
		return "WechatMenuButtonParam [button=" + button + "]";
	}
}