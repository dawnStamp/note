package cn.������;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import cn.����.Animal;

/**
 * System.currentTimeMillis()         ��ȡ��ǰϵͳʱ��(ʱ���)
 * 
 * Date������
 *			�޲ι��췽�� -->��ȡ��ǰ����
 *			long�����Ĺ��췽��-->��ȡָ������
 *
 *SimpleDateFormat���ڸ�ʽ��
 *			
 *Calendar������
 *
 *��Ŀ1��
 *			һ���Ľ���
 *
 *��Ŀ2��
 *			�¸��µĽ���
 *
 *��Ŀ3��
 *			����һ���µ����һ��
 *
 *��Ŀ4��
 *			ָ�����ڣ�������������ǽ���ĵڼ��죬�ڼ�������
 *
 *Math��ѧ��				����ָ��   ����  ƽ����   ���Ǻ���
 *			
 *Random�������
 *				Random
 *				Math.random()
 *				System.currentTimeMillis()
 *
 */
public class Test {
	public static void main(String[] args) throws ParseException {		
		/*System.out.println(Math.abs(1));//����ֵ
		System.out.println(Math.max(2.22, 5.55));//���ֵ
		System.out.println(Math.min(12, 21));//��Сֵ
		System.out.println(Math.PI);//Բ����
		System.out.println(Math.pow(3, 3));//�������Ĵη�
		System.out.println(Math.sqrt(16));//ƽ����
		System.out.println(Math.cbrt(8));//������
		System.out.println(Math.hypot(3, 4));//(3��ƽ��+4��ƽ��)��ƽ����
		System.out.println(Math.ceil(-10.2));//����ȡֵ
		System.out.println(Math.floor(-10.2));//����ȡֵ
		System.out.println(Math.random());//0-1
		System.out.println(Math.rint(2.5));//����ȡ��
		System.out.println(Math.round(3.5));//��������
		 */		
		
		/*//һ���Ľ���
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR, 1);
		System.out.println(cal.get(Calendar.YEAR)+"."+(cal.get(Calendar.MONTH)+1)+"."+cal.get(Calendar.DAY_OF_MONTH));
		
		//�¸��µĽ���
		Calendar cal2 = Calendar.getInstance();
		cal2.add(Calendar.MONTH, 1);
		System.out.println(cal2.get(Calendar.YEAR)+"."+(cal2.get(Calendar.MONTH)+1)+"."+cal2.get(Calendar.DAY_OF_MONTH));
		
		//����һ���µ����һ��
		Calendar cal3 = Calendar.getInstance();
		cal3.set(cal3.get(Calendar.YEAR),5,1);
		cal3.add(Calendar.DAY_OF_MONTH, -1);
		System.out.println(cal3.get(Calendar.YEAR)+"."+(cal3.get(Calendar.MONTH)+1)+"."+cal3.get(Calendar.DAY_OF_MONTH));
		
		//ָ�����ڣ�������������ǽ���ĵڼ��죬�ڼ�������
		Calendar cal4 = Calendar.getInstance();
		cal4.set(2018, 11,29);
		
		int i = cal4.get(Calendar.DAY_OF_YEAR);
		int c = cal4.get(Calendar.WEEK_OF_YEAR);
		System.out.println(i+","+c);*/
		
		/*
		//��ȡCalendar����
		Calendar cal = Calendar.getInstance();//getInstance()��ȡ����
		cal.add(Calendar.DAY_OF_MONTH, -1);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		
		Calendar cal = Calendar.getInstance();//getInstance()��ȡ����
		cal.set(1998,7,24,8,24,59);
		
		Calendar cal2 = Calendar.getInstance();
		cal.set(2018,7,24,8,24,59);
		
		int i = cal.compareTo(cal);
		System.out.println(i);
		 */
		
		/*
		Date date = cal.getTime();//getTime()��ȡʱ��
		cal.setTime(new Date());//��Date���õ�cal��
	
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		System.out.println(year+"��"+month+"��"+day+"��"+hour+"ʱ"+minute+"��"+second+"��");
		*/
		
		
		
		/*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str = sdf.format(new Date());
		Date date = sdf.parse("2018-12-22 20:20:22");
		System.out.println(date);*/
		
//		System.out.println(System.currentTimeMillis());
		
		/*
		Date da = new Date();
		System.out.println(da);
		
		long lon = da.getTime();//�������ڻ�ȡʱ���
		da.setTime(1592784000000L);//��ָ���������õ�da��
		boolean bo = da.before(new Date());
		boolean bo = da.after(new Date());
		
		//ǰ���ʱ����ں����ʱ��(1)  ���(0)  ǰ���ʱ��С�ں����ʱ��(-1)
		int bo = da.compareTo(new Date());
		
		String str = da.toString();
		*/
	}
}
