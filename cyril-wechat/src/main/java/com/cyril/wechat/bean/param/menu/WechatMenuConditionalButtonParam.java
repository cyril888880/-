package com.cyril.wechat.bean.param.menu;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 微信个性化菜单参数
 * 
 * @author Cyril
 * @date 2018年2月25日
 */
public class WechatMenuConditionalButtonParam implements Serializable {
	private static final long serialVersionUID = -3750067083741039048L;

	/**
	 * 菜单最大长度
	 */
	private static final int MAX_SIZE = 3;
	
	/**
	 * 一级菜单数组
	 */
	private List<WechatBaseMenuParam> button = new ArrayList<>(MAX_SIZE);

	/**
	 * 菜单匹配规则
	 */
	private WechatMatchRuleParam matchrule;
	
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

	public WechatMatchRuleParam getMatchrule() {
		return matchrule;
	}

	public void setMatchrule(WechatMatchRuleParam matchrule) {
		this.matchrule = matchrule;
	}

	@Override
	public String toString() {
		return "WechatMenuConditionalButtonParam [button=" + button + ", matchrule=" + matchrule + "]";
	}
}