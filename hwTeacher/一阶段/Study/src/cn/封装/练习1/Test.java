package cn.封装.练习1;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//创建控制台输入的对象，对象名为sc
		int age = sc.nextInt();//将控制台输入的数字存到age中
		int salary = sc.nextInt();//将控制台输入的数字存到salary中
		
		Demo de = new Demo();//根据Demo类，创建对象，对象的名称为de
		de.setAge(age);//调用setAge()方法，并将age作为参数传递过去
		de.setSalary(salary);//调用setSalary()方法，并将salary作为参数传递过去
	}
}

