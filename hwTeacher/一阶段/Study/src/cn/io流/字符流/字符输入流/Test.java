package cn.io��.�ַ���.�ַ�������;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * �ַ���
 * 			�ֽ����ṩ�����κ���������/��������Ĺ��ܣ�������ֱ�Ӳ���Unicode�ַ��������Ҫ�ַ���
 * 			�ַ�����Ҫ���ڶ�д���ı���Ϣ
 * 
 * 			�ַ����Ķ����ࣺ
 * 					Reader							�ַ�������
 * 					Writer							�ַ������
 * 			
 * 			FileReader
 * 
 * 			FileWriter
 *
 */
public class Test {
	public static void main(String[] args) throws IOException {
		File file = new File("E:/file/123.txt");
		FileReader fr = new FileReader(file);
		char[] ch = new char[(int) file.length()];
		fr.read(ch);
		
		for (char c : ch) {
			System.out.println(c);
		}
		
	
		fr.close();
		
	}
}
