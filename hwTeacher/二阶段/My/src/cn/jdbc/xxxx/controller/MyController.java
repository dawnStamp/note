package cn.jdbc.xxxx.controller;

import java.util.Scanner;

import cn.jdbc.xxxx.entry.MyInfo;
import cn.jdbc.xxxx.service.MyService;
import cn.jdbc.xxxx.service.impl.MyServiceImpl;

/**
 * ���ֲ�Controller
 */
public class MyController {

	Scanner sc = new Scanner(System.in);
	MyInfo info = new MyInfo();
	
	public void view(){
		System.out.println("�������˺ţ�");
		info.setUsername(sc.next());
		
		System.out.println("���������룺");
		info.setPassword(sc.next());
		
		System.out.println("�������ǳƣ�");
		info.setName(sc.next());
		
		MyService ms = new MyServiceImpl();
		String result = ms.register(info);
		System.out.println(result);
	}
}
