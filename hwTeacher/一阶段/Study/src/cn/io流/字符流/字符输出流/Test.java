package cn.io��.�ַ���.�ַ������;

import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("E:/file/123.txt");
		char[] ch = new char[]{'a','b','c'};
//		fw.write(ch);
		fw.write("�������", 1, 2);
		fw.close();
	}
}
