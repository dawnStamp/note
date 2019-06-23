package cn.接口.例子3;

public class BlackPrint implements Print{

	@Override
	public void printUserInfo() {
		System.out.println("成功打印黑白的教员信息");
	}

	@Override
	public void printCompanyInfo() {
		System.out.println("成功打印黑白的公司信息");
	}

}
