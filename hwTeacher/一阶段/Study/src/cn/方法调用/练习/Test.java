package cn.方法调用.练习;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("欢迎注册XX网站");
		System.out.println("请输入您的姓名");
		String name = sc.next();
		
		System.out.println("请输入您的年龄");
		int age = sc.nextInt();
		
		System.out.println("请输入您是什么类型的用户(1:新浪用户   2:腾讯用户    3:百度用户)");
		int type = sc.nextInt();
		
		if(type==1){
			UserType user = new UserType();
			String[] str = user.sinaUser(name,age);
			for (String string : str) {
				System.out.println(string);
			}
		}else if(type==2){
			UserType user = new UserType();
			String[] str = user.qqUser(name,age);
			for (String string : str) {
				System.out.println(string);
			}
		}else if(type==3){
			System.out.println("百度用户");
		}else{
			System.out.println("其他用户");
		}
	}
}
