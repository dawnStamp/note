package cn.����;


/**
 * �βε����ֲ���Ҫ��ʵ����ͬ
 * 
 * 1.���߲�������������ͬ
 * 2.���ߵĲ������ͱ�����ͬ
 * 3.�βε����ֿ����޸ģ�����Ҫ��ʵ�ε�����һ��
 * 4.������ͨ��˳���Ӧ�ģ��������޹�
 */
public class Demo {

	public static void main(String[] args) {
		/*int aa=10;
		double bb = 20.3;*/
//		int[] i = {1,2,3};
		Demo de = new Demo();
		
		Animal an = new Animal();
		an.name = "����";
		an.age = 17;
		
		//ʵ��   ʵ�ʲ���
		de.abc(an);//�ڵ���abc������ͬʱ����aa��Ϊ�������ݹ�ȥ
	}
	
	//�в�  ��ʽ����
	public void abc(Animal an){
		System.out.println(an.name+an.age);
		/*for (int k : i) {
			System.out.println(k);
		}*/
	}
	
}
