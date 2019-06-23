package 封装.cn;



/**面向过程(opp)
 * 面向对象(oop)的三大特性：
 * 		1.封装
 * 		2.继承
 * 		3.多态  
 * 
 * 
 * 封装
 * 		1、将东西装在一起，然后以新的完整形式呈现出来
 * 		2、信息隐藏，隐藏对象的实现细节，不让外部直接访问到
 * 		将方法和字段一起包装到一个单元中，单元以类的形式出现
 * 		3、定义类、定义其属性、方法的过程称为封装类
 * 
 * 信息隐藏是oop最重要的功能之一，也是使用访问修饰符的原因
 * 信息隐藏的原因包括：
 * 	  	1.对模块的任何实现细节所作的更改不会影响使用该模块的代码
 * 		2.防止用户意外修改数据
 * 		3.使用模块(方法)易于使用和维护
 * 
 * 
 * 访问修饰符：
 * 		1、private
 * 		2、protected
 * 		3、默认
 *		4、public
 * 
 * 包的作用：
 * 		1.将java文件分门别类的放好，方便后期查找以及管理
 * 		2.
 * 
 * 
 * 访问修饰符可以修饰：类、方法、全局变量
 * 
 * 类只能用public和默认修饰
 * 
 * 
 * 字段封装的实现：
 * 	  1.修改字段的可见性来限制对字段访问
 * 	  2.为每个字段创建一对赋值(setter)方法和取值(getter)方法,用于公开对这些字段的访问接口
 *	  3.除非必须公开底层实现细节，否则所有字段都应该用private封装	
 * 
 * 
 * 	this 关键字
 * 		本类中的某一个东西
 * 		this.xx(属性名) 即为  本类中的xx变量
 * 
 * 
 * 构造方法
 * 		构造方法负责对象初始化工作，为对象的属性赋合适的初始值
 * 
 * 构造方法的语法规则：
 * 	1.构造方法名与类名相同	
 * 	2.没有返回类型
 * 	3.构造方法主要是为了给变量初始化
 * 
 * 创建完对象之后，立即调用构造方法
 * 
 * ps:
 * 		1.构造方法可以不止一个
 *		2.如果一个构造方法都不写，系统默认有一个无参的构造方法
 *		  但是，如果一但有构造方法，默认的无参构造方法就没了 
 *		3.构造方法能确保在最开始就初始化完毕
 *
 * @author oracleOAEC
 *
 */

public class Demo {
	/*private int hello = 10;

	public int getHello() {
		return hello;
	}

	public void setHello(int hello) {
		this.hello = hello;
	}*/
	
	private String name;//姓名
	private int age;//年龄
	
	
	//构造方法
	public Demo(){
		//System.out.println("1111111");
	}
	
	public Demo(int age){
		//System.out.println("age="+age);
	}
	public Demo(String name){
		//System.out.println("name="+name);
	}
	public Demo(String name,int age){
		//System.out.println("name="+name+",age="+age);
		this.name = name;
		this.age = age;
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}