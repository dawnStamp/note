package cn.�߳�.����1;

public class Test {

	public static void main(String[] args) {
		Runn ru = new Runn();
		Thread th = new Thread(ru,"����");
		th.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Thread th2 = new Thread(ru,"����");
		th2.start();
	}
}
