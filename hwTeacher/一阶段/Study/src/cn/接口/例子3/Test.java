package cn.�ӿ�.����3;

public class Test {

	public static void main(String[] args) {
		Print p1 = new ColorPrint();
		p1.printUserInfo();
		p1.printCompanyInfo();
		
		Print p2 = new BlackPrint();
		p2.printUserInfo();
		p2.printCompanyInfo();
	}
}
