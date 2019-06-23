package 线程.同步;

public class Test {

	public static void main(String[] args) {
	MySyn my = new MySyn();
	//MySyn my2 = new MySyn();
	Thread th1 = new Thread(my);
	Thread th2 = new Thread(my);
	
	th1.start();
	th2.start();
	}
}
