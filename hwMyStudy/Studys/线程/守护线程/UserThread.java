package 线程.守护线程;

public class UserThread implements Runnable{

	@Override
	public void run() {
		while(true){
			System.out.println("运行中，我是用户线程");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			System.out.println("wrong,我是用户线程");
			}
		}
	}

}
