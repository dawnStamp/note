package 线程;

import java.util.Date;

public class MyRunnable extends Thread/*implements Runnable*/{

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
		/*for(int i=1;i<=50;i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			String name = Thread.currentThread().getName();
			
			if(name.equals("Thread-0")&&i==10){
				try {
					Thread.sleep(300);//进入阻塞状态
					
				} catch (InterruptedException e) {//异常退出
					e.printStackTrace();
				}
			}
			//获取当前执行这段代码的线程的名字
			System.out.println(Thread.currentThread().getName()+" "+i);
			//Thread.yield();

		}*/
	}
	
}
