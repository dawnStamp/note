package cn.多态.例子1;

/**
 * 多态
 * 		多态性是指同一操作作用于某一类对象，可以有不同的解释，产生不同的执行结果
 * 		同一个操作，产生不同结果
 * 
 * 体现：
 * 		在运行时父类的引用变量可以引用其子类的对象
 * 前提：
 * 		需要存在继承和实现关系
 * 		
 * 
 * 向上转型：
 * 	父类名 变量名 = new 子类名();
 */
public class Test {

	public static void main(String[] args) {
		
		Animal an = new Cat();
		an.run();
		an.sleep();
		
		Animal an2 = new Dog();
		an2.run();
		an2.sleep();
		
	}
}
