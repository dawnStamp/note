package cn.线程.同步.例子2;

public class Test {

	public static void main(String[] args) {
		MySyn my = new MySyn();
		MySyn my2 = new MySyn();
		
		Thread th = new Thread(my,"线程1");
		Thread th2 = new Thread(my2,"线程2");
		
		th.start();
		th2.start();
	}
}
