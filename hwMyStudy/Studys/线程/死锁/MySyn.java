package �߳�.����;

public class MySyn implements Runnable{

	private static Object A = new Object(),B = new Object();


	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		if(name.equals("�߳�1")){
			xxx();
		}else{
			yyy();
		}
	}

	public void xxx(){
		System.out.println("�߳�1��ʼִ��");
		synchronized (A){
			try {
				System.out.println("�߳�1�õ���A��");
				Thread.sleep(3000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			synchronized(B){
				System.out.println("�߳�1�õ���B��");
			}
		}
	}
	
	public void yyy(){
		System.out.println("�߳�2��ʼִ��");
		synchronized (B){
			try {
				System.out.println("�߳�2�õ���B��");
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (A) {
				System.out.println("�߳�2�õ���A��");
			}
		}		



	}
}
