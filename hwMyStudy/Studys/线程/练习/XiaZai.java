package 线程.练习;

public class XiaZai {

	public static void main(String[] args) {
		Type ty= new Type();
		Thread th = new Thread(ty,"张三");
		th.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Thread th2 = new Thread(ty,"李四");
		th2.start();
	}
	
}
