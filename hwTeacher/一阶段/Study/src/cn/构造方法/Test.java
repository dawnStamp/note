package cn.构造方法;

public class Test {

	public static void main(String[] args) {

		Demo de = new Demo("张三",123);//根据Demo类，创建一个叫de的对象
		de.getName();
		de.getAge();

		/*	de.setName("张三");
		de.setAge(123);*/
	}
}
