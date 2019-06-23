package cn.方法重载;

/**
 * 方法重载(overload)
 * 		多数程序设计语言要求为每个方法(函数)提供一个独一无二的方法名,不存在方法重载的概念
 * 		在java中，规定方法签名是解析方法的规则而不是方法名，为方法重载开创了条件
 * 		
 * 		方法重载使得在一个类中，可以同存在相同名字的方法,但参数列表不能相同
 * 				1.方法名可以相同
 * 				2.参数列表不能相同
 * 
 * 		同名不同参
 */
public class Demo {

	public void sss(String name){
			System.out.println("111111");
	}

	public void sss(){
			System.out.println("ashdjas");
	}

	public void sss(String name,int age){
			System.out.println("电话撒机会");
	}
}
