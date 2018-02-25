package com.cyril.wechat.controller;

import javax.xml.bind.JAXBException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cyril.wechat.bean.msg.menu.WechatMenuClickEvent;
import com.cyril.wechat.bean.msg.menu.WechatMenuLocationSelectEvent;
import com.cyril.wechat.bean.msg.menu.WechatMenuPicPhotoOrAlbumEvent;
import com.cyril.wechat.bean.msg.menu.WechatMenuPicSysphotoEvent;
import com.cyril.wechat.bean.msg.menu.WechatMenuPicWeixinEvent;
import com.cyril.wechat.bean.msg.menu.WechatMenuScancodePushEvent;
import com.cyril.wechat.bean.msg.menu.WechatMenuScancodeWaitmsgEvent;
import com.cyril.wechat.bean.msg.menu.WechatMenuViewEvent;
import com.cyril.wechat.common.WechatMsgEventTypeEnum;
import com.cyril.wechat.common.WechatMsgTypeEnum;
import com.cyril.wechat.helper.WechatSignatureHelper;
import com.cyril.wechat.util.WechatSignatureUtil;
import com.cyril.wechat.util.WechatXmlHelper;

/**
 * 微信controller
 * 
 * @author Cyril
 * @date 2018年2月25日
 */
@SuppressWarnings("restriction")
@RequestMapping("/wechat")
@RestController
public class WechatController {
	private static final Logger logger = LoggerFactory.getLogger(WechatController.class);
	
	private static final String SUCCESS = "success";
	
	@RequestMapping(value = "/doin", method = RequestMethod.GET,
			produces=MediaType.TEXT_PLAIN_VALUE+";charset=utf-8")
	public String doin(
			@RequestParam(value="signature" ,required =true) String signature,
			@RequestParam(value="timestamp" ,required =true) String timestamp,
			@RequestParam(value="nonce" ,required =true) String nonce,
			@RequestParam(value="echostr" ,required =true) String echostr) {
		if(logger.isDebugEnabled()) {
			logger.debug("signature : {}, timestamp : {}, nonce : {}, echostr : {}", signature, timestamp, nonce, echostr);
			logger.debug("签名验证结果" + WechatSignatureUtil.checkSignature(signature, new WechatSignatureHelper(timestamp, nonce)));
		}
		
		return echostr;
	}
	
	@RequestMapping(value = "/doin", method = RequestMethod.POST,
			produces=MediaType.TEXT_PLAIN_VALUE+";charset=utf-8")
	public String doin(
			@RequestParam(value="signature" ,required = false) String signature,
			@RequestParam(value="timestamp" ,required = false) String timestamp,
			@RequestParam(value="nonce" ,required = false) String nonce,
			@RequestParam(value="echostr" ,required = false) String echostr,
			@RequestBody String xml) {
		logger.debug("xml : {}", xml);
		return processXml(xml);
	}
	
	private String processXml(String xml) {
		try {
			return processXml(new WechatXmlHelper(xml));
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			logger.error("解析微信消息失败, 失败 XML 为: {}", xml);
			return SUCCESS;
		}
	}
	
	private String processXml(WechatXmlHelper wechatXmlHelper) throws JAXBException {
		switch (getMsgType(wechatXmlHelper)) {
		case EVENT :
			return processEvent(wechatXmlHelper);
		default :
			return SUCCESS;
		}
	}
	
	private WechatMsgTypeEnum getMsgType(WechatXmlHelper wechatXmlHelper) {
		return WechatMsgTypeEnum.getMsgType(wechatXmlHelper.getElementText("MsgType"));
	}
	
	private String processEvent(WechatXmlHelper wechatXmlHelper) throws JAXBException {
		switch (getMsgEventType(wechatXmlHelper)) {
		case CLICK :
			return processClickEvent(wechatXmlHelper.parseObject(WechatMenuClickEvent.class));
		case VIEW :
			return processViewEvent(wechatXmlHelper.parseObject(WechatMenuViewEvent.class));
		case SCANCODE_PUSH : 
			return processScancodePushEvent(wechatXmlHelper.parseObject(WechatMenuScancodePushEvent.class));
		case SCANCODE_WAITMSG :
			return processScancodeWaitmsgEvent(wechatXmlHelper.parseObject(WechatMenuScancodeWaitmsgEvent.class));
		case PIC_SYSPHOTO :
			return processPicSysphotoEvent(wechatXmlHelper.parseObject(WechatMenuPicSysphotoEvent.class));
		case PIC_PHOTO_OR_ALBUM :
			return processPicPhotoOrAlbumEvent(wechatXmlHelper.parseObject(WechatMenuPicPhotoOrAlbumEvent.class));
		case PIC_WEIXIN :
			return processPicWeixinEvent(wechatXmlHelper.parseObject(WechatMenuPicWeixinEvent.class));
		case LOCATION_SELECT :
			return processLocationSelectEvent(wechatXmlHelper.parseObject(WechatMenuLocationSelectEvent.class));
		default :
			return SUCCESS;
		}
	}
	
	private WechatMsgEventTypeEnum getMsgEventType(WechatXmlHelper wechatXmlHelper) {
		return WechatMsgEventTypeEnum.getMsgEventType(wechatXmlHelper.getElementText("Event"));
	}
	
	private String processClickEvent(WechatMenuClickEvent event) {
		return SUCCESS;
	}
	
	private String processViewEvent(WechatMenuViewEvent event) {
		return SUCCESS;
	}
	
	private String processScancodePushEvent(WechatMenuScancodePushEvent event) {
		return SUCCESS;
	}
	
	private String processScancodeWaitmsgEvent(WechatMenuScancodeWaitmsgEvent event) {
		return SUCCESS;
	}
	
	private String processPicSysphotoEvent(WechatMenuPicSysphotoEvent event) {
		return SUCCESS;
	}
	
	private String processPicPhotoOrAlbumEvent(WechatMenuPicPhotoOrAlbumEvent event) {
		return SUCCESS;
	}
	
	private String processPicWeixinEvent(WechatMenuPicWeixinEvent event) {
		return SUCCESS;
	}
	
	private String processLocationSelectEvent(WechatMenuLocationSelectEvent event) {
		return SUCCESS;
	}
}