package io流.数组流;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * 
 * 是把字节数组当成源的输入流
 * @author oracleOAEC
 *
 */
public class ArrayInputStream {

	public static void main(String[] args) throws IOException {
		byte[] buff = "1111".getBytes();
		//创建输入流
		ByteArrayInputStream bais = new ByteArrayInputStream(buff);
		
		byte[] by = new byte[buff.length];
		bais.read(by);
		
		bais.close();
	}
}
