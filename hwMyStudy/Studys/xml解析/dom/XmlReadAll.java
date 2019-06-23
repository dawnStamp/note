package xml解析.dom;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XmlReadAll {

	public static void main(String[] args) throws Exception {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		
		Document document = db.parse("Studys/xml/girls.xml");
		
		NodeList nodeList = document.getElementsByTagName("girl");//获取所有girl节点的内容
		
		System.out.println("一共有"+nodeList.getLength()+"个妹纸");
		
		for (int i = 0; i < nodeList.getLength(); i++) {
			System.out.println("下面开始展示第"+(i+1)+"个妹纸的私人信息");
			
			Node node = nodeList.item(i);//循环获取所有的girl
			NamedNodeMap nnm = node.getAttributes();
			
			System.out.println("第"+(i+1)+"个妹纸共有"+nnm.getLength()+"个属性");
			
			for (int j = 0; j < nnm.getLength(); j++) {
				Node no = nnm.item(j);//获取属性
				System.out.print("属性名："+no.getNodeName());
				System.out.println("----属性值："+no.getNodeValue());
			}
			
			NodeList childNodes  = node.getChildNodes();
			System.out.println("第"+(i+1)+"个妹纸共有"+childNodes.getLength()+"个子节点");
			
			for (int j = 0; j < childNodes.getLength(); j++) {
				Node nn = childNodes.item(j);
				
				//区分出text类型的节点和element类型的节点
				if(nn.getNodeType()==Node.ELEMENT_NODE){
					System.out.print("第"+(j+1)+"个节点的节点名为："+nn.getNodeName());
					System.out.println("----节点值为："+nn.getFirstChild().getNodeValue());
				}
			}
			System.out.println("==============================结束展示第"+(i+1)+"个妹纸的私人信息=============================");
		}
		
	}
}