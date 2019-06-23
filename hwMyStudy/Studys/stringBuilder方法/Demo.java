package stringBuilder方法;

/**
 * String 对象一旦创建就不能改变。
 * 如果需要进行大量的字符串修改操作，应该使用StringBuilder/StringBuffer或字符数组
 * char[] ch ={'你'，'好'}; 
 * 最终结果可以转换会String类型
 * 
 * StringBuffer
 * 		线程安全的可变字符序列
 * 		通过某些方法调用可以改变字符串的长度和内容
 * 		字符串缓冲区都有一定的容量，如果缓冲区溢出，则此容量自动增大
 * 
 * StringBuilder
 * 		从jdk5开始，为StringBuffer类补充了一些内容
 * 		与StringBuffer相比，通常优先使用StringBuilder类，因为它支持所有相同的操作
 * 		但由于它不执行同步，所以速度更快
 * 
 *String和StringBuffer/StringBuilder
 *		1.String的值不能被修改
 *		StringBuffer/StringBuilder可以被修改
 *		2.对字符串的值进行修改，使用StringBuilder/StringBuffer会更方便
 *		StringBuffer/StringBuilder会提供一些对字符串的值进行修改的方法
 *	
 *什么时候用String？什么时候用StringBuilder
 *		少量修改操作的时候，使用String
 *		大量修改操作的时候，使用StringBuilder
 *
 *平常全用String，设置文件的相关操作就StringBuilder
 * @author oracleOAEC
 *
 */
public class Demo {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("abc123");
		
//		String s1 = str.toString();//转换为字符串
//		int s2 = str.length();//算长度
//		StringBuilder s3 = str.insert(0, true);//插入
//		StringBuilder s4 = str.delete(0, 3);//删除
//		StringBuilder s5 = str.reverse();//反转
		StringBuilder s6 = str.replace(1,3,"xxx");//替换
		
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
//		System.out.println(s4);
//		System.out.println(s5);
		System.out.println(s6);
	}
}
