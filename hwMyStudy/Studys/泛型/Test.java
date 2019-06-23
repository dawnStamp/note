package 泛型;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 泛型 jdk1.5引入的新特性，也是最重要的一个特性
 * 泛型可以在编译的时候检查数据类型的安全
 * 泛型可以提高代码的拓展性和重用性
 * 
 * 泛型：
 * 		1.泛型类
 *ps: 		
 *  	1.泛型里面不能填基本数据类型
 *  	2.泛型类中使用了泛型，不意味着不能用普通的写法
 *  	3.泛型类可以同时设置多个类型参数
 *  	4.泛型类可以继承泛型类
 *  	5.泛型类可以实现泛型接口
 *  	6.同一个泛型类，如果实例化时给定的实际类型不同，则这些对象的类型是不兼容的，不能相互赋值
 *  
 *  extends
 *  	<T extends XXX>给T加一个限制，必须要继承XXX才能编译通过
 *  
 *  	默认 extends Object
 *  
 *  怎么解决ps中的第六点？
 *  	通配符 ?   代表任意一个类型
 *  	可以使用extends
 *  	可以使用super
 * @author oracleOAEC
 *
 */
public class Test {

	public static void main(String[] args) {
		/*ArrayList list = new ArrayList();
		list.add("张三,abc123");
		list.add("李四,abc123");
		list.add(1);
		list.add(7);
		
		String obj = (String)list.get(0);
		System.out.println(obj);*/
		
		/*Human<Integer,String> human = new Human<Integer,String>();
		human.setName(1);*/
		
		
		
		/*Address add = new Address();
		add.setProv("江西省");
		add.setShi("南昌市");
		add.setYoubian(330200);
		add.setJiedao("紫阳大道");
		
		Human hu = new Human();
		hu.setName("张三");
		hu.setAddress(add);*/
	
		Human<Integer,Address>hu = new Human<Integer,Address>();
		/*Human<List>hu = new Human<List>();
		Human<? super ArrayList> hu2 = hu;*/
	}
	
}
