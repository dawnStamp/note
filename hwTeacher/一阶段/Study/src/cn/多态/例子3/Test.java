package cn.��̬.����3;

//����ת��
public class Test {

	public static void main(String[] args) {
		
		//����ת��
		//ǰ���Ǻ�����������һ��ʵ�������Ϊtrue
		//B�Լ�B���������࣬���������Ķ�������ǰ�棬����������
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
