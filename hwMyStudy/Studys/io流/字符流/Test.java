package io流.字符流;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 字符流
 *		字节流提供处理任何类型输入/输出操作的功能，但不能直接操作Unicode字符，因此需要字符流
 * 		字符流主要用于读写纯文本信息
 * 
 *      字符流的顶层类：
 *     		 Reader      字符输入流
 *      	 Writer		   字符输出流
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
