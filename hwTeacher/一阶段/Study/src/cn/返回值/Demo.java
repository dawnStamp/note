package cn.����ֵ;

/**
 * ��������void���Σ�������û�з���ֵ
 *����void,������ʹ������������������ʹ�����з���ֵ��������ֱ��ȥ��void
 *��������з���ֵ����ôһ��Ҫʹ��return����һ����ͬ���͵�����
 *returnһ��ִ�У������������������ص����÷�����λ�ü���ִ��ʣ�����
 *
 *return ���ڷ���
 *
 */
public class Demo {
	
	public static void main(String[] args) {
		Demo de = new Demo();
		Animal i = de.aa();
		
		System.out.println(i.name);
		System.out.println(i.age);
		
	}
	
	/**
	 * ʵ��
	 * 
	 * ������������ ������ = ֵ;
	 * ������������ ������ = ֵ;
	 * 		int[]	{}   
	 * 		Animal    new Animal();
	 */
	public Animal aa(){
		Animal an = new Animal();
		int i = 10;
		an.age = 18;
		an.name = "����";
		return an;
	}
}
