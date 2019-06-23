package 继承;

public class Text {

	public static void main(String[] args) {
		//根据Cat类创建了一个名叫cat的对象
		Cat cat = new Cat(22.22,"yyy",2,"六根胡须","琥珀色瞳孔");
		cat.eat();
		cat.maobu();
		
		System.out.println(cat);
		
		/*Text t = new Text();
		t.equals();
		String i = t.toString();//将对象转换成字符串
		System.out.println(i);*/
	}

	
	
	
}
