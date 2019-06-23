package 传参;

public class Cn {

	/**
	 * void 无返回值
	 * 方法中用void修饰，代表没有返回值
	 * 除了void,还可以使用其他的数据类型来使方法有返回值，但不能直接去掉void
	 * 如果方法有返回值，那么一定要使用return返回一个相同类型的数据
	 * return一但执行，方法立即结束，返回到调用方法的位置继续执行剩余代码
	 * 
	 * return 用于返回
	 * 
	 * 
	 * 基本数据类型 变量名 = 值;
	 * 引用数据类型 对象名 = 值;
	 * 
	 */
	
	public static void main(String[] args) {
		//1.boolean类型的返回值
		/*Cn.ss();
		System.out.println(ss());*/
		
		//2.数组方法的调用
		/*Cn cn = new Cn();
		int[] i = cn.xx();
		for (int k : i) {
			System.out.println(k);
		}*/
		
		//3.类方法的调用
		/*Cn cn = new Cn();
		Cv i = cn.cc();
		
		System.out.println(i.name);
		System.out.println(i.age);*/
		
		
			Cn cn= new Cn();
			int[] arr = cn.aa();
			for (int k : arr) {
				System.out.println(k);
			}
	}
	
	
	//1.boolean类型的返回值
	/*public static boolean ss(){
		
		return false;
		
	}*/
	
	//2.数组方法的调用
	/*public int[] xx(){
		int[] arr = {4,5,6};
		return arr;
	}*/
	
	//3.类方法的调用
	/*public Cv cc(){
		Cv an = new Cv();
		an.age = 18;
		an.name = "旺财";
		return an;
	}*/
	
	public int[] aa(){
		Cv cv = new Cv();
		int[] i = cv.bb();
		return i;
	}
	
}
