package �߳�.�ػ��߳�;

public class DaemonThread implements Runnable{
	@Override
	public void run() {
		while(true){
			System.out.println("�����У������ػ��߳�");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			System.out.println("wrong,�����ػ��߳�");
			}
		}
	}
}
