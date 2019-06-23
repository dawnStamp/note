package cn.多态.打印机;

public class PrinterDemo {
	public static void main(String []args){
		Printer p1=new ColorPrinter();//向上类型转换
		p1.print("hello,java");

		Printer p2=new BlackPrinter();
		p2.print("hello,java");
	}
}
