package io��.�ַ���;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * �ַ���
 *		�ֽ����ṩ�����κ���������/��������Ĺ��ܣ�������ֱ�Ӳ���Unicode�ַ��������Ҫ�ַ���
 * 		�ַ�����Ҫ���ڶ�д���ı���Ϣ
 * 
 *      �ַ����Ķ����ࣺ
 *     		 Reader      �ַ�������
 *      	 Writer		   �ַ������
 * 
 *		FileReader
 * 
 * @author oracleOAEC
 *
 */
public class Test {

	public static void main(String[] args) throws IOException {
		File fi = new File("D:/file/123.txt");
		FileReader fr = new FileReader(fi); 
		char[] ch = new char[(int)fi.length()];
		fr.read(ch);
		
		/*for (char c : ch) {
			System.out.println(c);
		}*/
		
		FileWriter fw = new FileWriter("D:/file/abc/123.txt");
		fw.write(ch);
		//fw.write(97);
		/*char[]ch1 =new char[]{'a','b','c'};
		fw.write(ch1);*/

		fr.close();
		fw.close();
	}
}
