package 笔记;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Demo {

	public static void main(String[] args) throws IOException{
		//读取到文件中有的元素，并以xxx表的规格显示
			File fi = new File("D:/file/123.txt");
		InputStream in;

		byte [] ty = new byte[10];

		try {
			in = new FileInputStream(fi);
			in.read(ty);
		} catch (IOException e1) {

			e1.printStackTrace();
		}

		for (byte b : ty) {
			System.out.println(b);
		}

		try {
			in = new FileInputStream(fi);
			in.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

		//往指定的文件中输入
		File fl= new File("D:/aaa.txt");

		OutputStream ou = new FileOutputStream(fl);
		String t= "Hello world!";
		ou.write(t.getBytes());

		ou.close();




	}
}
