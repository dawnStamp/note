package ������;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddresss {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress host = InetAddress.getByName("www.baidu.com");
		System.out.println(host.getHostName());//��ȡ����
		System.out.println(host.getHostAddress());//��ȡIP
	}
}
