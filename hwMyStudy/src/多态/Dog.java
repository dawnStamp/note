package 多态;

public class Dog extends Animal{

	@Override
	public void run() {
		System.out.println("狗在欢快的跑");
	}
	
	public void sleep(){
		System.out.println("狗趴在地上睡觉");
	}

}
