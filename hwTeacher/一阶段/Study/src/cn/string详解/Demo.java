package cn.string详解;

/**
 * 创建string的两种方式：
 * 		一：String str = "你好";(常用)
 * 		二：String str = new String("你好");
 * 		
 *问题一：
 *			String s1="abcd";
 *			String s2="abcd";
 *			s1==s2				true
 *
 *			s2会在字符串池中找，有没有一模一样的值存在，
 *					如果没有，则开辟一块新的位置，
 *					如果有，则将s2和找到的那块位置直接绑定
 *
 *	问题二：
 *			String s1=new String("abcd");
 *			String s2=new String("abcd");
 *			s1==s2				false
 *
 *			创建对象的第一步就是开辟一块内存空间，所有s1和s2不是同一块内存空间
 *
 *		1.String对象是不可变的
 *		2.类中每一个看来会修改String值的方法，其实都是创建了一个新的String对象
 *		3.String的只读特性带来效率优化可能
 *		4.系统对String的非修改操作处理效率很高，远远超过另外两个字符串类StringBuffer和StringBuilder
 *
 *		String 常用方法：
 *				1.length()
 *				2.substring()
 *				3.split()
 *				4.equals()
 *				5.isEmpty()
 *				6.startWith()
 *
 */
public class Demo {
public int i  =20;
	public static void main(String[] args) {
		/*String str = "你好";
		str = str+"123";*/
		//索引
		String str = "abc,bc,a";
		
		if(!str.isEmpty()){
			str+="hahaha";
			System.out.println("1111111");
		}
		
		
		
		
		int le = str.length();
		int i1 = str.indexOf("b");
		int i2 = str.lastIndexOf("b");
		char i3= str.charAt(0);
		
		String st = str.replace("a", "z");
//		System.out.println(st);
		
		String i = String.valueOf(true);
//		System.out.println(i);
		
		String[] i4 = str.split(",");
		/*for (String s : i4) {
			System.out.println(s);
		}*/
		
		String syr = str.substring(3);
		String sss = str.substring(2, 4);
		System.out.println(syr);
		
		String name = str.trim();
		System.out.println(name);
		
		boolean bo = str.contains("a");
		System.out.println(bo);
		
//		System.out.println(le);
//		System.out.println(i1);
//		System.out.println(i2);
//		System.out.println(i3);
	}
}
