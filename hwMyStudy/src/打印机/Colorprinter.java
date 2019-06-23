package 打印机;

public class Colorprinter extends Printer{

	@Override
	public void printer() {
	System.out.println("这是一台彩色打印机");
	}

	@Override
	public void color() {
	System.out.println("彩色打印机的打印效果是彩色的");
	}



	
}
