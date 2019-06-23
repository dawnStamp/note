package cn.StringBuilderBuffer;

/**
 * String 对象一旦创建就不能改变。
 * 如果需要进行大量的字符串修改操作，应该使用StringBuilder/StringBuffer或字符数组
 * 最终结果可以转换回String类型
 * 
 * StringBuffer
 * 		线程安全的可变字符序列
 * 		通过某些方法调用可以改变字符串的长度和内容
 * 		字符串缓冲区都有一定的容量，如果缓冲区溢出，则此容量自动增大。
 * 
 * StringBuilder
 * 		从JDK5开始，为StringBuffer类补充了一些内容
 * 		与StringBuffer相比，通常应该优先使用StringBuilder类，
 * 		因为他支持所有相同的操作，但由于他不执行同步，所以速度更快
 * 
 * String 和StringBuffer/StringBuilder
 * 		1.String的值不能被修改
 * 			StringBuffer/StringBuilder可以被修改
 * 		
 * 		2.对字符串的值进行修改，使用StringBuffer/StringBuilder会更方便
 * 			StringBuffer/StringBuilder会提供一些对字符串的值进行修改的方法
 * 
 * 什么时候用String?什么时候用StringBuilder
 * 		少量修改操作的时候，使用String
 * 		大量修改操作的时候，使用StringBuilder
 * 
 */
public class Test {

	public static void main(String[] args) {
		String ss = "abc123";
		StringBuilder str  = new StringBuilder(ss);
		StringBuilder sb = str.replace(2, 3, "xxxx");
		
		
		String s =sb.toString();
		System.out.println(s);
		/*
		str.append("123");
		str.toString();
		str.length();
		str.insert(offset, b);
		str.delete(start, end);//删除从start开始，到end结束
		str.reverse();//反转
		str.replace(start, end, str);
		str.charAt(index);//根据索引查找内容
		str.indexOf(str);//根据内容查找第一个出现的索引
		str.lastIndexOf(str);
		str.substring(start);*/
		
//		StringBuilder sb = str.replace(2, 3, "xxxx");//从第一个参数到第二参数之前的所有内容替换为第三个参数
//		StringBuilder sb2 = str.insert(1, "999");//在第一个参数之前插入第二个参数
		
		String str2 = "abc123";
		
		String s1 = str2.substring(0, 3);
		String s2 = str2.substring(3, 6);
		String res = s1+"999"+s2;
		
		
		System.out.println(res);
	}
}
