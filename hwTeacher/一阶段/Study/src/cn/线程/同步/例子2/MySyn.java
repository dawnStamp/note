package cn.线程.同步.例子2;

public class MySyn implements Runnable{

	private static Object A = new Object();
	
	@Override
	public void run() {
		synchronized (A) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(Thread.currentThread().getName()+"  "+i);
			}
		}
	}
}
