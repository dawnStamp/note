package io流.复制文件练习;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Lianxi {



	public static void main(String[] args) throws IOException {
		File file =new File("D:/file/saber.gif");
		FileInputStream input=new FileInputStream(file);
		byte[] by=new byte[(int) file.length()];	
		input.read(by);
		input.close();

		File fi2=new File("D:/file/abc/saber.gif");
		FileOutputStream out = new FileOutputStream(fi2);
		out.write(by);
		out.close();
	}

}
