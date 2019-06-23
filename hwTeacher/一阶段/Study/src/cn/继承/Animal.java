package cn.继承;

/**
 *  继承需要符合的关系：
 *  			is-a
 *  			子类更特殊更具体
 *  			父类更通用更抽象
 *  
 *  继承背后的思想就是基于已存在的类来构建新的类
 *  
 *  super关键字：
 *  		super和this类似
 *  			this代表本类中的某一个
 *  			super代表父类中的某一个
 *  
 *  			super.属性名			调用父类的某一个属性
 *  			super.方法名()       调用父类的某一个方法
 *  			super()						调用父类的构造方法
 *  
 *  ps:
 *  			1.private修饰的不会被继承
 *  			2.static方法中不能使用this和super
 *  			3.构造方法不会被继承
 *  			4.子类的构造方法中，通过super关键字调用父类的构造方法
 *  						需要将super(xx,xx,xx)放在最前面
 *  
 *  方法重写(override)
 *  			方法重写是指子类可以根据需要对从父类继承来的方法进行改写，是多态机制的前奏
 *  
 *  ps:
 *  			1.重写方法必须和被重写方法具有相同的方法名称、参数列表和返回值
 *  			2.重写方法不能使用比被重写方法更严格的访问权限
 *  			3.父类中的私有方法不能被重写，构造方法不能被重写
 *  			4.在子类重写的方法中可以使用super.方法名()继续调用父类的方法
 *  
 *  final关键字
 *  			1.final可以用来修饰变量、方法、类
 *  			2.修饰变量，那这个变量就成了常量
 *  			3.修饰方法，代表方法不能被重写
 *  			4.修饰类，代表类不能被继承
 *  
 *  Object是所有类的父类，所有类都直接或间接继承了Object,根类
 */
public class Animal{

	double height;//体重
	private String name;//姓名
	private int age;//年龄

	public Animal(){
		
	}
	public Animal(double height,String name,int age){
		this.height = height;
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

	//吃东西
	public void eat(){
		System.out.println("动物在吃东西");
	}

	//走猫步
	public void run(){
		System.out.println("动物奔跑了起来");
	}
}
