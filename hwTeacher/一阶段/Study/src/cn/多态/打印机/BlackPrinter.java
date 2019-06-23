package cn.多态.打印机;

public class BlackPrinter extends Printer{
	public void print(String content){
		System.out.println("黑白打印:"+content);
	}
}
