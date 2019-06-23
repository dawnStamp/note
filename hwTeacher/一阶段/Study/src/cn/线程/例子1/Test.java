package cn.线程.例子1;

public class Test {

	public static void main(String[] args) {
		Runn ru = new Runn();
		Thread th = new Thread(ru,"张三");
		th.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Thread th2 = new Thread(ru,"李四");
		th2.start();
	}
}
