package 方法重载;

import java.util.*;
/**
 * 
 * 方法重载
 * 		多数程序设计语言要求为每个方法(函数)提供一个独一无二的方法名，不存在方法重载的概念
 * 		在java中，规定方法签名是解析方法的规则而不是方法名，为方法重载开创了条件
 * 
 * 		方法重载使得在一个类中，方法名相同二参数列表不同的方法可以同时存在，代表相似的行为或功能
 * 		可以存在相同名字的方法，但参数列表不能相同
 * 		1.方法名可以相同
 * 		2.参数列表不能相同
 * 		同名不同参
 * 	
 *   包：
 *   	1.import 包路径.类名;
 *   	2.import 包路径。*；   通配符
 * 		3.在需要导包的类前面加上包路径
 * 		xxx.xxx.xxx.类名 aa=...;
 * 		xxx.xxx.xxx为包路径
 * 
 * @author oracleOAEC
 *
 */
public class Demo {

	public void sss(String name){
		System.out.println("13254");
	}
	
	public void sss(){
		System.out.println("aadaahudghas");
	}
	
	public void sss(String name,int age){
		System.out.println("daa");
	}
}
