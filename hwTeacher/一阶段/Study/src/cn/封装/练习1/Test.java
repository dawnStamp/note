package cn.��װ.��ϰ1;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//��������̨����Ķ��󣬶�����Ϊsc
		int age = sc.nextInt();//������̨��������ִ浽age��
		int salary = sc.nextInt();//������̨��������ִ浽salary��
		
		Demo de = new Demo();//����Demo�࣬�������󣬶��������Ϊde
		de.setAge(age);//����setAge()����������age��Ϊ�������ݹ�ȥ
		de.setSalary(salary);//����setSalary()����������salary��Ϊ�������ݹ�ȥ
	}
}

