package �߳�.�ػ��߳�;

public class UserThread implements Runnable{

	@Override
	public void run() {
		while(true){
			System.out.println("�����У������û��߳�");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			System.out.println("wrong,�����û��߳�");
			}
		}
	}

}
