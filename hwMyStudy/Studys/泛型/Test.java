package ����;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * ���� jdk1.5����������ԣ�Ҳ������Ҫ��һ������
 * ���Ϳ����ڱ����ʱ�����������͵İ�ȫ
 * ���Ϳ�����ߴ������չ�Ժ�������
 * 
 * ���ͣ�
 * 		1.������
 *ps: 		
 *  	1.�������治���������������
 *  	2.��������ʹ���˷��ͣ�����ζ�Ų�������ͨ��д��
 *  	3.���������ͬʱ���ö�����Ͳ���
 *  	4.��������Լ̳з�����
 *  	5.���������ʵ�ַ��ͽӿ�
 *  	6.ͬһ�������࣬���ʵ����ʱ������ʵ�����Ͳ�ͬ������Щ����������ǲ����ݵģ������໥��ֵ
 *  
 *  extends
 *  	<T extends XXX>��T��һ�����ƣ�����Ҫ�̳�XXX���ܱ���ͨ��
 *  
 *  	Ĭ�� extends Object
 *  
 *  ��ô���ps�еĵ����㣿
 *  	ͨ��� ?   ��������һ������
 *  	����ʹ��extends
 *  	����ʹ��super
 * @author oracleOAEC
 *
 */
public class Test {

	public static void main(String[] args) {
		/*ArrayList list = new ArrayList();
		list.add("����,abc123");
		list.add("����,abc123");
		list.add(1);
		list.add(7);
		
		String obj = (String)list.get(0);
		System.out.println(obj);*/
		
		/*Human<Integer,String> human = new Human<Integer,String>();
		human.setName(1);*/
		
		
		
		/*Address add = new Address();
		add.setProv("����ʡ");
		add.setShi("�ϲ���");
		add.setYoubian(330200);
		add.setJiedao("�������");
		
		Human hu = new Human();
		hu.setName("����");
		hu.setAddress(add);*/
	
		Human<Integer,Address>hu = new Human<Integer,Address>();
		/*Human<List>hu = new Human<List>();
		Human<? super ArrayList> hu2 = hu;*/
	}
	
}
