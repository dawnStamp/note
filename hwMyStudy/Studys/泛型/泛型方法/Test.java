package ����.���ͷ���;

/**
 * ���ͷ���
 * 		���ͷ����еķ��ͣ�ֻ�����ڱ�������ʹ��
 * 
 * 
 * 
 * @author oracleOAEC
 *
 */
public class Test {

	public static void main(String[] args) {
		Human hu = new Human();
		String st = hu.<String>eat("����");
		System.out.println(st);
		Integer in = hu.<Integer>eat(1);
		System.out.println(in);
		
		
	}
}
