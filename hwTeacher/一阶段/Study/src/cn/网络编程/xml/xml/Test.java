package cn.xml;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * DOM����xml
 * 		
 */
public class Test {

	public static void main(String[] args) throws Exception {
		//����һ��DocumentBuilderFactory�Ķ���
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		
		//����DocumentBuilder����
		DocumentBuilder db = dbf.newDocumentBuilder();
		
		//ͨ��DocumentBuilder�����parse��������First.xml�ļ�����ǰ��Ŀ��
		Document d = db.parse("girls.xml");
		
		//��ȡ����girl�ڵ�ļ���
		NodeList girlList = d.getElementsByTagName("girl");
		
		//ͨ��NodeList��getLength()�������Ի�ȡgirlList�ĳ���
		System.out.println("һ����"+girlList.getLength()+"��Ů��");
		
		//ͨ��item(..)����  ��ȡһ��girl�ڵ�  girlList������ֵ��0��ʼ
		Node node = girlList.item(1);
		
		//��ȡgirl�ڵ���������Լ���
		NamedNodeMap attrs = node.getAttributes();
		
		//��ȡattrs�еĵ�1������
		Node attr = attrs.item(0);
		
		//��ȡ���Ե�����
		String name = attr.getNodeName();
		
		//��ȡ���Ե�ֵ
		String value = attr.getNodeValue();
		
		System.out.println(name);
		System.out.println(value);
		
		//����girl�ڵ���ӽڵ�
		NodeList childNodes = node.getChildNodes();
		System.out.println(childNodes.getLength());
		
		Node nod = childNodes.item(4);
		System.out.println(nod.getNodeName());
		
//		System.out.println(nod.getFirstChild().getNodeValue());
		System.out.println(nod.getTextContent());
		
	}
}
