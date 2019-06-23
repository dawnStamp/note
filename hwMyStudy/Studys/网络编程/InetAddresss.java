package 网络编程;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddresss {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress host = InetAddress.getByName("www.baidu.com");
		System.out.println(host.getHostName());//获取域名
		System.out.println(host.getHostAddress());//获取IP
	}
}
