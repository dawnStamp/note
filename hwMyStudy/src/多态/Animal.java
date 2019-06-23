package 多态;

/**多态
 *		多态性是指同一操作作用于某一类对象，可以有不同的解释，产生不同的执行结果 
 *		同一个操作，产生不同结果
 *
 *体现：
 *		在运行时父类的引用变量可以引用其子类的对象
 *前提：
 *		需要存在继承和实现关系
 *
 *向上转型：
 *		父类名  变量名 = new 子类名();
 *
 *
 *java中是单继承的，不存在会继承两个父类的情况
 *
 *
 *向下转型：
 *		对象名 instanceof 类名
 *		前面是后面或其子类的一个实例，结果为true	、
 *			
 *动态绑定和静态绑定
 *		在程序执行前方法已经被绑定，静态绑定
 *		运行时，根据实际内容决定调用哪个方法，动态绑定
 *
 *
 * @author oracleOAEC
 *
 */


public class Animal {

	//向下转型
	public void run(){
		System.out.println("动物在奔跑");
	}
	
	public void sleep(){
		System.out.println("动物在睡觉");
	}

	
}
