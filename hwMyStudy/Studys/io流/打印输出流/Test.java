package io��.��ӡ�����;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * ��ӡ�����
 * 	printWriter
 * 	printStream
 * 
 * 		
 * 		1.printWriter��printStream���ƣ�ֻ����printStream������ֽ����ģ���printWriter������ַ�����
 * 		2.printWriter��BufferedWriter������д�����ݣ���BufferedWriterû����صĸ�ʽ������
 * 			��printWriter������д��ͬʱ��д�����ݽ��и�ʽ��
 * @author oracleOAEC
 *
 */
public class Test {

	public static void main(String[] args) throws IOException {
		/*PrintWriter  p = new PrintWriter("D:/file/123.txt");
		p.println("�ַ�");
		p.println(" ");
		p.append("^_^��");
		p.write("�޹���");
		
		p.close();*/
		
		
		PrintStream ps = new PrintStream("D:/file/123.txt");
		ps.println("�ַ�");
		ps.println(new Abc("����Ӷ���","��Į����"));
		ps.append("��滮���");
		ps.write(97);
		
		ps.close();
		
	}
}
