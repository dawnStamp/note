package io��.������;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * 
 * �ǰ��ֽ����鵱��Դ��������
 * @author oracleOAEC
 *
 */
public class ArrayInputStream {

	public static void main(String[] args) throws IOException {
		byte[] buff = "1111".getBytes();
		//����������
		ByteArrayInputStream bais = new ByteArrayInputStream(buff);
		
		byte[] by = new byte[buff.length];
		bais.read(by);
		
		bais.close();
	}
}
