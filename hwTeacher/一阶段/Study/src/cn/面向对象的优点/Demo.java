package cn.���������ŵ�;


/**
 * ���������ŵ㣺
 * 		1.���ڳ���ģ����ʵ�����е�ʵ��
 * 					�����װ��ģʵ���������Ժ���Ϊ
 * 		2.����ϸ��
 * 					�������Ϊ��״̬����װ�����У���粻��Ҫ��ע�ڲ�ϸ�����ʵ��
 * 		3.������
 * 					����ͨ����ģ�壬�����������ʵ����������Ķ������
 * 
 * Java����������
 * 		Java����ʱ��ϵͳ��һ�����������̸߳����������ʹ�õĶ����׳�����������
 * 		��������������ɨ���ڴ棬���ڱ�ʹ�õĶ�����ϱ�ǣ������ܵ�·��ɨ���������δ�ӱ�ǵĶ���
 * 		�����յĶ����ǣ�
 * 					1.���ٱ��κα������õĶ���
 * 					2.��Ϊ��������Ϊnull
 * 					3.δ��ʹ�õĶ���
 * 
 * 			String str1 = "";
 * 			String str2 = null;
 * 	
 * 			if(str1.equals("123")){
 * 	
 * 			}
 * 			if(str2.equals("123")){
 * 	
 * 			}
 * 
 */
public class Demo {

	public static void main(String[] args) {
		Woman woman1 = new Woman();
		Woman woman2 = new Woman();
		Woman woman3 = new Woman();
		Woman woman4 = new Woman();
		Woman woman5 = new Woman();
		Woman woman6 = new Woman();
		Woman woman7 = new Woman();
		
		woman1 = null;
		woman1.beautyWoman();
	}
}
