package lianxi;

import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ���ҵ����֣�");
		int num = sc.nextInt();//�û����������
		
		Impl im = new Impl();
		String res = im.find(num);
		
		System.out.println(res);
		
	}
}
