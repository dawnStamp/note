package cn.io��.�ֽ���;

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
 * 
 * �ֽ���
 * 		�ֽ�����Ҫ���ڶ�дͼƬ����������Ƶ��
 * 		�ֽ����Ķ����ࣺ
 * 				InputStream			�ֽ�������
 * 				OutputStream		�ֽ������
 * 
 * 		FileInputStream
 * 		FileOutputStream
 */
public class Test {

	public static void main(String[] args) throws IOException {
		File file = new File("E:/file/123.txt");//ָ����Ҫ�������ļ���·��
		FileInputStream input = new FileInputStream(file);//��·�����õ�����
		
		byte[] by = new byte[10];//����������ļ��ж�ȡ����������
		
		input.read(by);//ͨ��������ָ���ļ��е����ݣ���ȡ���������浽by��
		
		for (byte b : by) {
			System.out.println(b);
		}
		
		input.close();//�ر���

		File ff = new File("E:/Test.txt");//ָ���ļ�
		FileOutputStream out = new FileOutputStream(ff);//
		
		String str = "���";//Ҫ���ļ������ʲô����
		out.write(str.getBytes());//str.getBytes()���ַ���ת����byte���͵�����
															//write()�����������ָ���ļ���
		
		out.close();//�ر���
		
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
