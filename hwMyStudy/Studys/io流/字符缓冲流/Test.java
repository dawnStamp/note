package io��.�ַ�������;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * �ַ�������
 * BufferedReader
 * BufferedWrite
 * 
 * @author oracleOAEC
 *
 */
public class Test {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D:/aaa.txt");
		BufferedReader br= new BufferedReader(fr);

		FileWriter fw =new FileWriter("D:/file/123.txt");
		BufferedWriter bw= new BufferedWriter(fw);
		//���ļ���Сδ֪�������(��һ�ַ�����һ��һ������һ��һ��д)
		/*char[] ch= new char[5];

		int len =0;
	
		while((len =br.read(ch)) !=-1){//��û�ж������Զ�ȡ��ʱ�򣬾ͻ᷵��-1
			
			bw.write(ch,0,len);
			bw.newLine();
		}*/

		//(�ڶ��ַ�����һ��һ�еĶ���һ��һ�е�д)
		/*String str = null;
		while((str=br.readLine())!=null){
			bw.write(str);
			bw.newLine();
		}*/
		
		
		
		bw.close();
		fw.close();
		br.close();
		fr.close();

		
		
		
		
		
		/*File fi =new File("D:/file/123.txt");
		FileReader fr = new FileReader(fi);
		BufferedReader br= new BufferedReader(fr);
		char[] ch= new char[(int) fi.length()];
		br.read(ch);

		FileWriter fw =new FileWriter("D:/file/123.txt");
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write("abc");

		bw.append("123");//��ĩβ׷��һ������

		bw.close();
		fw.close();
		br.close();
		fr.close();*/
	}
}
