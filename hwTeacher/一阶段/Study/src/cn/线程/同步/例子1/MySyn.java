package cn.�߳�.ͬ��.����1;

public class MySyn implements Runnable{

	@Override
	public void run() {
		
		synchronized (this) {//ͬ�������
			System.out.println(Thread.currentThread().getName()+"��ȡ������");
			
			for (int i = 1; i <= 10; i++) {
				System.out.println(Thread.currentThread().getName()+"---"+i);
			}
			
			System.out.println(Thread.currentThread().getName()+"�ͷ�������");
		}
		
	}
}
