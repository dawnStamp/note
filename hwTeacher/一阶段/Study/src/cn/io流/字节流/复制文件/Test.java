package cn.io流.字节流.复制文件;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test {
	public static void main(String[] args) throws Exception {
		File file = new File("E:/file/123.jpg");
		FileInputStream input = new FileInputStream(file);

		byte[] by = new byte[(int) file.length()];
		input.read(by);

		File file2 = new File("E:/file/abc/123.jpg");
		FileOutputStream out = new FileOutputStream(file2);
		out.write(by);

		input.close();
		out.close();
	}
}
