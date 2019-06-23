package cn.线程.同步.生产者消费者;

public class Test {

	public static void main(String[] args) {
		Production p = new Production();
		Thread th1 = new Thread(p,"生产者");
		Thread th2 = new Thread(p,"消费者");
		
		th2.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		th1.start();
	}
}
