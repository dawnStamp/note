package xml.sax解析xml;

import java.io.File;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

/**
 * 
 * SAX解析XML
 * @author oracleOAEC
 *
 */
public class Sax {

	public static void main(String[] args) throws Exception{
		//1.创建对象
		SAXParserFactory factory = SAXParserFactory.newInstance();
		
		//2.获取解析器
		SAXParser saxParser = factory.newSAXParser();
		
		//3.调用方法开始解析xml
		File file = new File("E:/MyJava/lianxi/Study/Studys/xml/pigs.xml");
		MyHandler my =new MyHandler();
		saxParser.parse(file,my);
		
		List<Pigs> list =my.getPigs();
		for (Pigs pigs : list) {
			System.out.println(pigs);
		}
	}
}
