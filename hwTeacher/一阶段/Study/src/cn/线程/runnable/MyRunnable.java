package cn.�߳�.runnable;

import java.util.Date;

public class MyRunnable implements Runnable{

	boolean flag = true;
	@Override
	public void run() {
		
		while(flag){
			System.out.println(new Date());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		/*for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			String name = Thread.currentThread().getName();
			if(name.equals("Thread-0") && i==10){
				try {
					Thread.sleep(3000);//��������״̬
				} catch (InterruptedException e) {//�쳣�˳�
					e.printStackTrace();
				}
			}
			//��ȡ��ǰִ����δ�����̵߳�����
			System.out.println(Thread.currentThread().getName()+"  "+i);
			//				Thread.yield();
		}*/
	}
}
