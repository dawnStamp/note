package cn.泛型.泛型类;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 泛型jdk1.5引入的新特性，也是最重要的一个特性
 * 泛型可以在编译的时候检查类型安全
 * 泛型可以提高代码的拓展性和重用性
 * 
 * 泛型：
 * 		1.泛型类
 *
 *ps:
 *			1.泛型中不能填基本数据类型
 *			2.泛型类中使用了泛型，不意味着不能用普通的写法
 *			3.泛型类可以同时设置多个类型参数
 *			4.泛型类可以继承泛型类
 *			5.泛型类可以实现泛型接口
 *			6.同一个泛型类，如果实例化时给定的实际类型不同，则这些对象的类型是不兼容的，不能相互赋值
 *
 *
 * extends
 * 		<T extends XXX>给T加个一个限制，必须要继承XXX才能编译通过
 * 
 *			默认 extends Object
 *			
 *怎么去解决ps中的第六点呢？
 *			通配符?					代表任意一个类型
 *			可以使用extends
 *			可以使用super
 */
public class Test {

	public static void main(String[] args) {
		
		Human<List> hu = new Human<List>();
		Human<? super ArrayList> hu2 = hu;
		
		
//		hu = hu2;
//		Human<Object> hu3 = new Human<Object>();
//		hu3 = hu;
//		hu3 = hu2;
		
		
		/*Human<Integer> human = new Human<Integer>();
		human.setName(1);
		Integer inte = human.ss(999);
		
		Human<String> human2 = new Human<String>();
		human2.setName("1");
		human2.ss("123");*/
		
	/*	Address add = new Address();
		add.setProv("江西省");
		add.setShi("南昌市");
		add.setYoubian(330013);
		add.setJiedao("双港东大街");
		
		Human hu = new Human();
		hu.setName("张三");
		hu.setAddress(add);*/

		
	}
}
