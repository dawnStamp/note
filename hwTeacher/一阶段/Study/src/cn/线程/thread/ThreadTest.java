package cn.线程.thread;

public class ThreadTest {

	/**
	 * 主线程
	 */
	public static void main(String[] args) {
		Thread my1 = new MyTread();//创建一个新的线程，此线程进入新建状态
		Thread my2 = new MyTread();//创建一个新的线程，此线程进入新建状态
		
		my1.start();//调用start()方法使得线程进入就绪状态
		my2.start();
		
		
	}
}
