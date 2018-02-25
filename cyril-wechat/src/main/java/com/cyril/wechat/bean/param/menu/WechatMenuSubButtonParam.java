package com.cyril.wechat.bean.param.menu;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 微信二级菜单
 * 
 * @author Cyril
 * @date 2018年2月22日
 */
public class WechatMenuSubButtonParam extends WechatBaseMenuParam implements Serializable {
	private static final long serialVersionUID = 286552874986891625L;

	/**
	 * 菜单最大长度
	 */
	private static final int MAX_SIZE = 5;
	
	/**
	 * 二级菜单数组
	 */
	List<WechatBaseMenuParam> sub_button = new ArrayList<>(MAX_SIZE);
	
	public WechatMenuSubButtonParam() {
		super();
	}
	
	public WechatMenuSubButtonParam(String name) {
		super(name);
	}

	public List<WechatBaseMenuParam> getSub_button() {
		return sub_button;
	}

	public void setButton(WechatBaseMenuParam button) {
		if(checkButtonSize()) {
			throw new IllegalArgumentException("一级菜单数组最多为3个");
		}
		
		this.sub_button.add(button);
	}
	
	private boolean checkButtonSize() {
		return sub_button.size() >= MAX_SIZE;
	}

	@Override
	public String toString() {
		return "WechatMenuSubButtonParam [sub_button=" + sub_button + "]";
	}
}