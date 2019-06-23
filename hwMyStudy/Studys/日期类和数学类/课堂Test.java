package 日期类和数学类;

import java.util.Calendar;
import java.util.Scanner;

public class 课堂Test {
	
	public static void main(String[] args) {
		Calendar ca =Calendar.getInstance();//获取对象
		
		//第一题
		/*int i = ca.get(Calendar.YEAR)+1;
		int i2 = ca.get(Calendar.MONTH)+1;
		int i3 = ca.get(Calendar.DAY_OF_MONTH);
		int i4 = ca.get(Calendar.WEDNESDAY);
		System.out.println(i+"年"+i2+"月"+i3+"日"+"   礼拜"+i4);*/
		
		//第二题
		/*int i = ca.get(Calendar.YEAR);
		int i2 = ca.get(Calendar.MONTH)+2;
		int i3 = ca.get(Calendar.DAY_OF_MONTH);
		int i4 = ca.get(Calendar.WEDNESDAY);
		System.out.println(i+"年"+i2+"月"+i3+"日");*/
		
		//第三题
		/*ca.set(2008,11,1);
		ca.add(Calendar.DAY_OF_MONTH,-1);
		System.out.println(ca.get(Calendar.DAY_OF_MONTH));*/
		
		//第四题
		ca.set(2018,11,29);
		int i3 = ca.get(Calendar.DAY_OF_YEAR);
		int i4 = ca.get(Calendar.WEEK_OF_YEAR);
		System.out.println("第"+i3+"天"+i4+"周");
	}

}
