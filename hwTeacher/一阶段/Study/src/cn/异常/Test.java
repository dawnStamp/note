package cn.�쳣;

import java.util.Scanner;

import cn.����.Animal;

/**
 * ʲô���쳣��
 * 		��ν�쳣��ָ�ڳ������й����з�����һЩ�������¼���
 * 
 * NullPointerException
 * ArrayIndexOutOfBoundsException
 * ArithmeticException: / by zero	
 * RuntimeException
 * IOException
 * SQLException
 * ClassNotFoundException
 * 
 *�쳣���µĺ����
 *			����ֱ���ж�
 *
 *��η�ֹ�����жϣ�
 *			������õĳ���Ӧ���ڳ����쳣����ʱ�ṩ������Щ�쳣�ķ�����
 *			ʹ�ó��򲻻���Ϊ�쳣�ķ�������ϻ��������Ԥ���ĺ��
 *
 *Java���쳣��ͨ�����ֻ���������ģ�
 *			1.����
 *						try-catch-finally
 *			2.�׳�
 *						throw		�ֶ��׳��쳣����������ĳЩ���Ǵ����˵����飬�ֶ��׳��쳣����catch������и�����Ӧ����
 *						throws		�������п��ܳ��ֵ��쳣�׸���һ�㴦��
 *
 *
 *�ڲ���
 *matchs����
 *MD5����
 *
 *�Զ����쳣��
 *			1.�Զ����쳣���������е��쳣��̳�
 *			2.�����쳣��˵������Ҫ�Ĳ��־�����������
 *	
 *
 *		
 */
public class Test {

	public static void main(String[] args) {
		//�����쳣
		try {
			abc();
			throw new ArrayIndexOutOfBoundsException();
		} catch (Exception e) {
			System.out.println("���������");
		}
	}
	public static void abc() throws Exception{
	}
	public static void test() throws Exception{
		int i = 1/0;
		/*Scanner sc = new Scanner(System.in);
		String str = null;

		while(true){
			try{//����
				String num = sc.next();
				if(num.equals("length")){
					int i = 1/0;
				}
				//				return;//�������ط����ĵ��ô�
			}catch(NullPointerException ec){//�����񵽵��쳣
				ec.printStackTrace();
			}catch(Exception exc){//�����񵽵��쳣
				exc.printStackTrace();
			}finally{
				//�ƺ��������Ƿ����쳣����������ִ��(�����ִ��)
				System.out.println("1111");
				sc.close();
			}
		}*/
	}
}
