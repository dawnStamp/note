package cn.多态.例子1;

public class Dog extends Animal{

	@Override
	public void run() {
		System.out.println("狗撒欢的往前跑");
	}
	
	@Override
	public void sleep(){
		System.out.println("狗趴在地上睡觉");
	}
}
