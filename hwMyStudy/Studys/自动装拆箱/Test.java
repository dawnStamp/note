package �Զ�װ����;
/**
 * java����һ�Ŵ������������
 * 		�������ָ�������������Ϊ����
 * 		���еĶ������Ƕ��󣬳���Ա������Щ��������ɹ���
 * 
 * 		�����������Ͳ�������������˼��
 * 
 * װ�����
 * 
 * 8���������Ͷ�Ӧ��װ������
 * 	�����������ͣ�	double,float,long,int,short,byte,char,boolean
 * 	�����������ͣ�	Double,Float,Long,Integer,Short,Byte,Character,Boolean
 * 
 * 
 * 
 * @author oracleOAEC
 *
 */
public class Test {

	public static void main(String[] args) {
		//װ��
	/*	int i = 10;
		Integer in = new Integer(i);
		System.out.println(in);
		double i1 = 10.0;
		Double i2 = new Double(i1);
		System.out.println(i2);
		char i3 = 1;
		Character i4 = new Character(i3);
		System.out.println(i4);
		boolean b1 = true;
		Boolean b2 = new Boolean(b1);
		System.out.println(b2);
		
		//�Զ�װ��
		Integer in2 = 10;
		System.out.println(in2);
		
		//����
		int a = in.intValue();
		System.out.println(a);
		//�Զ�����
		int b = in;
		System.out.println(b);*/
		
		Integer i = 10;
		Integer a = i+10;
		double d =i.doubleValue();
		
		//System.out.println(a);
		//��Integer���͵ĺ�int���͵Ľ��бȽ�
		boolean bo = i.equals(10);
		//System.out.println(bo);
		String str = i.toString();//ת����String����
		//i.compareTo(anotherInteger);
		int abc = Integer.max(10, 20);
		int b =i.BYTES;//��
		System.out.println(b);
		
	}
}
