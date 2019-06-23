package io流.复制文件练习;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) throws IOException{

		//从A文件中读一个字符，就往B文件中写一个字符

		//创建目的地
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
