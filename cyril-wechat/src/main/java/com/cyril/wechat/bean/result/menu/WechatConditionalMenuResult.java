package com.cyril.wechat.bean.result.menu;

import java.io.Serializable;
import java.util.List;

/**
 * 微信个性菜单对象
 * 
 * @author Cyril
 * @date 2018年2月23日
 */
public class WechatConditionalMenuResult implements Serializable {
	private static final long serialVersionUID = 7807086073319422193L;

	/**
	 * 菜单ID
	 */
	private int menuid;
	
	/**
	 * 菜单按钮
	 */
	private List<WechatMenuButtonResult> button;
	
	/**
	 * 个性菜单匹配规则
	 */
	private WechatConditionalMenuMatchruleResult matchrule;

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

	public WechatConditionalMenuMatchruleResult getMatchrule() {
		return matchrule;
	}

	public void setMatchrule(WechatConditionalMenuMatchruleResult matchrule) {
		this.matchrule = matchrule;
	}

	@Override
	public String toString() {
		return "WechatConditionalMenuResult [menuid=" + menuid + ", button=" + button + ", matchrule=" + matchrule
				+ "]";
	}
}