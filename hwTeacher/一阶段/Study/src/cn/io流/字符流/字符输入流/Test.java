package cn.io流.字符流.字符输入流;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 字符流
 * 			字节流提供处理任何类型输入/输出操作的功能，但不能直接操作Unicode字符，因而需要字符流
 * 			字符流主要用于读写纯文本信息
 * 
 * 			字符流的顶层类：
 * 					Reader							字符输入流
 * 					Writer							字符输出流
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
