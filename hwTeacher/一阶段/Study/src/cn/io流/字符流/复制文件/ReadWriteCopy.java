package cn.io流.字符流.复制文件;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteCopy {

	public static void main(String[] args) throws IOException {
		File file = new File("E:/file/123.jpg");
		FileReader fr = new FileReader(file);
		
		char[] ch = new char[(int) file.length()];
		fr.read(ch);
		
		FileWriter fw = new FileWriter("E:/file/abc/333.jpg");
		fw.write(ch);
		
		fw.close();
		fr.close();
	}
}
