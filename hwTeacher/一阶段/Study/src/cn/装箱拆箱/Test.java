package cn.װ�����;

/**
 * Java����һ�Ŵ������������
 * 		�������ָ�������������Ϊ����
 * 		���еĶ������Ƕ��󣬳���Ա������Щ��������ɹ���
 * 
 * 		�����������Ͳ�������������˼��
 *
 *װ�����
 *
 *			8������������Ͷ�Ӧ��װ�����ͣ�
 *					double-->Double
 *					float-->Float
 *					long-->Long
 *					short-->Short
 *					byte-->Byte
 *					boolean-->Boolean
 *					int-->Integer
 *					char-->Character
 */
public class Test {

	public static void main(String[] args) {
		/*//װ��
		Integer in = new Integer(10);
	
		//�Զ�װ��
		Integer in2 = 10;
		
		//����
		int a = in.intValue();
		
		//�Զ�����
		int b = in2;*/
		
		Integer i = 10;
		//Integer a= i+10;
//		double d = i.doubleValue();
//		double c = i;
		
		int z = 10;
		//��Integer���͵ĺ�int���͵Ľ��бȽ�
		boolean bo = i.equals(z);
		String str = i.toString();//ת����String����
//		i.compareTo(anotherInteger);
		int abc = Integer.max(10, 20);
		
		String sr = "123";
		System.out.println(abc);
	}
}
