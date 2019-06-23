package cn.线程.runnable;

import cn.线程.thread.MyTread;

public class RunnableTest {

	public static void main(String[] args) {
		MyTread my = new MyTread();
		my.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		/*Runnable rn = new MyRunnable();
		Thread th1 = new Thread(rn);
		Thread th2 = new Thread(rn);*/
		
//		System.out.println(th1.isAlive());
		
		/*th1.start();
		th2.start();*/
		
//		System.out.println(th1.isAlive());
//		System.out.println(th2.isAlive());
		/*try {
			th1.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		th1.stop();*/
	}
}
