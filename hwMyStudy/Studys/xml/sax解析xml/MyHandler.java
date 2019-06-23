package xml.sax����xml;

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



	//������ʼ��
	@Override
	public void startDocument() throws SAXException {
		System.out.println("��ʼ����XML");

	}



	//����xmlԪ��
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		System.out.println("��ʼ����"+qName);
		//qNameΪ��ǰ�ڵ������
		//qName��ֵ��tag

		tag=qName;

		if("pig".equals(qName)){//�������ڵ�����Ϊpigʱ��������
			pig = new Pigs();
		}
	}

	//��������
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String str = new String(ch,start,length);//��ȡ�ڵ���������
		System.out.println("str="+str);
		System.out.println("tag="+tag);

		if("name".equals(tag)){
			pig.setName(str);
		}else if("age".equals(tag)){
			pig.setAge(str);
		}


	}

	//��������xmlԪ��
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.println("��������"+qName);

		tag ="";

		if("pig".equals(qName)){//�������ڵ�����Ϊpigʱ��������
			pigs.add(pig);
		}
	}



	//��������
	@Override
	public void endDocument() throws SAXException {
		System.out.println("XML�������");
	}
}
