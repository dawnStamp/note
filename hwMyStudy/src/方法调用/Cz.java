package 方法调用;

import java.util.Iterator;

public class Cz{

	public String[] save(String name,int age){
		String [] arr= new String[2];
		
		arr[0] = name;
		arr[1] = String.valueOf(age);//age+""  
		//字符串和任何东西相加，得到的都是一个字符串
		 
		return arr;
	}
}
