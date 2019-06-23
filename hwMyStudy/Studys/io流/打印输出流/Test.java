package io流.打印输出流;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * 打印输出流
 * 	printWriter
 * 	printStream
 * 
 * 		
 * 		1.printWriter和printStream类似，只不过printStream是针对字节流的，而printWriter是针对字符流的
 * 		2.printWriter和BufferedWriter都可以写入数据，但BufferedWriter没有相关的格式化方法
 * 			而printWriter可以在写入同时对写入数据进行格式化
 * @author oracleOAEC
 *
 */
public class Test {

	public static void main(String[] args) throws IOException {
		/*PrintWriter  p = new PrintWriter("D:/file/123.txt");
		p.println("字符");
		p.println(" ");
		p.append("^_^嗷嗷");
		p.write("娃哈哈");
		
		p.close();*/
		
		
		PrintStream ps = new PrintStream("D:/file/123.txt");
		ps.println("字符");
		ps.println(new Abc("虚空掠夺者","荒漠屠夫"));
		ps.append("大规划大纲");
		ps.write(97);
		
		ps.close();
		
	}
}
