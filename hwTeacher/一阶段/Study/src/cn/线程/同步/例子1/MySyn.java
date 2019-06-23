package cn.线程.同步.例子1;

public class MySyn implements Runnable{

	@Override
	public void run() {
		
		synchronized (this) {//同步代码块
			System.out.println(Thread.currentThread().getName()+"获取了锁！");
			
			for (int i = 1; i <= 10; i++) {
				System.out.println(Thread.currentThread().getName()+"---"+i);
			}
			
			System.out.println(Thread.currentThread().getName()+"释放了锁！");
		}
		
	}
}
