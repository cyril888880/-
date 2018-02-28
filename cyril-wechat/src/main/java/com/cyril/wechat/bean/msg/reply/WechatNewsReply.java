package com.cyril.wechat.bean.msg.reply;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.cyril.wechat.common.WechatReplyMsgTypeEnum;

/**
 * 回复图文消息
 * 
 * @author Cyril
 * @date 2018年2月28日
 */
@XmlRootElement(name="xml")
public class WechatNewsReply implements Serializable{
	private static final long serialVersionUID = -3645141031015328565L;

	/**
	 * 接收方帐号（收到的OpenID）
	 */
	private String toUserName;
	
	/**
	 * 开发者微信号
	 */
	private String fromUserName;
	
	/**
	 * 消息创建时间 （整型）
	 */
	private Integer createTime;
	
	/**
	 * news类型
	 */
	private WechatReplyMsgTypeEnum msgType = WechatReplyMsgTypeEnum.NEWS;
	
	/**
	 * 图文消息个数，限制为8条以内
	 */
	private String articleCount;
	
	/**
	 * 多条图文消息信息，默认第一个item为大图,注意，如果图文数超过8，则将会无响应
	 */
	private String articles;
	
	/**
	 * 图文消息标题
	 */
	private String title;
	
	/**
	 * 图文消息描述
	 */
	private String description;
	
	/**
	 * 图片链接，支持JPG、PNG格式，较好的效果为大图360*200，小图200*200
	 */
	private String picUrl;
	
	/**
	 * 点击图文消息跳转链接
	 */
	private String url;

	@XmlElement(name = "ToUserName")
	public String getToUserName() {
		return toUserName;
	}

	@XmlElement(name = "FromUserName")
	public String getFromUserName() {
		return fromUserName;
	}

	@XmlElement(name = "CreateTime")
	public Integer getCreateTime() {
		return createTime;
	}

	@XmlElement(name = "MsgType")
	public String getMsgType() {
		return msgType.getType();
	}

	@XmlElement(name = "ArticleCount")
	public String getArticleCount() {
		return articleCount;
	}

	@XmlElement(name = "Articles")
	public String getArticles() {
		return articles;
	}

	@XmlElement(name = "Title")
	public String getTitle() {
		return title;
	}

	@XmlElement(name = "Description")
	public String getDescription() {
		return description;
	}

	@XmlElement(name = "PicUrl")
	public String getPicUrl() {
		return picUrl;
	}

	@XmlElement(name = "Url")
	public String getUrl() {
		return url;
	}

	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}

	public void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}

	public void setCreateTime(Integer createTime) {
		this.createTime = createTime;
	}

	public void setArticleCount(String articleCount) {
		this.articleCount = articleCount;
	}

	public void setArticles(String articles) {
		this.articles = articles;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "WechatNewsReply [toUserName=" + toUserName + ", fromUserName=" + fromUserName + ", createTime="
				+ createTime + ", msgType=" + msgType + ", articleCount=" + articleCount + ", articles=" + articles
				+ ", title=" + title + ", description=" + description + ", picUrl=" + picUrl + ", url=" + url + "]";
	}
}