package ����;

public class Cy {
	
	/**
	 * ����
	 * 
	 * �βε����ֲ���Ҫ��ʵ����ͬ
	 * 
	 * ����֮��Ĵ���
	 * 1.���߲�������������ͬ
	 * 2.���ߵĲ������ͱ�����ͬ
	 * 3.�βε����ֿ����޸ģ�����Ҫ��ʵ�ε�����һ��
	 * 4.������ͨ��˳���Ӧ�ģ��������޹�
	 * @param args
	 */

	public static void main(String[] args) {
		/*double aa = 10.0;//ʵ��  ʵ�ʲ���
		int bb = 20;*/
		
		
		//������
		/*int[] i={1,2,3};
		Cy cy = new Cy();
		cy.abc(i);//�ڵ���abc������ͬʱ����aa��Ϊ�������ݹ�ȥ
*/		
		
		//����
		Cs cs = new Cs();
		cs.name = "����";//������
		cs.age = 17;
		
		Cy cy = new Cy();
		cy.aaa(cs);
		
		}
	//�в� ��ʽ����
	
	/*public void abc(int[] i){
		for (int j : i) {
			System.out.println(j);
		}	
	}*/
	
	public void aaa(Cs cs){
		System.out.println(cs.name+cs.age);
	}
}
