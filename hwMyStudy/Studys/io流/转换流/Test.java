package io流.转换流;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 转换流(字符流)
 *      InputStreamReader
 *      OutputStreamWriter
 * 
 * 	将字节流转换成字符流
 * 
 * @author oracleOAEC
 *
 */
public class Test {

	public static void main(String[] args) throws IOException {
		File file = new File("D:/aaa.txt");
		
		File file2 = new File("D:/file/123.txt");
		
		FileInputStream fis = new FileInputStream(file);//字节流
		FileOutputStream fos = new FileOutputStream(file2);//字节流
		
		InputStreamReader isr = new InputStreamReader(fis,"UTF-8");//字符流
		OutputStreamWriter osr = new OutputStreamWriter(fos);//字符流
		
		BufferedReader br = new BufferedReader(isr);
		BufferedWriter bw = new BufferedWriter(osr);
		
		char[] ch = new char[20];
		int len = 0;
		while((len=br.read(ch)) != -1){
			bw.write(ch,0,len);
		}
		
		bw.close();
		br.close();
		osr.close();
		isr.close();
		fos.close();
		fis.close();
		
	}
}
