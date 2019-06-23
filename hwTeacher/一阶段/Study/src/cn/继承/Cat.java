package cn.继承;

public class Cat extends Animal{
	String huxu;//胡须
	String eyes;//眼睛
	
	
	public Cat(){
		
	}
	public Cat(double height, String name, int age,String huxu,String eyes) {
		super(height, name, age);//调用父类的构造方法
		this.huxu = huxu;
		this.eyes = eyes;
	}
	//走猫步
	public void maobu(){
		
//		System.out.println(this.i);//本类中的i变量
//		System.out.println(super.i);//父类中的i变量
		System.out.println("猫走起了猫步");
		this.run();
		super.run();
	}
	
	
	public void run(){
		System.out.println("猫跳上了围墙");
	}
	

	public void eat() {
		super.eat();
	}
	
	@Override
	public String toString() {
		return "Cat [huxu=" + huxu + ", eyes=" + eyes + "]";
	}
}
