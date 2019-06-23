package cn.多态.例子3;

//向下转型
public class Test {

	public static void main(String[] args) {
		
		//向上转型
		//前面是后面或其子类的一个实例，结果为true
		//B以及B的所有子类，创建出来的对象，填在前面，都满足条件
		Animal a = new Bird();
		if( a instanceof Bird){
			Bird b = (Bird)a;
			b.a();
			b.b();
			b.c();
		}else{
			System.out.println("11111");
		}
	}
}
