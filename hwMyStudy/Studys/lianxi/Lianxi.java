package lianxi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Lianxi {

	public static void main(String[] args) {
		Random ro = new Random();
		String value;

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

		for(int i =1;i<=4;i++){//ѭ����һ�֣�һ���������ȷ��
			System.out.println("��"+i+"�飺");
			for(int j=1;j<=4;j++){//ÿһ��ѭ�����Ӽ�����ȡһ��ֵ����

				value = list.get(ro.nextInt(list.size()));

				System.out.print(value+"    ");

				list.remove(value);
			}
			System.out.println();
		}



	}
}
