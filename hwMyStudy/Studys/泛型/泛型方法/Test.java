package 泛型.泛型方法;

/**
 * 泛型方法
 * 		泛型方法中的泛型，只可以在本方法中使用
 * 
 * 
 * 
 * @author oracleOAEC
 *
 */
public class Test {

	public static void main(String[] args) {
		Human hu = new Human();
		String st = hu.<String>eat("张三");
		System.out.println(st);
		Integer in = hu.<Integer>eat(1);
		System.out.println(in);
		
		
	}
}
