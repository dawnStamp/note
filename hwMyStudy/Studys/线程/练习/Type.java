package �߳�.��ϰ;

public class Type implements Runnable{
	
	@Override
	public void run() {
		for(int i = 0;i<=100;i++){
			System.out.println(Thread.currentThread().getName()+"�����ؽ���Ϊ��"+i+"%");
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
