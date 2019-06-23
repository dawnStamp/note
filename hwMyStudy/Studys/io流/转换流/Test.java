package io��.ת����;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * ת����(�ַ���)
 *      InputStreamReader
 *      OutputStreamWriter
 * 
 * 	���ֽ���ת�����ַ���
 * 
 * @author oracleOAEC
 *
 */
public class Test {

	public static void main(String[] args) throws IOException {
		File file = new File("D:/aaa.txt");
		
		File file2 = new File("D:/file/123.txt");
		
		FileInputStream fis = new FileInputStream(file);//�ֽ���
		FileOutputStream fos = new FileOutputStream(file2);//�ֽ���
		
		InputStreamReader isr = new InputStreamReader(fis,"UTF-8");//�ַ���
		OutputStreamWriter osr = new OutputStreamWriter(fos);//�ַ���
		
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
