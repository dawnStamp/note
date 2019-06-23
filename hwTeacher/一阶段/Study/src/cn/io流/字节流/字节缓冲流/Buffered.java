package cn.io��.�ֽ���.�ֽڻ�����;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ������
 * 		�ṩ��һ�����幦��
 * 		1.��������Ĳ�����ÿ��һ���ֽھ�Ҫд��һ���ֽڣ�
 * 		�����漰���̵�IO��������ڴ�Ĳ���Ҫ���ܶ࣬���Բ����������Ч�ʺܵ͡�
 * 
 * 		2.���������������һ�ζ��ܶ��ֽڣ������������д�룬ֻ���ȷŵ��ڴ��
 * 		�ȴչ��˻�������С��ʱ��һ����д����̣����ַ�ʽ���Լ��ٴ��̲���������
 * 		�ٶ�����˺ܶ࣬�����˶Դ��̵����
 * 
 * BufferedInputStream
 * BufferedOutputStream
 * 
 */
public class Buffered {

	public static void main(String[] args) throws IOException {
		File file = new File("E:/file/123.txt");
		
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		byte[] by = new byte[(int) file.length()];
		bis.read(by);
		
		for (byte b : by) {
			System.out.println(b);
		}
		
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		//��գ�ǿ�����ʣ������
		bos.flush();
		
		//���ȹ�
		bos.close();
		fos.close();
		
		bis.close();
		fis.close();
	}
}
