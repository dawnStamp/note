package 接口练习2;

public class ColorPrint implements Print{

	@Override
	public void printUserInfo() {
		System.out.println("成功打印彩色的教员信息");
		
	}

	@Override
	public void printComepany() {
		System.out.println("成功打印彩色的公司信息");
		
	}

}
