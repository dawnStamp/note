package cn.xml.sax;

import java.io.File;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

/**
 * SAX解析XML
 *
 */
public class Test {

	public static void main(String[] args) throws Exception {
		//1.创建对象
		SAXParserFactory factory = SAXParserFactory.newInstance();
		
		//2.获取解析器
		SAXParser saxParser = factory.newSAXParser();
		
		//3.调用方法开始解析xml
		File file = new File("girls.xml");
		MyHandler my = new MyHandler();
		saxParser.parse(file, my);
		
		List<Girls> list = my.getGirls();
		
		for (Girls girls : list) {
			System.out.println(girls);
		}
	}
}
