package cn.��������.��ϰ;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��ӭע��XX��վ");
		System.out.println("��������������");
		String name = sc.next();
		
		System.out.println("��������������");
		int age = sc.nextInt();
		
		System.out.println("����������ʲô���͵��û�(1:�����û�   2:��Ѷ�û�    3:�ٶ��û�)");
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
			System.out.println("�ٶ��û�");
		}else{
			System.out.println("�����û�");
		}
	}
}
