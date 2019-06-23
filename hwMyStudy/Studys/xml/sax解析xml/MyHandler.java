package xml.sax解析xml;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MyHandler extends DefaultHandler{

	private List<Pigs>pigs = new ArrayList<Pigs>();
	private Pigs pig;
	private String tag;


	public List<Pigs> getPigs() {
		return pigs;
	}



	public void setPigs(List<Pigs> pigs) {
		this.pigs = pigs;
	}



	//解析开始了
	@Override
	public void startDocument() throws SAXException {
		System.out.println("开始解析XML");

	}



	//解析xml元素
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		System.out.println("开始解析"+qName);
		//qName为当前节点的名称
		//qName赋值给tag

		tag=qName;

		if("pig".equals(qName)){//解析到节点名称为pig时满足条件
			pig = new Pigs();
		}
	}

	//文字内容
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String str = new String(ch,start,length);//获取节点后面的内容
		System.out.println("str="+str);
		System.out.println("tag="+tag);

		if("name".equals(tag)){
			pig.setName(str);
		}else if("age".equals(tag)){
			pig.setAge(str);
		}


	}

	//结束解析xml元素
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.println("结束解析"+qName);

		tag ="";

		if("pig".equals(qName)){//解析到节点名称为pig时满足条件
			pigs.add(pig);
		}
	}



	//解析结束
	@Override
	public void endDocument() throws SAXException {
		System.out.println("XML解析完毕");
	}
}
