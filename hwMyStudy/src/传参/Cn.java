package ����;

public class Cn {

	/**
	 * void �޷���ֵ
	 * ��������void���Σ�����û�з���ֵ
	 * ����void,������ʹ������������������ʹ�����з���ֵ��������ֱ��ȥ��void
	 * ��������з���ֵ����ôһ��Ҫʹ��return����һ����ͬ���͵�����
	 * returnһ��ִ�У������������������ص����÷�����λ�ü���ִ��ʣ�����
	 * 
	 * return ���ڷ���
	 * 
	 * 
	 * ������������ ������ = ֵ;
	 * ������������ ������ = ֵ;
	 * 
	 */
	
	public static void main(String[] args) {
		//1.boolean���͵ķ���ֵ
		/*Cn.ss();
		System.out.println(ss());*/
		
		//2.���鷽���ĵ���
		/*Cn cn = new Cn();
		int[] i = cn.xx();
		for (int k : i) {
			System.out.println(k);
		}*/
		
		//3.�෽���ĵ���
		/*Cn cn = new Cn();
		Cv i = cn.cc();
		
		System.out.println(i.name);
		System.out.println(i.age);*/
		
		
			Cn cn= new Cn();
			int[] arr = cn.aa();
			for (int k : arr) {
				System.out.println(k);
			}
	}
	
	
	//1.boolean���͵ķ���ֵ
	/*public static boolean ss(){
		
		return false;
		
	}*/
	
	//2.���鷽���ĵ���
	/*public int[] xx(){
		int[] arr = {4,5,6};
		return arr;
	}*/
	
	//3.�෽���ĵ���
	/*public Cv cc(){
		Cv an = new Cv();
		an.age = 18;
		an.name = "����";
		return an;
	}*/
	
	public int[] aa(){
		Cv cv = new Cv();
		int[] i = cv.bb();
		return i;
	}
	
}
