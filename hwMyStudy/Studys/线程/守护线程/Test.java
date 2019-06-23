package �߳�.�ػ��߳�;

public class Test {

	public static void main(String[] args) {
		testDaemonThread();
		testUserThread();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("���߳��˳�");
	}
	
	public static void testDaemonThread(){
		DaemonThread dae = new DaemonThread();
		Thread th = new Thread(dae);
		
		th.setDaemon(true);//��th�߳�����Ϊ�ػ��߳�

		th.start();
		
	}
	
	public static void testUserThread(){
		UserThread dae = new UserThread();
		Thread th = new Thread(dae);
		th.setDaemon(false);//�ɲ������ã�Ĭ��Ϊ�û��߳�
		th.stop();
		th.start();
		
		
	}
}
