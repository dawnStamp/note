package lianxi;

public class A {

	public static void main(String[] args) {
		A a = new A();
		int[] arr = a.aaa();
		for (int i : arr) {
			System.out.println(i);
		}
	}
	
	public int[] aaa(){
		B b = new B();
//		int[] arr = b.bbb();
		return b.bbb();
	}
}
