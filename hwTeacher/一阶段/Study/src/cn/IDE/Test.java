package cn.IDE;

/**
 * IDE����(Integrated Development Environment)
 * 		���ɿ�������
 * 
 * 		һ���������༭��������������������ͼ���û����湤�ߡ�
 * 		���Ǽ̳��˴����д���ܡ��������ܡ����빦�ܡ����Թ��ܵ�һ��Ŀ�����������ס�
 * 
 *Java���򳣼���IDE
 *			NetBeans					���
 *			JBuilder					�շ�
 *			IntellijIDEA			�����桢�콢��
 *			Eclipse						
 *
 *	���������Ϊ���
 *			�༭������ͼ��Java���ṹ�����ͼ������̨��ͼ
 *
 *���ÿ�ݼ���
 *			Ctrl+F     							�ڵ�ǰ�ļ��в��Һ��滻
 *			Alt+/									������ʾ
 *			Ctrl+I								�Զ��Ű�
 *			Ctrl+/								����ע��
 *			Ctrl+Shift+/					����ע��
 *			Ctrl+Shift+\					ȡ������ע��
 *			Ctrl+Shift+O					���ٵ���
 *			Ctrl+Z								����
 *			Ctrl+Y								������
 *			Ctrl+1								�����޸�
 *			Alt+Enter						������Ŀ·��
 *			Ctrl+������				�鿴����
 *			Ctrl+H								����������ֹ���λ��
 *			Ctrl+Shift+R					�����ļ��������ļ�					
 *			Ctrl+D								����ɾ��
 *			Alt+�����						�����ƶ�
 *
 *���Բ��裺
 *			1.�����жϳ�������λ��
 *			2.��ָ���ĳ������öϵ�
 *			3.���С�׳�
 *			4.��F6�������г���
 *			5.�۲��������ʽ��ֵ
 *			6.�ҵ����Ⲣ�޸�����
 *			7.�������ճ���
 *
 */
public class Test {

	public static void main(String[] args) {
		int i = 10;
		try{
			if(i==10){
				i=20;
				int num = i/0;
				System.out.println(num);
			}
		}catch(Exception exp){
			exp.printStackTrace();
		}
	}
}
