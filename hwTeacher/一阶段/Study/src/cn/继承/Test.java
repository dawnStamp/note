package cn.继承;

public class Test {

	public static void main(String[] args) {
		//根据Cat类创建了一个名叫cat的对象
		Cat cat = new Cat();
		cat.huxu = "黄色的胡须";
		cat.eyes = "漆黑的瞳孔";
		
		System.out.println(cat);
		
		/*Test t = new Test();
//		t.equals();
		String i = t.toString();//将对象转换成字符串
		System.out.println(i);*/
	}
	
	
}
