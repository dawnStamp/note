package cn.�߳�.ͬ��.������������;

public class Test {

	public static void main(String[] args) {
		Production p = new Production();
		Thread th1 = new Thread(p,"������");
		Thread th2 = new Thread(p,"������");
		
		th2.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		th1.start();
	}
}
