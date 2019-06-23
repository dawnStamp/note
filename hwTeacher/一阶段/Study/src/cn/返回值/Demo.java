package cn.返回值;

/**
 * 方法中用void修饰，代表方法没有返回值
 *除了void,还可以使用其他的数据类型来使方法有返回值，但不能直接去掉void
 *如果方法有返回值，那么一定要使用return返回一个相同类型的数据
 *return一但执行，方法立即结束，返回到调用方法的位置继续执行剩余代码
 *
 *return 用于返回
 *
 */
public class Demo {
	
	public static void main(String[] args) {
		Demo de = new Demo();
		Animal i = de.aa();
		
		System.out.println(i.name);
		System.out.println(i.age);
		
	}
	
	/**
	 * 实例
	 * 
	 * 基本数据类型 变量名 = 值;
	 * 引用数据类型 对象名 = 值;
	 * 		int[]	{}   
	 * 		Animal    new Animal();
	 */
	public Animal aa(){
		Animal an = new Animal();
		int i = 10;
		an.age = 18;
		an.name = "旺财";
		return an;
	}
}
