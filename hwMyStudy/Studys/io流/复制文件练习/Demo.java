package io��.�����ļ���ϰ;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) throws IOException{

		//��A�ļ��ж�һ���ַ�������B�ļ���дһ���ַ�

		//����Ŀ�ĵ�
		FileReader fr = new FileReader("D:/aaa.txt");
		
		FileWriter fw= new FileWriter("D:/file/123.txt");

		int num = 0;
		while ((num = fr.read()) !=-1) {
			fw.write(num);
		}
		fw.close();
		fr.close();
		
		
	}



}
