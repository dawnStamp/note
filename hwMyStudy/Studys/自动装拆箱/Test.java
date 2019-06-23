package 自动装拆箱;
/**
 * java不是一门纯面向对象语言
 * 		面向对象指的是万事万物皆为对象
 * 		所有的东西都是对象，程序员操作这些对象，来完成功能
 * 
 * 		基本数据类型不符合面向对象的思想
 * 
 * 装箱拆箱
 * 
 * 8大数据类型对应的装箱类型
 * 	基本数据类型：	double,float,long,int,short,byte,char,boolean
 * 	引用数据类型：	Double,Float,Long,Integer,Short,Byte,Character,Boolean
 * 
 * 
 * 
 * @author oracleOAEC
 *
 */
public class Test {

	public static void main(String[] args) {
		//装箱
	/*	int i = 10;
		Integer in = new Integer(i);
		System.out.println(in);
		double i1 = 10.0;
		Double i2 = new Double(i1);
		System.out.println(i2);
		char i3 = 1;
		Character i4 = new Character(i3);
		System.out.println(i4);
		boolean b1 = true;
		Boolean b2 = new Boolean(b1);
		System.out.println(b2);
		
		//自动装箱
		Integer in2 = 10;
		System.out.println(in2);
		
		//拆箱
		int a = in.intValue();
		System.out.println(a);
		//自动拆箱
		int b = in;
		System.out.println(b);*/
		
		Integer i = 10;
		Integer a = i+10;
		double d =i.doubleValue();
		
		//System.out.println(a);
		//将Integer类型的和int类型的进行比较
		boolean bo = i.equals(10);
		//System.out.println(bo);
		String str = i.toString();//转换成String类型
		//i.compareTo(anotherInteger);
		int abc = Integer.max(10, 20);
		int b =i.BYTES;//算
		System.out.println(b);
		
	}
}
