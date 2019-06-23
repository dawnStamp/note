package xml����.dom;

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
		
		NodeList nodeList = document.getElementsByTagName("girl");//��ȡ����girl�ڵ������
		
		System.out.println("һ����"+nodeList.getLength()+"����ֽ");
		
		for (int i = 0; i < nodeList.getLength(); i++) {
			System.out.println("���濪ʼչʾ��"+(i+1)+"����ֽ��˽����Ϣ");
			
			Node node = nodeList.item(i);//ѭ����ȡ���е�girl
			NamedNodeMap nnm = node.getAttributes();
			
			System.out.println("��"+(i+1)+"����ֽ����"+nnm.getLength()+"������");
			
			for (int j = 0; j < nnm.getLength(); j++) {
				Node no = nnm.item(j);//��ȡ����
				System.out.print("��������"+no.getNodeName());
				System.out.println("----����ֵ��"+no.getNodeValue());
			}
			
			NodeList childNodes  = node.getChildNodes();
			System.out.println("��"+(i+1)+"����ֽ����"+childNodes.getLength()+"���ӽڵ�");
			
			for (int j = 0; j < childNodes.getLength(); j++) {
				Node nn = childNodes.item(j);
				
				//���ֳ�text���͵Ľڵ��element���͵Ľڵ�
				if(nn.getNodeType()==Node.ELEMENT_NODE){
					System.out.print("��"+(j+1)+"���ڵ�Ľڵ���Ϊ��"+nn.getNodeName());
					System.out.println("----�ڵ�ֵΪ��"+nn.getFirstChild().getNodeValue());
				}
			}
			System.out.println("==============================����չʾ��"+(i+1)+"����ֽ��˽����Ϣ=============================");
		}
		
	}
}