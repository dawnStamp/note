package cn.��������;

/**
 * ͬһ��java�ļ���
 * 
 * һ��
 * 		������();      ���߶��Ǿ�̬�ġ����ǷǾ�̬��      					
 * ����
 * 		���������ٵ���
 * 		���� ������=new ����();																	��Ҫ����һ��ʵ������
 * 		������.������();
 * ����
 * 		���þ�̬����																							��Ҫ����һ����̬����
 * 		����.������();
 * 
 * 
 * ��ͬ��java�ļ���
 * һ��
 * 		���������ٵ���
 * 		���� ������=new ����();																	��Ҫ����һ��ʵ������
 * 		������.������();
 * ����
 * 		���þ�̬����
 * 		����.������();																							��Ҫ����һ����̬����
 * 
 * @author oracleOAEC
 */
public class Demo {


	public static void main(String[] args) {
//		ss();//���ô�
//		Demo.ss();
		Demo d = new Demo();
		d.ss();
		Demo.ss();
		
		byte b=(byte) 130;
		
		System.out.println(b);
	}
	
	/**
	 * ��̬����
	 */
	public static void ss(){
		//�����ô�
		System.out.println("��̬����");
	}
	
	/**
	 * �Ǿ�̬����
	 */
/*	public void xx(){
		
		System.out.println("�Ǿ�̬����");
	}*/
	
	
}
