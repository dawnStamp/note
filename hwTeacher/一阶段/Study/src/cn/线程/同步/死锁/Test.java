package cn.�߳�.ͬ��.����;

public class Test {

	public static void main(String[] args) {
		DeathSyn ds = new DeathSyn();
		Thread th1 = new Thread(ds,"�߳�1");
		Thread th2 = new Thread(ds,"�߳�2");
		
		th1.start();
		th2.start();
	}
}
