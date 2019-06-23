package io流.字符缓冲流;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 字符缓冲流
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
		//在文件大小未知的情况下(第一种方法：一个一个读，一个一个写)
		/*char[] ch= new char[5];

		int len =0;
	
		while((len =br.read(ch)) !=-1){//当没有东西可以读取的时候，就会返回-1
			
			bw.write(ch,0,len);
			bw.newLine();
		}*/

		//(第二种方法：一行一行的读，一行一行的写)
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

		bw.append("123");//在末尾追加一段内容

		bw.close();
		fw.close();
		br.close();
		fr.close();*/
	}
}
