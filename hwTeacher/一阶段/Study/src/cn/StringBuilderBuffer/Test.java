package cn.StringBuilderBuffer;

/**
 * String ����һ�������Ͳ��ܸı䡣
 * �����Ҫ���д������ַ����޸Ĳ�����Ӧ��ʹ��StringBuilder/StringBuffer���ַ�����
 * ���ս������ת����String����
 * 
 * StringBuffer
 * 		�̰߳�ȫ�Ŀɱ��ַ�����
 * 		ͨ��ĳЩ�������ÿ��Ըı��ַ����ĳ��Ⱥ�����
 * 		�ַ�������������һ��������������������������������Զ�����
 * 
 * StringBuilder
 * 		��JDK5��ʼ��ΪStringBuffer�ಹ����һЩ����
 * 		��StringBuffer��ȣ�ͨ��Ӧ������ʹ��StringBuilder�࣬
 * 		��Ϊ��֧��������ͬ�Ĳ���������������ִ��ͬ���������ٶȸ���
 * 
 * String ��StringBuffer/StringBuilder
 * 		1.String��ֵ���ܱ��޸�
 * 			StringBuffer/StringBuilder���Ա��޸�
 * 		
 * 		2.���ַ�����ֵ�����޸ģ�ʹ��StringBuffer/StringBuilder�������
 * 			StringBuffer/StringBuilder���ṩһЩ���ַ�����ֵ�����޸ĵķ���
 * 
 * ʲôʱ����String?ʲôʱ����StringBuilder
 * 		�����޸Ĳ�����ʱ��ʹ��String
 * 		�����޸Ĳ�����ʱ��ʹ��StringBuilder
 * 
 */
public class Test {

	public static void main(String[] args) {
		String ss = "abc123";
		StringBuilder str  = new StringBuilder(ss);
		StringBuilder sb = str.replace(2, 3, "xxxx");
		
		
		String s =sb.toString();
		System.out.println(s);
		/*
		str.append("123");
		str.toString();
		str.length();
		str.insert(offset, b);
		str.delete(start, end);//ɾ����start��ʼ����end����
		str.reverse();//��ת
		str.replace(start, end, str);
		str.charAt(index);//����������������
		str.indexOf(str);//�������ݲ��ҵ�һ�����ֵ�����
		str.lastIndexOf(str);
		str.substring(start);*/
		
//		StringBuilder sb = str.replace(2, 3, "xxxx");//�ӵ�һ���������ڶ�����֮ǰ�����������滻Ϊ����������
//		StringBuilder sb2 = str.insert(1, "999");//�ڵ�һ������֮ǰ����ڶ�������
		
		String str2 = "abc123";
		
		String s1 = str2.substring(0, 3);
		String s2 = str2.substring(3, 6);
		String res = s1+"999"+s2;
		
		
		System.out.println(res);
	}
}
