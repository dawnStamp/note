package cn.�߳�.ͬ��.����2;

public class Test {

	public static void main(String[] args) {
		MySyn my = new MySyn();
		MySyn my2 = new MySyn();
		
		Thread th = new Thread(my,"�߳�1");
		Thread th2 = new Thread(my2,"�߳�2");
		
		th.start();
		th2.start();
	}
}
