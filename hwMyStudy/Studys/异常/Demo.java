package �쳣;

import java.util.Scanner;

/**
 * ʲô���쳣��
 * 		��ν�쳣��ָ�ڳ������й����з�����һЩ�������¼�
 * NullPointerException
 * ArrayIndexOutOfBoundsException
 * ��0�쳣  ArithmeticException: / by zero
 * RuntimeException �����쳣
 * 
 * 
 * �쳣���µĺ���������ж�
 * 		
 * ��η�ֹ�����жϣ�
 * 		������õĳ���Ӧ���ڳ����쳣����ʱ�ṩ������Щ�쳣�ķ�����ʹ�ó��򲻻���Ϊ�쳣�ķ���
 * 		����ϻ��������Ԥ���ĺ��
 * 
 * java���쳣��ͨ�����ֻ���������ģ�
 * 		1.����
 * 			try-catch-finally
 * 
 * 			final,finally,finalize
 * 		2.�׳�
 * 			throw	�ֶ��׳��쳣  ����������ĳЩ���Ǵ����˵����飬�ֶ��׳��쳣��
 * 					��catch������и�����Ӧ�Ĵ���
 * 			throws  �������п��ܳ��ֵ��쳣�׸���һ�㴦��
 * 
 * 
 * �Զ����쳣��
 * 		1.�Զ����쳣���������е��쳣��̳�
 * 		2.�����쳣��˵������Ҫ�Ĳ��־�����������
 * 
 * @author oracleOAEC
 *
 */

public class Demo {

	public static void main(String[] args){
		/*Scanner sc = new Scanner(System.in);
		String str = null;

		while(true){
			System.out.println("����������Ҫ��Ч��");
			String num = sc.next();
			if(num.equals("length")){
				try{//����
					str.length();

				}catch(NullPointerException e){//�����񵽵��쳣	
					System.out.println("��Լ����");
					e.printStackTrace();
				}catch(Exception ec){//�����񵽵��쳣
					System.out.println("�쳣");
					ec.getCause();
				}finally{
					//�ƺ��������Ƿ����쳣����������ִ��(�����ִ��)
					System.out.println("���ַ���");

				}
			}
		}*/

		/*try{
			int i = 1/0;
			System.out.println(i);
		}catch(Exception ec){
			System.out.println(7777);
		}*/
		
		
		try {
			throw new Exception();
		} catch (Exception e) {
		System.out.println("dhaauhdaada");
			e.printStackTrace();
		}
	}
	
	public static void test() throws Exception{
		int i = 1/0;
	}
}
