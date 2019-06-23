package cn.io流.字节流.文件输出流;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * FileOutputStream
 * 				write(byte[] b)
 * 							将b数组中的内容输出到指定文件中
 * 				write(byte[] b,int off,int len)
 * 							第2个参数为从b数组的第N个位置开始
 * 							第3个参数为往文件中输出N个字节
 * 				write(int i)
 *								i为ascii码，例如：i=97    会往文件中输出一个a
 */
public class FileOutput {
	public static void main(String[] args) throws Exception {
		
		File ff = new File("E:/file/123.txt");//指定文件
		FileOutputStream out = new FileOutputStream(ff,true);//true代表在文件默认写入
																														//默认为false  从文件开头写入 即覆盖
		
		String str = "世界";//要往文件中输出什么内容
	
		out.write(str.getBytes());
		out.close();//关闭流
		/*out.write(str.getBytes());//str.getBytes()把字符串转换成byte类型的数组
																//write()将内容输出到指定文件中
			out.write(str.getBytes(), 0, 3);
																 
		 */		
	}
}
