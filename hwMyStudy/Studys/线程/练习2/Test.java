package 线程.练习2;



public class Test {

	public static void main(String[] args) {
		My my = new My();
		Thread th1 = new Thread(my,"生产者");
		Thread th2 = new Thread(my,"消费者");
		
		
		th2.start();	
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
					e.printStackTrace();
		}
		th1.start();
	}
}
