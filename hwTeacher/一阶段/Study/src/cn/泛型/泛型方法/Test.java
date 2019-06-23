package cn.泛型.泛型方法;

/**
 * 泛型方法
 * 		泛型方法中的泛型，只可以在本方法中使用
 * 		
 *
 */
public class Test {

	public static void main(String[] args) {
		Human hu = new Human();
		String ss = hu.<String>eat("zhangsan");
		Integer in = hu.<Integer>eat(1);
		System.out.println(ss);
		System.out.println(in);
		
	}
}
