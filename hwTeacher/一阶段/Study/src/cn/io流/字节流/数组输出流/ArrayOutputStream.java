package cn.io流.字节流.数组输出流;

import java.io.ByteArrayOutputStream;

/**
 * 把字节数组当成目标的输出流
 */
public class ArrayOutputStream {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		baos.write(a);
		baos.write(b);
		baos.write(c);
		
		byte[] buff = baos.toByteArray();
		for (byte d : buff) {
			System.out.println(d);
		}
	}
}
