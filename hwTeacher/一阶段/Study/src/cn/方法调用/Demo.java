package cn.方法调用;

/**
 * 同一个java文件中
 * 
 * 一：
 * 		方法名();      两者都是静态的、或都是非静态的      					
 * 二：
 * 		创建对象，再调用
 * 		类名 对象名=new 类名();																	想要调用一个实例方法
 * 		对象名.方法名();
 * 三：
 * 		调用静态方法																							想要调用一个静态方法
 * 		类名.方法名();
 * 
 * 
 * 不同的java文件中
 * 一：
 * 		创建对象，再调用
 * 		类名 对象名=new 类名();																	想要调用一个实例方法
 * 		对象名.方法名();
 * 二：
 * 		调用静态方法
 * 		类名.方法名();																							想要调用一个静态方法
 * 
 * @author oracleOAEC
 */
public class Demo {


	public static void main(String[] args) {
//		ss();//调用处
//		Demo.ss();
		Demo d = new Demo();
		d.ss();
		Demo.ss();
		
		byte b=(byte) 130;
		
		System.out.println(b);
	}
	
	/**
	 * 静态方法
	 */
	public static void ss(){
		//被调用处
		System.out.println("静态方法");
	}
	
	/**
	 * 非静态方法
	 */
/*	public void xx(){
		
		System.out.println("非静态方法");
	}*/
	
	
}
