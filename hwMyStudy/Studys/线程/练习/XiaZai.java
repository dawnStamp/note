package �߳�.��ϰ;

public class XiaZai {

	public static void main(String[] args) {
		Type ty= new Type();
		Thread th = new Thread(ty,"����");
		th.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Thread th2 = new Thread(ty,"����");
		th2.start();
	}
	
}
