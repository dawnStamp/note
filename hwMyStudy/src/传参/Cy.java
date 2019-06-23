package 传参;

public class Cy {
	
	/**
	 * 传参
	 * 
	 * 形参的名字不需要和实参相同
	 * 
	 * 方法之间的传参
	 * 1.两边参数个数必须相同
	 * 2.两边的参数类型必须相同
	 * 3.形参的名字可以修改，不需要和实参的名字一致
	 * 4.传参是通过顺序对应的，和名字无关
	 * @param args
	 */

	public static void main(String[] args) {
		/*double aa = 10.0;//实参  实际参数
		int bb = 20;*/
		
		
		//传数组
		/*int[] i={1,2,3};
		Cy cy = new Cy();
		cy.abc(i);//在调用abc方法的同时，将aa作为参数传递过去
*/		
		
		//传类
		Cs cs = new Cs();
		cs.name = "张三";//给属性
		cs.age = 17;
		
		Cy cy = new Cy();
		cy.aaa(cs);
		
		}
	//行参 形式参数
	
	/*public void abc(int[] i){
		for (int j : i) {
			System.out.println(j);
		}	
	}*/
	
	public void aaa(Cs cs){
		System.out.println(cs.name+cs.age);
	}
}
