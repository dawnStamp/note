package cn.io��.�ֽ���.�ļ�������;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

/**
 * ���ķ��ࣺ
 * 			1.�����������Ϊ"������"��"�����"
 * 			2.�����ݴ���ĵ�λ��Ϊ"�ֽ���"��"�ַ���"
 * 			3.�����ܷ�Ϊ��"�ڵ���"��"������"
 * 					�ڵ�����������ֱ�Ӳ���Ŀ���豸����
 * 					���������Ƕ�һ���Ѵ��ڵ����Ĳ��䣬Ϊ�����ṩ��ǿ��Ĺ���
 * 
 * �ֽ���
 * 		�ֽ�����Ҫ���ڶ�дͼƬ����������Ƶ��
 * 		�ֽ����Ķ����ࣺ
 * 				InputStream			�ֽ�������
 * 				OutputStream		�ֽ������
 * 
 * 		FileInputStream
 * 					read()����
 * 						read(byte[] b)
 * 									������ȫ����ȡ��byte���͵����鵱��											
 * 									���س���
 * 						read(byte[] b,int off,int len)					
 * 									��2������Ϊ����洢����ʼλ��
 * 									��3������Ϊ��ȡ���ٸ��ֽ�
 * 									���س���
 * 						read()
 * 									����һ�ζ�ȡһ���ֽ�
 * 									���ض�ȡ����������
 * 
 * 						byte[] by = new byte[(int) file.length()];
 * 									�����С���ļ��Ĵ�С������
 * 
 * 						skip(N)
 * 								����������N���ֽ�����
 * 								����N
 * 	
 * 						available()
 * 								���������������п���������ȡʣ����ֽ���
 */
public class FileInput {

	public static void main(String[] args) throws IOException {
		
		File file = new File("E:/file/123.txt");//ָ����Ҫ�������ļ���·��
		FileInputStream input = new FileInputStream(file);//��·�����õ�����
//		FileInputStream input = new FileInputStream("E:/file/123.txt");//��·�����õ�����
		
		byte[] by = new byte[(int) file.length()];//����������ļ��ж�ȡ����������
		
		input.read(by);//ͨ��������ָ���ļ��е����ݣ���ȡ���������浽by��
		
		for (byte b : by) {
			System.out.println(b);
		}
		
		String str = new String(by);
		System.out.println(str);
		
		input.close();//�ر���
		/*
		for (int i = 0; i < 7; i++) {
		int value = input.read();
		System.out.println(value);
		}
		
		input.read(by, 0, 4);
		
		����������N���ֽ�����
		long i = input.skip(2);
		
		int i = input.available();
		System.out.println(i);
		*/
		
		/*
		//�����ļ�
		File file = new File("E:/file/123.txt");
		
		String path = file.getName();
		
		File fi = new File("E:/file/abc/"+path);
		
		try {
			fi.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}*/
	}
}
