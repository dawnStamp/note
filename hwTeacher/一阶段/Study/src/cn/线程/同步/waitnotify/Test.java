package cn.�߳�.ͬ��.waitnotify;

public class Test {

	public static void main(String[] args) {
		MyWaitAndNotify my = new MyWaitAndNotify();
		Thread th1 = new Thread(my,"�߳�1");
		Thread th2 = new Thread(my,"�߳�2");
		Thread th3 = new Thread(my,"�߳�3");
		Thread th4 = new Thread(my,"�߳�4");
		
		th1.start();
		th3.start();
		th4.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		th2.start();
	}
}
