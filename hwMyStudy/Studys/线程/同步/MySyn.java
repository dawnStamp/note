package 线程.同步;

public class MySyn implements Runnable{

	@Override
	public void run() {
	
		synchronized(this){//同步代码块，this代表同一个对象
			System.out.println(Thread.currentThread().getName()+"获取了锁！");
			for(int i = 1;i<=10;i++){
				System.out.println(Thread.currentThread().getName()+"---"+i);
			}
			System.out.println(Thread.currentThread().getName()+"释放了锁！");
		}
	}

}
