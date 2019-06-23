package xml����.dom;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 * DOM����XML
 * 
 * @author oracleOAEC
 *
 */
public class Test {

	public static void main(String[] args) throws Exception {
		//����һ��DocumentBuilderFactory�Ķ���
		DocumentBuilderFactory dbf= DocumentBuilderFactory.newInstance();

		//����DocumentBuilder����
		DocumentBuilder db = dbf.newDocumentBuilder();

		//ͨ��DocumentBuilder�����parse��������First.xml�ļ�����ǰ��Ŀ��
		Document d = db.parse("Studys/xml/pigs.xml");


		//��ȡ����pig�ڵ�ļ���
		NodeList pigList = d.getElementsByTagName("pig");

		//ͨ��NodeList��getLength()�������Ի�ȡpiglist�ĳ���
		System.out.println("һ����"+pigList.getLength()+"ͷС��");

		for(int i = 0;i<pigList.getLength();i++){
			System.out.println("���濪ʼչʾ��"+(i+1)+"��С���˽����Ϣ");

			//ͨ��Item(..)���� ��ȡһ���ֽ� pigList������ֵ��0��ʼ
			Node node = pigList.item(0);

			//��ȡpig�ڵ���������Լ���
			NamedNodeMap attrs =node.getAttributes();

			System.out.println("��"+(i+1)+"��С����"+attrs.getLength()+"������");

			for(int j =0;j<attrs.getLength();j++){
				//��ȡattrs�еĵ�һ������
				Node attr = attrs.item(j);
				//��ȡ���Ե�����
				String name = attr.getNodeName();
				//��ȡ���Ե�ֵ
				String value = attr.getNodeValue();
				System.out.print("������"+name);
				System.out.println("----����ֵ"+value);
			}





			//����pig�ڵ���ӽڵ�
			NodeList chileNodes =node.getChildNodes();
			System.out.println("��"+(i+1)+"ֻС����"+chileNodes.getLength()+"���ӽڵ�");	

			for(int j = 0;j<chileNodes.getLength(); j++){
				Node nod =chileNodes.item(j);

				//���ֳ�text���͵Ľڵ��element���͵Ľڵ�
				if(nod.getNodeType()==Node.ELEMENT_NODE){
					System.out.print("��"+(j+1)+"���ڵ�Ľڵ���Ϊ��"+nod.getNodeName());
					System.out.println("----�ڵ�ֵΪ��"+nod.getFirstChild().getNodeValue());
				}
			}
			System.out.println("==============================����չʾ��"+(i+1)+"ֻС���˽����Ϣ=============================");
		}
	}
}
