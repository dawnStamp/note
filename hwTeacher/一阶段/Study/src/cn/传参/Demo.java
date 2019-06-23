package cn.传参;


/**
 * 形参的名字不需要和实参相同
 * 
 * 1.两边参数个数必须相同
 * 2.两边的参数类型必须相同
 * 3.形参的名字可以修改，不需要和实参的名字一致
 * 4.传参是通过顺序对应的，和名字无关
 */
public class Demo {

	public static void main(String[] args) {
		/*int aa=10;
		double bb = 20.3;*/
//		int[] i = {1,2,3};
		Demo de = new Demo();
		
		Animal an = new Animal();
		an.name = "张三";
		an.age = 17;
		
		//实参   实际参数
		de.abc(an);//在调用abc方法的同时，将aa作为参数传递过去
	}
	
	//行参  形式参数
	public void abc(Animal an){
		System.out.println(an.name+an.age);
		/*for (int k : i) {
			System.out.println(k);
		}*/
	}
	
}
