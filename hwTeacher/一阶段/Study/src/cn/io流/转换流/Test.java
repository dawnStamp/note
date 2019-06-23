package cn.io流.转换流;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/**
 * 转换流：
 * 		InputStreamReader
 * 		OutputStreamWriter
 * 
 * 		将字节流转换成字符流
 * 
 *
 */
public class Test {
	public static void main(String[] args) throws IOException{
		File file = new File("E:/file/123.txt");
		File file2 = new File("E:/file/abc/123.txt");
		
		FileInputStream fis = new FileInputStream(file);//字节流
		FileOutputStream fos = new FileOutputStream(file2);//字节流
		
		InputStreamReader isr = new InputStreamReader(fis,"UTF-8");//字符流
		OutputStreamWriter osr = new OutputStreamWriter(fos);//字符流
		
		BufferedReader br = new BufferedReader(isr);
		BufferedWriter bw = new BufferedWriter(osr);
		
		char[] ch = new char[10];
		int len = 0;
		while( (len=br.read(ch)) != -1 ){
			bw.write(ch,0,len);
		}
		
		bw.close();
		br.close();
	}
}
