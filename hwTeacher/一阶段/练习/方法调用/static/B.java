package cn.方法调用;

public class B {

	int i=10;
	static int i2=10;
	
	public static void bb(){
		B b = new B();
		b.cc();
	}
	
	public void cc(){
		System.out.println("通关了");
	}
}
