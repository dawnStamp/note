package cn.常用类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import cn.传参.Animal;

/**
 * System.currentTimeMillis()         获取当前系统时间(时间戳)
 * 
 * Date日期类
 *			无参构造方法 -->获取当前日期
 *			long参数的构造方法-->获取指定日期
 *
 *SimpleDateFormat日期格式类
 *			
 *Calendar日历类
 *
 *题目1：
 *			一年后的今天
 *
 *题目2：
 *			下个月的今天
 *
 *题目3：
 *			任意一个月的最后一天
 *
 *题目4：
 *			指定日期，计算这个日期是今年的第几天，第几个星期
 *
 *Math数学类				初等指数   对数  平方根   三角函数
 *			
 *Random随机数类
 *				Random
 *				Math.random()
 *				System.currentTimeMillis()
 *
 */
public class Test {
	public static void main(String[] args) throws ParseException {		
		/*System.out.println(Math.abs(1));//绝对值
		System.out.println(Math.max(2.22, 5.55));//最大值
		System.out.println(Math.min(12, 21));//最小值
		System.out.println(Math.PI);//圆周率
		System.out.println(Math.pow(3, 3));//计算数的次方
		System.out.println(Math.sqrt(16));//平方根
		System.out.println(Math.cbrt(8));//立方根
		System.out.println(Math.hypot(3, 4));//(3的平方+4的平方)的平方根
		System.out.println(Math.ceil(-10.2));//向上取值
		System.out.println(Math.floor(-10.2));//向下取值
		System.out.println(Math.random());//0-1
		System.out.println(Math.rint(2.5));//上下取整
		System.out.println(Math.round(3.5));//四舍五入
		 */		
		
		/*//一年后的今天
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR, 1);
		System.out.println(cal.get(Calendar.YEAR)+"."+(cal.get(Calendar.MONTH)+1)+"."+cal.get(Calendar.DAY_OF_MONTH));
		
		//下个月的今天
		Calendar cal2 = Calendar.getInstance();
		cal2.add(Calendar.MONTH, 1);
		System.out.println(cal2.get(Calendar.YEAR)+"."+(cal2.get(Calendar.MONTH)+1)+"."+cal2.get(Calendar.DAY_OF_MONTH));
		
		//任意一个月的最后一天
		Calendar cal3 = Calendar.getInstance();
		cal3.set(cal3.get(Calendar.YEAR),5,1);
		cal3.add(Calendar.DAY_OF_MONTH, -1);
		System.out.println(cal3.get(Calendar.YEAR)+"."+(cal3.get(Calendar.MONTH)+1)+"."+cal3.get(Calendar.DAY_OF_MONTH));
		
		//指定日期，计算这个日期是今年的第几天，第几个星期
		Calendar cal4 = Calendar.getInstance();
		cal4.set(2018, 11,29);
		
		int i = cal4.get(Calendar.DAY_OF_YEAR);
		int c = cal4.get(Calendar.WEEK_OF_YEAR);
		System.out.println(i+","+c);*/
		
		/*
		//获取Calendar对象
		Calendar cal = Calendar.getInstance();//getInstance()获取对象
		cal.add(Calendar.DAY_OF_MONTH, -1);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		
		Calendar cal = Calendar.getInstance();//getInstance()获取对象
		cal.set(1998,7,24,8,24,59);
		
		Calendar cal2 = Calendar.getInstance();
		cal.set(2018,7,24,8,24,59);
		
		int i = cal.compareTo(cal);
		System.out.println(i);
		 */
		
		/*
		Date date = cal.getTime();//getTime()获取时间
		cal.setTime(new Date());//将Date设置到cal中
	
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		System.out.println(year+"年"+month+"月"+day+"日"+hour+"时"+minute+"分"+second+"秒");
		*/
		
		
		
		/*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str = sdf.format(new Date());
		Date date = sdf.parse("2018-12-22 20:20:22");
		System.out.println(date);*/
		
//		System.out.println(System.currentTimeMillis());
		
		/*
		Date da = new Date();
		System.out.println(da);
		
		long lon = da.getTime();//根据日期获取时间戳
		da.setTime(1592784000000L);//将指定日期设置到da中
		boolean bo = da.before(new Date());
		boolean bo = da.after(new Date());
		
		//前面的时间大于后面的时间(1)  相等(0)  前面的时间小于后面的时间(-1)
		int bo = da.compareTo(new Date());
		
		String str = da.toString();
		*/
	}
}
