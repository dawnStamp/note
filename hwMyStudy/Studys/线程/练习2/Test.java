package �߳�.��ϰ2;



public class Test {

	public static void main(String[] args) {
		My my = new My();
		Thread th1 = new Thread(my,"������");
		Thread th2 = new Thread(my,"������");
		
		
		th2.start();	
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
					e.printStackTrace();
		}
		th1.start();
	}
}
