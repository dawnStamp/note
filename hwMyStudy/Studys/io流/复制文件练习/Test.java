package io流.复制文件练习;

import java.io.*;

public class Test {
	private InputStream input;
	private OutputStream output;
	private static int length;
	/**
	 * 文件的复制
	 * 
	 * @param beginFilename
	 *            原始文件
	 * @param endFilename
	 *            目标文件
	 * @throws IOException 
	 */
	public void fileCopy(String beginFilename, String endFilename) throws IOException {
		// 创建输入输出流对象

		input = new FileInputStream(beginFilename);
		output = new FileOutputStream(endFilename);

		// 获取文件长度

		length = input.available();

		// 创建缓存区域
		byte[] buffer = new byte[length];
		// 将文件中的数据写入缓存数组
		input.read(buffer);
		// 将缓存数组中的数据输出到文件
		output.write(buffer);

		if (input != null && output != null) {

			input.close(); // 关闭流
			output.close();

		}

	}


	public static void main(String[] args) throws IOException {
		Test man = new Test();
		// 第一个参数是将要复制的文件，第二个参数是输出的目标文件（如果没有，则新建一个，实现文件的复制）
		man.fileCopy("D:/aaa.txt",
				"D:/file/123.txt");

	}

}

