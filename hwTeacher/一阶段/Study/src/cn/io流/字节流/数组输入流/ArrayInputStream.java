package cn.io��.�ֽ���.����������;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * ���ֽ����鵱��Դ��������
 */
public class ArrayInputStream {

	public static void main(String[] args) throws IOException {
		byte[] buff = "11111".getBytes();
		
		//����������
		ByteArrayInputStream bais = new ByteArrayInputStream(buff);
		
		byte[] by = new byte[buff.length];
		bais.read(by);
		
		bais.close();
		
	}
}
