package cn.��̬;


/**
 * ��̬�Ķ������Ǻ���󶨵�
 * �Ǿ�̬�Ķ������ǺͶ���󶨵�
 * 
 * void �޷���ֵ
 */
public class A {

	public static void main(String[] args) {
		B.i2 = 20;
		B.i2 = 30;
		
		System.out.println(B.i2);
		
		
		B b = new B();
		b.i = 20;
		b.bb();
		
		B b2 = new B();
		b2.i =30;
		
		System.out.println(b.i);
	}
	
	/*public void aa(){
		B b = new B();
		b.cc();
		B.bb();
	}*/
}
