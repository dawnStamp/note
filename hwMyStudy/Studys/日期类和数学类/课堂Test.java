package ���������ѧ��;

import java.util.Calendar;
import java.util.Scanner;

public class ����Test {
	
	public static void main(String[] args) {
		Calendar ca =Calendar.getInstance();//��ȡ����
		
		//��һ��
		/*int i = ca.get(Calendar.YEAR)+1;
		int i2 = ca.get(Calendar.MONTH)+1;
		int i3 = ca.get(Calendar.DAY_OF_MONTH);
		int i4 = ca.get(Calendar.WEDNESDAY);
		System.out.println(i+"��"+i2+"��"+i3+"��"+"   ���"+i4);*/
		
		//�ڶ���
		/*int i = ca.get(Calendar.YEAR);
		int i2 = ca.get(Calendar.MONTH)+2;
		int i3 = ca.get(Calendar.DAY_OF_MONTH);
		int i4 = ca.get(Calendar.WEDNESDAY);
		System.out.println(i+"��"+i2+"��"+i3+"��");*/
		
		//������
		/*ca.set(2008,11,1);
		ca.add(Calendar.DAY_OF_MONTH,-1);
		System.out.println(ca.get(Calendar.DAY_OF_MONTH));*/
		
		//������
		ca.set(2018,11,29);
		int i3 = ca.get(Calendar.DAY_OF_YEAR);
		int i4 = ca.get(Calendar.WEEK_OF_YEAR);
		System.out.println("��"+i3+"��"+i4+"��");
	}

}
