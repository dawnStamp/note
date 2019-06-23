package cn.包;

import java.util.Date;
//import java.util.Scanner;
//import java.util.*;
/**
 * 包：
 * 		1.import 包路径.类名;
 * 		2.import 包路径.*;            通配符
 *			3.在需要导包的类前面加上包路径
 *					xxx.xxx.xxx.类名 aa = ....;     
 *					xxx.xxx.xxx为包路径
 */
public class Demo {

	public static void main(String[] args) {
		cn.string详解.Demo de = new cn.string详解.Demo();
		System.out.println(de.i);
		
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		Date dat = new Date();
		java.sql.Date date = new java.sql.Date(0);
	}
}
