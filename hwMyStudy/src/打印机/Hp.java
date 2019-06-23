package 打印机;

public class Hp extends Printer{

	@Override
	public void printer() {
		System.out.println("这是一台黑白打印机");
	}

	@Override
	public void color() {
		System.out.println("黑白打印机的打印效果是黑白色");
	}

	
}
