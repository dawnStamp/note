package 线程.守护线程;

public class Test {

	public static void main(String[] args) {
		testDaemonThread();
		testUserThread();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("主线程退出");
	}
	
	public static void testDaemonThread(){
		DaemonThread dae = new DaemonThread();
		Thread th = new Thread(dae);
		
		th.setDaemon(true);//将th线程设置为守护线程

		th.start();
		
	}
	
	public static void testUserThread(){
		UserThread dae = new UserThread();
		Thread th = new Thread(dae);
		th.setDaemon(false);//可不用设置，默认为用户线程
		th.stop();
		th.start();
		
		
	}
}
