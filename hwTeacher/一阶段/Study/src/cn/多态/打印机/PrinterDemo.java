package cn.��̬.��ӡ��;

public class PrinterDemo {
	public static void main(String []args){
		Printer p1=new ColorPrinter();//��������ת��
		p1.print("hello,java");

		Printer p2=new BlackPrinter();
		p2.print("hello,java");
	}
}
