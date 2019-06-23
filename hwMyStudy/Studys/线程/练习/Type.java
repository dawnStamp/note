package 线程.练习;

public class Type implements Runnable{
	
	@Override
	public void run() {
		for(int i = 0;i<=100;i++){
			System.out.println(Thread.currentThread().getName()+"的下载进度为："+i+"%");
			if(i>=80){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		}
		
		
	}
}
