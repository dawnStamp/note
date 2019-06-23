package cn.io流.字节流.数组输入流;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * 把字节数组当成源的输入流
 */
public class ArrayInputStream {

	public static void main(String[] args) throws IOException {
		byte[] buff = "11111".getBytes();
		
		//创建输入流
		ByteArrayInputStream bais = new ByteArrayInputStream(buff);
		
		byte[] by = new byte[buff.length];
		bais.read(by);
		
		bais.close();
		
	}
}
