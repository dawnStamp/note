package 方法调用;

public class Demo2 {
	
	/*public static void main(String[] args) {
		Demo dm = new Demo();
		dm.name = "张三";
		dm.buy();
		dm.readMoney();
		dm.money();

		Demo d = new Demo();
		d.xx();
		d.ss();
		
		Demo.ss();
	}*/
	
	public static void bb(){
		System.out.println("bb方法");
		Demo2 f = new Demo2();
		f.cc();
	}
	public void cc(){
		System.out.println("cc方法");
		System.out.println("恭喜你通关了");
	}
}
