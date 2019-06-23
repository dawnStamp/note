package cn.io��.�ֽ���.�ַ�������;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * BufferedReader
 * BufferedWriter
 * 
 *
 */
public class Test {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("E:/file/123.txt");
		BufferedReader br = new BufferedReader(fr);
		
		FileWriter fw = new FileWriter("E:/file/abc/123.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		char[] ch = new char[5];
		
		/*
		 * һ����ȡ�ļ��е�ǰ5���ֽڵ����ݣ����浽ch������
		 * 		len=5
		 * 		bw.write(ch,0,5);
		 * 
		 * ������ȡ�ļ��еĵ�5-10���ֽڵ����ݣ����浽ch������
		 * 		len=3      12345     67845
		 * 		bw.write(ch,0,3);
		 * 
		 * ����len = -1
		 * */
		
		/*//���ļ���Сδ֪�������
		int len = 0;
		
		while((len=br.read(ch))!=-1){
			for (char c : ch) {
				System.out.print(c);
			}
			System.out.println("                           len="+len);
			bw.write(ch,0,len);
		}*/
		
		/*String str = null;
		 String str=br.readLine();
		 System.out.println(str);
		while((str=br.readLine())!=null){
			bw.write(str);
			bw.newLine();
		}*/
		int val = 0;
		while((val = br.read())!=-1){
			bw.write(val);
			System.out.println(val);
		}
		
		bw.close();
		fw.close();
		br.close();
		fr.close();
		/*FileReader fr = new FileReader("E:/file/123.txt");
		BufferedReader br = new BufferedReader(fr);
		char[] ch = new char[10];
		br.read(ch);
		
		FileWriter fw = new FileWriter("E:/file/abc/123.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(ch);
		bw.append("123");//��ĩβ׷��һ������
		
		
		bw.close();
		fw.close();
		br.close();
		fr.close();*/
	}
}
