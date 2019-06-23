package cn.装箱拆箱;

/**
 * Java不是一门纯面向对象语言
 * 		面向对象指的是万事万物皆为对象
 * 		所有的东西都是对象，程序员操作这些对象，来完成功能
 * 
 * 		基本数据类型不符合面向对象的思想
 *
 *装箱拆箱
 *
 *			8大基本数据类型对应的装箱类型：
 *					double-->Double
 *					float-->Float
 *					long-->Long
 *					short-->Short
 *					byte-->Byte
 *					boolean-->Boolean
 *					int-->Integer
 *					char-->Character
 */
public class Test {

	public static void main(String[] args) {
		/*//装箱
		Integer in = new Integer(10);
	
		//自动装箱
		Integer in2 = 10;
		
		//拆箱
		int a = in.intValue();
		
		//自动拆箱
		int b = in2;*/
		
		Integer i = 10;
		//Integer a= i+10;
//		double d = i.doubleValue();
//		double c = i;
		
		int z = 10;
		//将Integer类型的和int类型的进行比较
		boolean bo = i.equals(z);
		String str = i.toString();//转换成String类型
//		i.compareTo(anotherInteger);
		int abc = Integer.max(10, 20);
		
		String sr = "123";
		System.out.println(abc);
	}
}
