package io流.字节流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 流的分类：
 * 		1.按流的流向分为"输入流"和"输出流"
 * 		2.按数据传输的单位可以分为"字节流"和"字符流"
 * 		3.按功能分为："节点流"和"过滤流"
 * 			节点流，是用来直接操作目标设备的流
 * 			过滤流，是对一个已存在的流的补充，为程序提供更强大的功能
 * 
 * 字节流
 * 		字节流主要用于读写图片、声音、视频等
 * 		字节流的顶层类：
 * 			InputStream   字节输入流	 			
 * 			OutputStream  字节输出流
 * 
 * 		FileInputStream
 * 			read()方法
 * 				read(byte[] b)  将数据全部读取到byte类型的数组中
 * 								返回长度
 * 				read(byte[] b,int off,int len)  第二个参数为数组存储的起始位置
 * 												第三个参数为读取多少个字节	
 * 												返回长度
 * 				read();
 * 					运行一次读取一个字节
 * 					返回读取出来的内容
 * 
 * 				byte [] by = new byte[(int)file.length()];
 * 					数组大小由文件的大小来决定
 * 				skip(N)
 * 					跳过并丢弃N个字节数据	
 * 
 * 				available()
 * 					估算从这个输入流中可无阻塞读取剩余的字节数
 * 
 * 
 * 
 * FileOutputStream
 * 				write(byte[] b)   将b数组中的内容输出到指定文件中
 * 				write(byte[] b,int off,int len)   第二个参数为从b数组的第N个位置开始
 * 												      第三个参数为从往文件中输出N个字节
 * 				wirte(int i)i为ascii码，例如：i=97 会往文件中输出一个a
 * @author oracleOAEC
 *
 */
public class Test {

	public static void main(String[] args) throws IOException {
		//读取到文件中有的元素，并以xxx表的规格显示
		/*File file = new File("D:/file/123.txt");//指定需要操作的文件路径
		InputStream input = new FileInputStream(file);//将路径设置到流中
	
		byte [] by = new byte[(int)file.length()];//用来保存从文件中读取出来的数据，数组里有几个数就会读取几个数
		
		//跳过并丢弃N个字节数据
		long i = input.skip(4);
		
		int i=input.available();
		System.out.println(i);
		
		
		input.read(by);	//通过流，将指定文件中的数据，读取出来，保存到by中
		
		for(int i =0;i<3;i++){
			int value = input.read();
			by[i]=value;
			System.out.println(value);
		}
		
		for (byte b : by) {
			System.out.println(b);
		}
		
		input.close();//关闭流
*/
		
		//往指定的文件中输入
		File ff = new File("D:/aaa.txt");//指定文件
		OutputStream out = new FileOutputStream(ff,true);//将路径设置到流中//true代表在文件默认写入，
																		//默认false 从文件开头写入，即覆盖
								
		String str= "123";//要往文件中输出什么内容
		out.write(str.getBytes());//str.getBytes()把字符串转换成byte类型的数组
								  //write()将内容输出到指定文件中
	
		

		out.close();//关闭流
		
		
		
		//复制文件，但是只能复制文件，不会复制内容
		/*File file = new File("D:/file/123.txt");
		
		String path = file.getName();
		
		File fi = new File("D:/file/abc/"+path);
		
		try {
			fi.createNewFile();
		} catch (IOException e) {
		
			e.printStackTrace();
		}*/
	}
}
