package cn.多态.打印机;

public class ColorPrinter extends Printer{
	
	public void print(String content){
		System.out.println("彩色打印:"+content);
	}

}
