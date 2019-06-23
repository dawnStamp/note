package cn.io流.打印输出流;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

import cn.返回值.Animal;

/**
 * 打印输出流
 * 	PrintWriter
 *		PrintStream
 *
 *ps:
 *		1.PrintWriter和PrintStream类似，只不过PrintStream是针对字节流的，而PrintWriter是针对字符流的
 *		2.PrintWriter和BufferedWriter都可以写入数据，
 *				但BufferedWriter没有相关的格式化方法
 *				而PrintWriter可以在写入同时对写入的数据进行格式化		
 *
 */
public class Test {

	public static void main(String[] args) throws IOException {
		/*PrintWriter p = new PrintWriter("E:/file/123.txt");
		p.println("字符");
		p.println();
		p.append("哈哈哈");
		p.write("哇哇哇");
		p.close();*/
		
		PrintStream ps = new PrintStream("E:/file/123.txt");
		ps.println(97);
		ps.println('a');
		ps.println("hello world");
		ps.println(true);
		ps.println(3.13);
		ps.println(new Abc("布鲁斯","韦恩"));//不管什么数据类型，都会转换为字符串，甚至对象也不例外
	}
}
