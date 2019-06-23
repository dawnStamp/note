package 日期类和数学类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Date日期类
 *
 * System.currentTimeMillis()  获取当前系统时间(时间戳)
 * 
 * 无参构造方法-->获取当前日期
 * long参数构造方法-->获取指定日期
 * 
 * SimpleDateFormat  日期格式类		
 * 
 * Calendar日历类
 * 
 * 
 * Math  初等指数  对数  平方根  三角函数
 * 
 * @author oracleOAEC
 *
 */

public class Test {

	public static void main(String[] args) throws ParseException {
		
		/*Date da = new Date();
		long lon = da.getTime();//根据日期过去时间戳
		da.setTime(1542784000000L);//将指定日期设置到da中
		
		boolean bo = da.before(new Date());
		boolean bo1 = da.after(new Date());
		//1(前面的时间大于后面的时间)  0(相等)  -1(前面的时间小于后面的时间) 
		int bo2 = da.compareTo(new Date());
		
		String st = da.toString();//转换为字符串
		System.out.println(bo2);*/
		
		/*SimpleDateFormat si = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str = si.format(new Date());
		Date date = si.parse("2018-12-22 20:20:20");
		System.out.println(date);*/
		
		//获取Calendar对象
		Calendar ca =Calendar.getInstance();//获取对象
		ca.add(Calendar.DAY_OF_MONTH,1);//添加
		System.out.println(ca.get(Calendar.DAY_OF_MONTH));
		
		/*Date date = ca.getTime();//获取
		ca.setTime(new Date());//将Date设置到ca中
		
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
