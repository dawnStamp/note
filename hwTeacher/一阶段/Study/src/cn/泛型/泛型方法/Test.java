package cn.����.���ͷ���;

/**
 * ���ͷ���
 * 		���ͷ����еķ��ͣ�ֻ�����ڱ�������ʹ��
 * 		
 *
 */
public class Test {

	public static void main(String[] args) {
		Human hu = new Human();
		String ss = hu.<String>eat("zhangsan");
		Integer in = hu.<Integer>eat(1);
		System.out.println(ss);
		System.out.println(in);
		
	}
}
