package cn.io��.�ֽ���.�ļ������;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * FileOutputStream
 * 				write(byte[] b)
 * 							��b�����е����������ָ���ļ���
 * 				write(byte[] b,int off,int len)
 * 							��2������Ϊ��b����ĵ�N��λ�ÿ�ʼ
 * 							��3������Ϊ���ļ������N���ֽ�
 * 				write(int i)
 *								iΪascii�룬���磺i=97    �����ļ������һ��a
 */
public class FileOutput {
	public static void main(String[] args) throws Exception {
		
		File ff = new File("E:/file/123.txt");//ָ���ļ�
		FileOutputStream out = new FileOutputStream(ff,true);//true�������ļ�Ĭ��д��
																														//Ĭ��Ϊfalse  ���ļ���ͷд�� ������
		
		String str = "����";//Ҫ���ļ������ʲô����
	
		out.write(str.getBytes());
		out.close();//�ر���
		/*out.write(str.getBytes());//str.getBytes()���ַ���ת����byte���͵�����
																//write()�����������ָ���ļ���
			out.write(str.getBytes(), 0, 3);
																 
		 */		
	}
}
