package cn.�߳�.thread;

public class ThreadTest {

	/**
	 * ���߳�
	 */
	public static void main(String[] args) {
		Thread my1 = new MyTread();//����һ���µ��̣߳����߳̽����½�״̬
		Thread my2 = new MyTread();//����һ���µ��̣߳����߳̽����½�״̬
		
		my1.start();//����start()����ʹ���߳̽������״̬
		my2.start();
		
		
	}
}
