package �߳�.����;

public class Test {

	public static void main(String[] args) {
		MySyn my = new MySyn();
		Thread th = new Thread(my,"�߳�1");
		Thread th2 = new Thread(my,"�߳�2");
		
		th.start();
		try {
			th.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		th2.start();
		try {
			th.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
}
