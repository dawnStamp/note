package 线程.死锁;

public class MySyn implements Runnable{

	private static Object A = new Object(),B = new Object();


	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		if(name.equals("线程1")){
			xxx();
		}else{
			yyy();
		}
	}

	public void xxx(){
		System.out.println("线程1开始执行");
		synchronized (A){
			try {
				System.out.println("线程1拿到了A锁");
				Thread.sleep(3000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			synchronized(B){
				System.out.println("线程1拿到了B锁");
			}
		}
	}
	
	public void yyy(){
		System.out.println("线程2开始执行");
		synchronized (B){
			try {
				System.out.println("线程2拿到了B锁");
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (A) {
				System.out.println("线程2拿到了A锁");
			}
		}		



	}
}
