package 接口练习2;

public class BlackPrint implements Print{

	@Override
	public void printUserInfo() {
		System.out.println("成功打印黑白的教员信息");
		
	}

	@Override
	public void printComepany() {
		System.out.println("成功打印黑白的公司信息");
		
	}

}
