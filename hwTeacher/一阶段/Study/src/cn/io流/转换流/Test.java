package cn.io��.ת����;

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
 * ת������
 * 		InputStreamReader
 * 		OutputStreamWriter
 * 
 * 		���ֽ���ת�����ַ���
 * 
 *
 */
public class Test {
	public static void main(String[] args) throws IOException{
		File file = new File("E:/file/123.txt");
		File file2 = new File("E:/file/abc/123.txt");
		
		FileInputStream fis = new FileInputStream(file);//�ֽ���
		FileOutputStream fos = new FileOutputStream(file2);//�ֽ���
		
		InputStreamReader isr = new InputStreamReader(fis,"UTF-8");//�ַ���
		OutputStreamWriter osr = new OutputStreamWriter(fos);//�ַ���
		
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
