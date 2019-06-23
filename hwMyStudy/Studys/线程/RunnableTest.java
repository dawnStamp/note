package Ïß³Ì;

public class RunnableTest{

	public static void main(String[] args) {
	/*	Runnable rn  =new MyRunnable();
		
		Thread th1 = new Thread(rn);
		Thread th2 = new Thread(rn);*/
		
		MyRunnable my = new MyRunnable();
		my.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		my.flag = false;
		//System.out.println(th1.isAlive());
		
		/*th1.start();
		th2.start();*/
		//System.out.println(th1.isAlive());
		//System.out.println(th2.isAlive());
		
		
		//th1.stop();
	}
}
