package cn.方法调用.练习;


public class SaveUser {

	public String[] save(String name,int age){
		String[] arr = new String[2];
		
		arr[0] = name;
		
		//字符串和任何东西相加，得到的都是一个字符串
		arr[1] =age+"";
//		arr[1] =String.valueOf(age);
		
		
		
		return arr;
	}
}
