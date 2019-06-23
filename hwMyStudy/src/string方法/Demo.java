package string方法;

/**
 * 创建String的两种方法：
 * 1.String str = "你好";(常用 )
 * 2.String str = new String("你好")；
 * 
 * 
 * 一.
 * 	
 * 	String s1 ="abcd";
 * 	String s2 ="abcd";
 * 	s1==s2;   true
 * 
 * s2会在字符串池中找。有么有一模一样的值存在，
 * 	如果没有。则开辟一块新的位置；
 * 	如果有，则将s2和找到的那快位置直接绑定
 * 
 * 二.
 * 	String s1 = new String("abcd");
 * 	String s2 = new String("abcd");
 * 	s1==s2;    false
 * 
 *  创建对象的第一步就是开辟一块内存空间，所有s1和s2不是同一块内存空间
 *  
 *  1.Strin对象是不可变的
 *  2.类中每一个看来会修改String值的方法，其实都是创建了一个新的String对象
 *  String str = "你好"
 *  str = str+"123"        你好123
 *  
 *  3.String的只读特性带来效率优化可能
 *  4.系统对String的非修改操作处理效率很高，远远超过另外两个字符串类StringBuffer和StringBuilder
 * 
 * 
 *  String常用方法：
 *   1.length()
 *   2.substring()
 *   3.split()
 *   4.equals()
 *   5.isEmpty()
 *   6.startWith()
 * 
 * 
 * @author oracleOAEC
 *
 */


public class Demo {

	private static CharSequence target;
	private static CharSequence replacement;

	public static void main(String[] args) {
		//创建String
		/*String str = "你好";
				
		String ss = new String("你好");
		System.out.println(ss);*/
		
		String str = "ab,ab,cad";
		
	
		//索引
		int le = str.length();//获取字符串长度
		int le1=str.indexOf("b");//搜索该元素在字符串第一次出现的位置
		int le2=str.lastIndexOf("b");//搜索该元素在字符串最后一次出现的位置
		char le3=str.charAt(0);//返回字符串中index位置上的字符
		char[] le4 =str.toCharArray();//把字符串转换为一个字符数组
		String le5 = String.valueOf(1);//将int类型数转换为字符串
		String le6 = str.toLowerCase();//将String中所有字符都转换为小写
		String le7 = str.toUpperCase();//将String中所有字符都转换为大写
		String le8 = str.replace("a", "z");//拿z元素替换原字符串中a元素
		String[] le9 = str.split("b");//根据参数将原字符串分割成若干个字符串
		for(String s:le9){
			System.out.println(s);
		}
		String le10 = str.trim();//返回一个新字符串，它去除了原字符串收尾的空格
		String le11 = str.substring(3);//截取从索引后面的所有字符
		String le12 = str.substring(1,3);//截取从索引1开始到索引3之间的字符
		boolean le13 = str.equals("1");//判断此字符串与指定的字符串比较是否相等
		boolean le14 = str.startsWith("a");//判断此字符串是否以指定的字符串开始
		boolean le15 = str.endsWith("a");//判断此字符串是否以指定的字符串结束
		boolean le16 = str.contains("a");//判断此字符串是否包含指定的字符串序列
		boolean le17 = str.isEmpty();//此字符串长度为0时，返回true
		
		System.out.println(le);
		System.out.println(le1);
		System.out.println(le2);
		System.out.println(le3);
		System.out.println(le4);
		System.out.println(le5);
		System.out.println(le6);
		System.out.println(le7);
		System.out.println(le8);
		System.out.println(le10);
		System.out.println(le11);
		System.out.println(le12);
		System.out.println(le13);
		System.out.println(le14);
		System.out.println(le15);
		System.out.println(le16);
		System.out.println(le17);
	}
}
