package test.IDE;

/**
 * 
 * IDE����(Integrated Development Environment)
 * 		���ɿ�������
 * 
 * 		һ���������༭��������������������ͼ���û����湤��
 * 		���Ǽ̳��˴����д���ܣ��������ܣ����빦�ܣ����Թ��ܵ�һ��Ŀ������������
 * 
 * java���򳣼���IDE
 * 		NetBeans       
 * 		JBuilder	
 * 		IntellijIDEA
 * 		Eclipse	
 * 
 * 
 * ���Բ���
 * 	1.�����жϳ�������λ��
 * 	2.��ָ���ĳ������öϵ�
 * 	3.���С�׳�
 * 	4.��F6�������г���
 * 	5.�۲��������ʽ��ֵ
 * 	6.�ҵ����Ⲣ�޸�����
 * 	7.�������ճ���
 * 
 * @author oracleOAEC
 *
 */
public class Test {
	
	public static void main(String[] args) {
		int i = 10;
		try{
			if(i==10){
				i=50;
				int num = i/0;
				System.out.println(num);
			}
		}catch(Exception exp){
			exp.printStackTrace();
		}
	}
}
