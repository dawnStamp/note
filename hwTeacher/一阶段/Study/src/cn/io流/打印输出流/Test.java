package cn.io��.��ӡ�����;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

import cn.����ֵ.Animal;

/**
 * ��ӡ�����
 * 	PrintWriter
 *		PrintStream
 *
 *ps:
 *		1.PrintWriter��PrintStream���ƣ�ֻ����PrintStream������ֽ����ģ���PrintWriter������ַ�����
 *		2.PrintWriter��BufferedWriter������д�����ݣ�
 *				��BufferedWriterû����صĸ�ʽ������
 *				��PrintWriter������д��ͬʱ��д������ݽ��и�ʽ��		
 *
 */
public class Test {

	public static void main(String[] args) throws IOException {
		/*PrintWriter p = new PrintWriter("E:/file/123.txt");
		p.println("�ַ�");
		p.println();
		p.append("������");
		p.write("������");
		p.close();*/
		
		PrintStream ps = new PrintStream("E:/file/123.txt");
		ps.println(97);
		ps.println('a');
		ps.println("hello world");
		ps.println(true);
		ps.println(3.13);
		ps.println(new Abc("��³˹","Τ��"));//����ʲô�������ͣ�����ת��Ϊ�ַ�������������Ҳ������
	}
}
