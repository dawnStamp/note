package cn.构造方法;

/**
 * 构造方法
 *			构造方法负责对象初始化工作，为对象的属性赋合适的初始值
 *			
 *构造方法的语法规则：
 *			1.构造方法名与类名相同
 *			2.没有返回类型
 *			3.构造方法主要是为了给变量初始化
 *
 *创建完对象之后，立即调用构造方法
 *
 *ps:
 *			1.构造方法可以不止一个
 *			2.如果一个构造方法都不写，系统默认有一个无参的构造方法
 *				但是，如果一但有构造方法，默认的无参构造方法就没了
 *			3.构造方法能确保在最开始就初始化完毕
 *
 *		
 *		
 */
public class Demo {

	private String name;//姓名
	private int age;//年龄
	

	/**
	 * 构造方法
	 */
/*	public Demo(){
	}
	*/
	
	public Demo(String name,int age){
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
