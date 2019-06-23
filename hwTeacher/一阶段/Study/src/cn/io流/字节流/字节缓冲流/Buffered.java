package cn.io流.字节流.字节缓冲流;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 过滤流
 * 		提供了一个缓冲功能
 * 		1.不带缓冲的操作，每读一个字节就要写入一个字节，
 * 		由于涉及磁盘的IO操作相比内存的操作要慢很多，所以不带缓冲的流效率很低。
 * 
 * 		2.带缓冲的流，可以一次读很多字节，但不向磁盘中写入，只是先放到内存里。
 * 		等凑够了缓冲区大小的时候一次性写入磁盘，这种方式可以减少磁盘操作次数，
 * 		速度提高了很多，减少了对磁盘的损耗
 * 
 * BufferedInputStream
 * BufferedOutputStream
 * 
 */
public class Buffered {

	public static void main(String[] args) throws IOException {
		File file = new File("E:/file/123.txt");
		
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		byte[] by = new byte[(int) file.length()];
		bis.read(by);
		
		for (byte b : by) {
			System.out.println(b);
		}
		
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		//清空，强制输出剩余数据
		bos.flush();
		
		//后开先关
		bos.close();
		fos.close();
		
		bis.close();
		fis.close();
	}
}
