package cn.string���;

/**
 * ����string�����ַ�ʽ��
 * 		һ��String str = "���";(����)
 * 		����String str = new String("���");
 * 		
 *����һ��
 *			String s1="abcd";
 *			String s2="abcd";
 *			s1==s2				true
 *
 *			s2�����ַ��������ң���û��һģһ����ֵ���ڣ�
 *					���û�У��򿪱�һ���µ�λ�ã�
 *					����У���s2���ҵ����ǿ�λ��ֱ�Ӱ�
 *
 *	�������
 *			String s1=new String("abcd");
 *			String s2=new String("abcd");
 *			s1==s2				false
 *
 *			��������ĵ�һ�����ǿ���һ���ڴ�ռ䣬����s1��s2����ͬһ���ڴ�ռ�
 *
 *		1.String�����ǲ��ɱ��
 *		2.����ÿһ���������޸�Stringֵ�ķ�������ʵ���Ǵ�����һ���µ�String����
 *		3.String��ֻ�����Դ���Ч���Ż�����
 *		4.ϵͳ��String�ķ��޸Ĳ�������Ч�ʺܸߣ�ԶԶ�������������ַ�����StringBuffer��StringBuilder
 *
 *		String ���÷�����
 *				1.length()
 *				2.substring()
 *				3.split()
 *				4.equals()
 *				5.isEmpty()
 *				6.startWith()
 *
 */
public class Demo {
public int i  =20;
	public static void main(String[] args) {
		/*String str = "���";
		str = str+"123";*/
		//����
		String str = "abc,bc,a";
		
		if(!str.isEmpty()){
			str+="hahaha";
			System.out.println("1111111");
		}
		
		
		
		
		int le = str.length();
		int i1 = str.indexOf("b");
		int i2 = str.lastIndexOf("b");
		char i3= str.charAt(0);
		
		String st = str.replace("a", "z");
//		System.out.println(st);
		
		String i = String.valueOf(true);
//		System.out.println(i);
		
		String[] i4 = str.split(",");
		/*for (String s : i4) {
			System.out.println(s);
		}*/
		
		String syr = str.substring(3);
		String sss = str.substring(2, 4);
		System.out.println(syr);
		
		String name = str.trim();
		System.out.println(name);
		
		boolean bo = str.contains("a");
		System.out.println(bo);
		
//		System.out.println(le);
//		System.out.println(i1);
//		System.out.println(i2);
//		System.out.println(i3);
	}
}
