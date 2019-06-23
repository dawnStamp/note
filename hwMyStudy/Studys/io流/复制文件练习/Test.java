package io��.�����ļ���ϰ;

import java.io.*;

public class Test {
	private InputStream input;
	private OutputStream output;
	private static int length;
	/**
	 * �ļ��ĸ���
	 * 
	 * @param beginFilename
	 *            ԭʼ�ļ�
	 * @param endFilename
	 *            Ŀ���ļ�
	 * @throws IOException 
	 */
	public void fileCopy(String beginFilename, String endFilename) throws IOException {
		// �����������������

		input = new FileInputStream(beginFilename);
		output = new FileOutputStream(endFilename);

		// ��ȡ�ļ�����

		length = input.available();

		// ������������
		byte[] buffer = new byte[length];
		// ���ļ��е�����д�뻺������
		input.read(buffer);
		// �����������е�����������ļ�
		output.write(buffer);

		if (input != null && output != null) {

			input.close(); // �ر���
			output.close();

		}

	}


	public static void main(String[] args) throws IOException {
		Test man = new Test();
		// ��һ�������ǽ�Ҫ���Ƶ��ļ����ڶ��������������Ŀ���ļ������û�У����½�һ����ʵ���ļ��ĸ��ƣ�
		man.fileCopy("D:/aaa.txt",
				"D:/file/123.txt");

	}

}

