package io��.�ֽ���;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * ���ķ��ࣺ
 * 		1.�����������Ϊ"������"��"�����"
 * 		2.�����ݴ���ĵ�λ���Է�Ϊ"�ֽ���"��"�ַ���"
 * 		3.�����ܷ�Ϊ��"�ڵ���"��"������"
 * 			�ڵ�����������ֱ�Ӳ���Ŀ���豸����
 * 			���������Ƕ�һ���Ѵ��ڵ����Ĳ��䣬Ϊ�����ṩ��ǿ��Ĺ���
 * 
 * �ֽ���
 * 		�ֽ�����Ҫ���ڶ�дͼƬ����������Ƶ��
 * 		�ֽ����Ķ����ࣺ
 * 			InputStream   �ֽ�������	 			
 * 			OutputStream  �ֽ������
 * 
 * 		FileInputStream
 * 			read()����
 * 				read(byte[] b)  ������ȫ����ȡ��byte���͵�������
 * 								���س���
 * 				read(byte[] b,int off,int len)  �ڶ�������Ϊ����洢����ʼλ��
 * 												����������Ϊ��ȡ���ٸ��ֽ�	
 * 												���س���
 * 				read();
 * 					����һ�ζ�ȡһ���ֽ�
 * 					���ض�ȡ����������
 * 
 * 				byte [] by = new byte[(int)file.length()];
 * 					�����С���ļ��Ĵ�С������
 * 				skip(N)
 * 					����������N���ֽ�����	
 * 
 * 				available()
 * 					���������������п���������ȡʣ����ֽ���
 * 
 * 
 * 
 * FileOutputStream
 * 				write(byte[] b)   ��b�����е����������ָ���ļ���
 * 				write(byte[] b,int off,int len)   �ڶ�������Ϊ��b����ĵ�N��λ�ÿ�ʼ
 * 												      ����������Ϊ�����ļ������N���ֽ�
 * 				wirte(int i)iΪascii�룬���磺i=97 �����ļ������һ��a
 * @author oracleOAEC
 *
 */
public class Test {

	public static void main(String[] args) throws IOException {
		//��ȡ���ļ����е�Ԫ�أ�����xxx��Ĺ����ʾ
		/*File file = new File("D:/file/123.txt");//ָ����Ҫ�������ļ�·��
		InputStream input = new FileInputStream(file);//��·�����õ�����
	
		byte [] by = new byte[(int)file.length()];//����������ļ��ж�ȡ���������ݣ��������м������ͻ��ȡ������
		
		//����������N���ֽ�����
		long i = input.skip(4);
		
		int i=input.available();
		System.out.println(i);
		
		
		input.read(by);	//ͨ��������ָ���ļ��е����ݣ���ȡ���������浽by��
		
		for(int i =0;i<3;i++){
			int value = input.read();
			by[i]=value;
			System.out.println(value);
		}
		
		for (byte b : by) {
			System.out.println(b);
		}
		
		input.close();//�ر���
*/
		
		//��ָ�����ļ�������
		File ff = new File("D:/aaa.txt");//ָ���ļ�
		OutputStream out = new FileOutputStream(ff,true);//��·�����õ�����//true�������ļ�Ĭ��д�룬
																		//Ĭ��false ���ļ���ͷд�룬������
								
		String str= "123";//Ҫ���ļ������ʲô����
		out.write(str.getBytes());//str.getBytes()���ַ���ת����byte���͵�����
								  //write()�����������ָ���ļ���
	
		

		out.close();//�ر���
		
		
		
		//�����ļ�������ֻ�ܸ����ļ������Ḵ������
		/*File file = new File("D:/file/123.txt");
		
		String path = file.getName();
		
		File fi = new File("D:/file/abc/"+path);
		
		try {
			fi.createNewFile();
		} catch (IOException e) {
		
			e.printStackTrace();
		}*/
	}
}
