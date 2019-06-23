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
	 * ������ʼ
	 */
	@Override
	public void startDocument() throws SAXException {
		System.out.println("��ʼ����XML��");
	}
	
	/**
	 * ��ʼ����xmlԪ��
	 */
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		System.out.println("��ʼ������"+qName);
		
		//qNameΪ��ǰ�ڵ������
		//qName��ֵ��tag
		tag=qName;
		
		if("girl".equals(qName)){//�������ڵ�����Ϊgirlʱ��������
			girl = new Girls();
		}
		
	}
	
	/**
	 * ��������
	 */
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String str = new String(ch,start,length);//��ȡ�ڵ���������
		
		System.out.println("str="+str);
		System.out.println("tag="+tag);
		
		if("name".equals(tag)){
			girl.setName(str);
		}else if("age".equals(tag)){
			girl.setAge(str);
		}
	}
	
	/**
	 * ��������xmlԪ��
	 */
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.println("����������"+qName);
		
		tag="";
		
		if("girl".equals(qName)){//�������ڵ�����Ϊgirlʱ��������
			girls.add(girl);
		}
	}
	
	/**
	 * ��������
	 */
	@Override
	public void endDocument() throws SAXException {
		System.out.println("XML������ϣ�");
	}
}
