package cn.xml.sax;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MyHandler extends DefaultHandler{

	private List<Girls> girls = new ArrayList<Girls>();
	private Girls girl;
	private String tag;
	
	public List<Girls> getGirls() {
		return girls;
	}

	public void setGirls(List<Girls> girls) {
		this.girls = girls;
	}

	/**
	 * 解析开始
	 */
	@Override
	public void startDocument() throws SAXException {
		System.out.println("开始解析XML！");
	}
	
	/**
	 * 开始解析xml元素
	 */
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		System.out.println("开始解析："+qName);
		
		//qName为当前节点的名称
		//qName赋值给tag
		tag=qName;
		
		if("girl".equals(qName)){//解析到节点名称为girl时满足条件
			girl = new Girls();
		}
		
	}
	
	/**
	 * 文字内容
	 */
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String str = new String(ch,start,length);//获取节点后面的内容
		
		System.out.println("str="+str);
		System.out.println("tag="+tag);
		
		if("name".equals(tag)){
			girl.setName(str);
		}else if("age".equals(tag)){
			girl.setAge(str);
		}
	}
	
	/**
	 * 结束解析xml元素
	 */
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.println("结束解析："+qName);
		
		tag="";
		
		if("girl".equals(qName)){//解析到节点名称为girl时满足条件
			girls.add(girl);
		}
	}
	
	/**
	 * 解析结束
	 */
	@Override
	public void endDocument() throws SAXException {
		System.out.println("XML解析完毕！");
	}
}
