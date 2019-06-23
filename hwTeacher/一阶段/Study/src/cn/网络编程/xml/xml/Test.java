package cn.xml;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * DOM解析xml
 * 		
 */
public class Test {

	public static void main(String[] args) throws Exception {
		//创建一个DocumentBuilderFactory的对象
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		
		//创建DocumentBuilder对象
		DocumentBuilder db = dbf.newDocumentBuilder();
		
		//通过DocumentBuilder对象的parse方法加载First.xml文件到当前项目下
		Document d = db.parse("girls.xml");
		
		//获取所有girl节点的集合
		NodeList girlList = d.getElementsByTagName("girl");
		
		//通过NodeList的getLength()方法可以获取girlList的长度
		System.out.println("一共有"+girlList.getLength()+"个女孩");
		
		//通过item(..)方法  获取一个girl节点  girlList的索引值从0开始
		Node node = girlList.item(1);
		
		//获取girl节点的所有属性集合
		NamedNodeMap attrs = node.getAttributes();
		
		//获取attrs中的第1个属性
		Node attr = attrs.item(0);
		
		//获取属性的名称
		String name = attr.getNodeName();
		
		//获取属性的值
		String value = attr.getNodeValue();
		
		System.out.println(name);
		System.out.println(value);
		
		//解析girl节点的子节点
		NodeList childNodes = node.getChildNodes();
		System.out.println(childNodes.getLength());
		
		Node nod = childNodes.item(4);
		System.out.println(nod.getNodeName());
		
//		System.out.println(nod.getFirstChild().getNodeValue());
		System.out.println(nod.getTextContent());
		
	}
}
