package cn.�߳�.thread;

import java.util.Date;

public class MyTread extends Thread{
	
	boolean flag = true;
	@Override
	public void run() {
		while(flag){
			System.out.println(new Date());
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			/*try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
		}
	}
	
	
	/*@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			//��ȡ��ǰִ����δ�����̵߳�����
			System.out.println(Thread.currentThread().getName()+"  "+i);
		}
	}*/
}
