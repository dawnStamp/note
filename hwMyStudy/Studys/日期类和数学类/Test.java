package ���������ѧ��;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Date������
 *
 * System.currentTimeMillis()  ��ȡ��ǰϵͳʱ��(ʱ���)
 * 
 * �޲ι��췽��-->��ȡ��ǰ����
 * long�������췽��-->��ȡָ������
 * 
 * SimpleDateFormat  ���ڸ�ʽ��		
 * 
 * Calendar������
 * 
 * 
 * Math  ����ָ��  ����  ƽ����  ���Ǻ���
 * 
 * @author oracleOAEC
 *
 */

public class Test {

	public static void main(String[] args) throws ParseException {
		
		/*Date da = new Date();
		long lon = da.getTime();//�������ڹ�ȥʱ���
		da.setTime(1542784000000L);//��ָ���������õ�da��
		
		boolean bo = da.before(new Date());
		boolean bo1 = da.after(new Date());
		//1(ǰ���ʱ����ں����ʱ��)  0(���)  -1(ǰ���ʱ��С�ں����ʱ��) 
		int bo2 = da.compareTo(new Date());
		
		String st = da.toString();//ת��Ϊ�ַ���
		System.out.println(bo2);*/
		
		/*SimpleDateFormat si = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str = si.format(new Date());
		Date date = si.parse("2018-12-22 20:20:20");
		System.out.println(date);*/
		
		//��ȡCalendar����
		Calendar ca =Calendar.getInstance();//��ȡ����
		ca.add(Calendar.DAY_OF_MONTH,1);//���
		System.out.println(ca.get(Calendar.DAY_OF_MONTH));
		
		/*Date date = ca.getTime();//��ȡ
		ca.setTime(new Date());//��Date���õ�ca��
		
		//ca.set(1998,8,5);
		//System.out.println(ca);
		
		boolean li = ca.before(1998);
		boolean li1 = ca.after(1998);
		
		System.out.println(li);
		System.out.println(li1);*/
		
		
		/*int i = ca.get(Calendar.YEAR);
		int i2 = ca.get(Calendar.MONTH)+1;
		int i3 = ca.get(Calendar.DAY_OF_MONTH);
		int i4 = ca.get(Calendar.HOUR_OF_DAY); 
		int i5 = ca.get(Calendar.MINUTE);
		int i6 = ca.get(Calendar.SECOND); 
		System.out.println(i+"/"+i2+"/"+i3+"  "+i4+":"+i5+":"+i6);*/
	}

}
