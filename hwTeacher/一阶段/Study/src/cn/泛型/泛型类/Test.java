package cn.����.������;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * ����jdk1.5����������ԣ�Ҳ������Ҫ��һ������
 * ���Ϳ����ڱ����ʱ�������Ͱ�ȫ
 * ���Ϳ�����ߴ������չ�Ժ�������
 * 
 * ���ͣ�
 * 		1.������
 *
 *ps:
 *			1.�����в����������������
 *			2.��������ʹ���˷��ͣ�����ζ�Ų�������ͨ��д��
 *			3.���������ͬʱ���ö�����Ͳ���
 *			4.��������Լ̳з�����
 *			5.���������ʵ�ַ��ͽӿ�
 *			6.ͬһ�������࣬���ʵ����ʱ������ʵ�����Ͳ�ͬ������Щ����������ǲ����ݵģ������໥��ֵ
 *
 *
 * extends
 * 		<T extends XXX>��T�Ӹ�һ�����ƣ�����Ҫ�̳�XXX���ܱ���ͨ��
 * 
 *			Ĭ�� extends Object
 *			
 *��ôȥ���ps�еĵ������أ�
 *			ͨ���?					��������һ������
 *			����ʹ��extends
 *			����ʹ��super
 */
public class Test {

	public static void main(String[] args) {
		
		Human<List> hu = new Human<List>();
		Human<? super ArrayList> hu2 = hu;
		
		
//		hu = hu2;
//		Human<Object> hu3 = new Human<Object>();
//		hu3 = hu;
//		hu3 = hu2;
		
		
		/*Human<Integer> human = new Human<Integer>();
		human.setName(1);
		Integer inte = human.ss(999);
		
		Human<String> human2 = new Human<String>();
		human2.setName("1");
		human2.ss("123");*/
		
	/*	Address add = new Address();
		add.setProv("����ʡ");
		add.setShi("�ϲ���");
		add.setYoubian(330013);
		add.setJiedao("˫�۶����");
		
		Human hu = new Human();
		hu.setName("����");
		hu.setAddress(add);*/

		
	}
}
