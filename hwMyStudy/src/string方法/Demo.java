package string����;

/**
 * ����String�����ַ�����
 * 1.String str = "���";(���� )
 * 2.String str = new String("���")��
 * 
 * 
 * һ.
 * 	
 * 	String s1 ="abcd";
 * 	String s2 ="abcd";
 * 	s1==s2;   true
 * 
 * s2�����ַ��������ҡ���ô��һģһ����ֵ���ڣ�
 * 	���û�С��򿪱�һ���µ�λ�ã�
 * 	����У���s2���ҵ����ǿ�λ��ֱ�Ӱ�
 * 
 * ��.
 * 	String s1 = new String("abcd");
 * 	String s2 = new String("abcd");
 * 	s1==s2;    false
 * 
 *  ��������ĵ�һ�����ǿ���һ���ڴ�ռ䣬����s1��s2����ͬһ���ڴ�ռ�
 *  
 *  1.Strin�����ǲ��ɱ��
 *  2.����ÿһ���������޸�Stringֵ�ķ�������ʵ���Ǵ�����һ���µ�String����
 *  String str = "���"
 *  str = str+"123"        ���123
 *  
 *  3.String��ֻ�����Դ���Ч���Ż�����
 *  4.ϵͳ��String�ķ��޸Ĳ�������Ч�ʺܸߣ�ԶԶ�������������ַ�����StringBuffer��StringBuilder
 * 
 * 
 *  String���÷�����
 *   1.length()
 *   2.substring()
 *   3.split()
 *   4.equals()
 *   5.isEmpty()
 *   6.startWith()
 * 
 * 
 * @author oracleOAEC
 *
 */


public class Demo {

	private static CharSequence target;
	private static CharSequence replacement;

	public static void main(String[] args) {
		//����String
		/*String str = "���";
				
		String ss = new String("���");
		System.out.println(ss);*/
		
		String str = "ab,ab,cad";
		
	
		//����
		int le = str.length();//��ȡ�ַ�������
		int le1=str.indexOf("b");//������Ԫ�����ַ�����һ�γ��ֵ�λ��
		int le2=str.lastIndexOf("b");//������Ԫ�����ַ������һ�γ��ֵ�λ��
		char le3=str.charAt(0);//�����ַ�����indexλ���ϵ��ַ�
		char[] le4 =str.toCharArray();//���ַ���ת��Ϊһ���ַ�����
		String le5 = String.valueOf(1);//��int������ת��Ϊ�ַ���
		String le6 = str.toLowerCase();//��String�������ַ���ת��ΪСд
		String le7 = str.toUpperCase();//��String�������ַ���ת��Ϊ��д
		String le8 = str.replace("a", "z");//��zԪ���滻ԭ�ַ�����aԪ��
		String[] le9 = str.split("b");//���ݲ�����ԭ�ַ����ָ�����ɸ��ַ���
		for(String s:le9){
			System.out.println(s);
		}
		String le10 = str.trim();//����һ�����ַ�������ȥ����ԭ�ַ�����β�Ŀո�
		String le11 = str.substring(3);//��ȡ����������������ַ�
		String le12 = str.substring(1,3);//��ȡ������1��ʼ������3֮����ַ�
		boolean le13 = str.equals("1");//�жϴ��ַ�����ָ�����ַ����Ƚ��Ƿ����
		boolean le14 = str.startsWith("a");//�жϴ��ַ����Ƿ���ָ�����ַ�����ʼ
		boolean le15 = str.endsWith("a");//�жϴ��ַ����Ƿ���ָ�����ַ�������
		boolean le16 = str.contains("a");//�жϴ��ַ����Ƿ����ָ�����ַ�������
		boolean le17 = str.isEmpty();//���ַ�������Ϊ0ʱ������true
		
		System.out.println(le);
		System.out.println(le1);
		System.out.println(le2);
		System.out.println(le3);
		System.out.println(le4);
		System.out.println(le5);
		System.out.println(le6);
		System.out.println(le7);
		System.out.println(le8);
		System.out.println(le10);
		System.out.println(le11);
		System.out.println(le12);
		System.out.println(le13);
		System.out.println(le14);
		System.out.println(le15);
		System.out.println(le16);
		System.out.println(le17);
	}
}
