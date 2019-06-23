package cn.io流.字节流.文件输入流;

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
 * 字节流
 * 		字节流主要用于读写图片、声音、视频等
 * 		字节流的顶层类：
 * 				InputStream			字节输入流
 * 				OutputStream		字节输出流
 * 
 * 		FileInputStream
 * 					read()方法
 * 						read(byte[] b)
 * 									将数据全部读取到byte类型的数组当中											
 * 									返回长度
 * 						read(byte[] b,int off,int len)					
 * 									第2个参数为数组存储的起始位置
 * 									第3个参数为读取多少个字节
 * 									返回长度
 * 						read()
 * 									运行一次读取一个字节
 * 									返回读取出来的内容
 * 
 * 						byte[] by = new byte[(int) file.length()];
 * 									数组大小由文件的大小来决定
 * 
 * 						skip(N)
 * 								跳过并丢弃N个字节数据
 * 								返回N
 * 	
 * 						available()
 * 								估算从这个输入流中可无阻塞读取剩余的字节数
 */
public class FileInput {

	public static void main(String[] args) throws IOException {
		
		File file = new File("E:/file/123.txt");//指定需要操作的文件的路径
		FileInputStream input = new FileInputStream(file);//将路径设置到流中
//		FileInputStream input = new FileInputStream("E:/file/123.txt");//将路径设置到流中
		
		byte[] by = new byte[(int) file.length()];//用来保存从文件中读取出来的数据
		
		input.read(by);//通过流，将指定文件中的数据，读取出来，保存到by中
		
		for (byte b : by) {
			System.out.println(b);
		}
		
		String str = new String(by);
		System.out.println(str);
		
		input.close();//关闭流
		/*
		for (int i = 0; i < 7; i++) {
		int value = input.read();
		System.out.println(value);
		}
		
		input.read(by, 0, 4);
		
		跳过并丢弃N个字节数据
		long i = input.skip(2);
		
		int i = input.available();
		System.out.println(i);
		*/
		
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
