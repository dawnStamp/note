package stringBuilder����;

/**
 * String ����һ�������Ͳ��ܸı䡣
 * �����Ҫ���д������ַ����޸Ĳ�����Ӧ��ʹ��StringBuilder/StringBuffer���ַ�����
 * char[] ch ={'��'��'��'}; 
 * ���ս������ת����String����
 * 
 * StringBuffer
 * 		�̰߳�ȫ�Ŀɱ��ַ�����
 * 		ͨ��ĳЩ�������ÿ��Ըı��ַ����ĳ��Ⱥ�����
 * 		�ַ�������������һ��������������������������������Զ�����
 * 
 * StringBuilder
 * 		��jdk5��ʼ��ΪStringBuffer�ಹ����һЩ����
 * 		��StringBuffer��ȣ�ͨ������ʹ��StringBuilder�࣬��Ϊ��֧��������ͬ�Ĳ���
 * 		����������ִ��ͬ���������ٶȸ���
 * 
 *String��StringBuffer/StringBuilder
 *		1.String��ֵ���ܱ��޸�
 *		StringBuffer/StringBuilder���Ա��޸�
 *		2.���ַ�����ֵ�����޸ģ�ʹ��StringBuilder/StringBuffer�������
 *		StringBuffer/StringBuilder���ṩһЩ���ַ�����ֵ�����޸ĵķ���
 *	
 *ʲôʱ����String��ʲôʱ����StringBuilder
 *		�����޸Ĳ�����ʱ��ʹ��String
 *		�����޸Ĳ�����ʱ��ʹ��StringBuilder
 *
 *ƽ��ȫ��String�������ļ�����ز�����StringBuilder
 * @author oracleOAEC
 *
 */
public class Demo {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("abc123");
		
//		String s1 = str.toString();//ת��Ϊ�ַ���
//		int s2 = str.length();//�㳤��
//		StringBuilder s3 = str.insert(0, true);//����
//		StringBuilder s4 = str.delete(0, 3);//ɾ��
//		StringBuilder s5 = str.reverse();//��ת
		StringBuilder s6 = str.replace(1,3,"xxx");//�滻
		
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
//		System.out.println(s4);
//		System.out.println(s5);
		System.out.println(s6);
	}
}
