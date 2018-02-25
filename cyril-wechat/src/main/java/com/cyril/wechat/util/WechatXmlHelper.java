package com.cyril.wechat.util;

import java.io.ByteArrayInputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * 微信xml工具类
 * 
 * @author Cyril
 * @date 2018年2月24日
 */
public class WechatXmlHelper {
	private String xml;
	
	private Element root;
	
	public WechatXmlHelper(String xml) throws DocumentException {
		initialize(xml);
	}
	
	private void initialize(String xml) throws DocumentException {
		this.xml = xml;
		SAXReader reader = new SAXReader();
		Document document = reader.read(new ByteArrayInputStream(this.xml.getBytes()));
		this.root = document.getRootElement();
	}
	
	public String getElementText(String qName) {
		return this.root.elementText(qName);
	}
	
	@SuppressWarnings("unchecked")
	public <T> T parseObject(Class<T> type) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(type);  
        Unmarshaller unmarshaller = context.createUnmarshaller(); 
        Object object = unmarshaller.unmarshal(new ByteArrayInputStream(this.xml.getBytes()));
        return (T) object;
	}
}