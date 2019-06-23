package lianxi;

import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入您要查找的数字：");
		int num = sc.nextInt();//用户输入的数字
		
		Impl im = new Impl();
		String res = im.find(num);
		
		System.out.println(res);
		
	}
}
