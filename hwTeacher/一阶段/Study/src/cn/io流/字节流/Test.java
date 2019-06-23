package cn.io流.字节流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

/**
 * 流的分类：
 * 			1.按流的流向分为"输入流"和"输出流"
 * 			2.按数据传输的单位分为"字节流"和"字符流"
 * 			3.按功能分为："节点流"和"过滤流"
 * 					节点流，是用于直接操作目标设备的流
 * 					过滤流，是对一个已存在的流的补充，为程序提供更强大的功能
 * 
 * 
 * 字节流
 * 		字节流主要用于读写图片、声音、视频等
 * 		字节流的顶层类：
 * 				InputStream			字节输入流
 * 				OutputStream		字节输出流
 * 
 * 		FileInputStream
 * 		FileOutputStream
 */
public class Test {

	public static void main(String[] args) throws IOException {
		File file = new File("E:/file/123.txt");//指定需要操作的文件的路径
		FileInputStream input = new FileInputStream(file);//将路径设置到流中
		
		byte[] by = new byte[10];//用来保存从文件中读取出来的数据
		
		input.read(by);//通过流，将指定文件中的数据，读取出来，保存到by中
		
		for (byte b : by) {
			System.out.println(b);
		}
		
		input.close();//关闭流

		File ff = new File("E:/Test.txt");//指定文件
		FileOutputStream out = new FileOutputStream(ff);//
		
		String str = "你好";//要往文件中输出什么内容
		out.write(str.getBytes());//str.getBytes()把字符串转换成byte类型的数组
															//write()将内容输出到指定文件中
		
		out.close();//关闭流
		
		/*
		//复制文件
		File file = new File("E:/file/123.txt");
		
		String path = file.getName();
		
		File fi = new File("E:/file/abc/"+path);
		
		try {
			fi.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}*/
	}
}
