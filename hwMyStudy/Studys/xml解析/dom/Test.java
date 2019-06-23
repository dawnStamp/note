package xml解析.dom;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 * DOM解析XML
 * 
 * @author oracleOAEC
 *
 */
public class Test {

	public static void main(String[] args) throws Exception {
		//创建一个DocumentBuilderFactory的对象
		DocumentBuilderFactory dbf= DocumentBuilderFactory.newInstance();

		//创建DocumentBuilder对象
		DocumentBuilder db = dbf.newDocumentBuilder();

		//通过DocumentBuilder对象的parse方法加载First.xml文件到当前项目下
		Document d = db.parse("Studys/xml/pigs.xml");


		//获取所有pig节点的集合
		NodeList pigList = d.getElementsByTagName("pig");

		//通过NodeList的getLength()方法可以获取piglist的长度
		System.out.println("一共有"+pigList.getLength()+"头小猪");

		for(int i = 0;i<pigList.getLength();i++){
			System.out.println("下面开始展示第"+(i+1)+"个小猪的私猪信息");

			//通过Item(..)方法 获取一个字节 pigList的索引值从0开始
			Node node = pigList.item(0);

			//获取pig节点的所有属性集合
			NamedNodeMap attrs =node.getAttributes();

			System.out.println("第"+(i+1)+"个小猪共有"+attrs.getLength()+"个属性");

			for(int j =0;j<attrs.getLength();j++){
				//获取attrs中的第一个属性
				Node attr = attrs.item(j);
				//获取属性的名称
				String name = attr.getNodeName();
				//获取属性的值
				String value = attr.getNodeValue();
				System.out.print("属性名"+name);
				System.out.println("----属性值"+value);
			}





			//解析pig节点的子节点
			NodeList chileNodes =node.getChildNodes();
			System.out.println("第"+(i+1)+"只小猪共有"+chileNodes.getLength()+"个子节点");	

			for(int j = 0;j<chileNodes.getLength(); j++){
				Node nod =chileNodes.item(j);

				//区分出text类型的节点和element类型的节点
				if(nod.getNodeType()==Node.ELEMENT_NODE){
					System.out.print("第"+(j+1)+"个节点的节点名为："+nod.getNodeName());
					System.out.println("----节点值为："+nod.getFirstChild().getNodeValue());
				}
			}
			System.out.println("==============================结束展示第"+(i+1)+"只小猪的私猪信息=============================");
		}
	}
}
