package cn.����.list.����2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("���ص���");
		list.add("����͢");
		list.add("�Ĵ�����");
		list.add("����ά��");
		list.add("����");
		list.add("��������");
		list.add("�ձ�");
		list.add("����");
		list.add("�й�");
		list.add("������");
		list.add("����");
		list.add("����ʱ");
		list.add("����");
		list.add("����¡");
		list.add("�鶼��˹");
		list.add("�����");
		
		Random rd = new Random();
		String value;
		
		for (int i = 1; i <= 4; i++) {//ѭ����һ�֣�һ���������ȷ��
			System.out.println("��"+i+"�飺");
			
			for (int j = 1; j <= 4; j++) {//ÿһ��ѭ�����Ӽ�����ȡһ��ֵ����
				
				value = list.get(rd.nextInt(list.size()));
				
				System.out.print(value+",");
				
				list.remove(value);
			}
			
			System.out.println();
		}
		
	}
}
