package cn.线程.同步.死锁;

public class Test {

	public static void main(String[] args) {
		DeathSyn ds = new DeathSyn();
		Thread th1 = new Thread(ds,"线程1");
		Thread th2 = new Thread(ds,"线程2");
		
		th1.start();
		th2.start();
	}
}
