package io��.�ݹ�;

/**
 * 
 * �ݹ� 
 * 		�����������ı�̼��ɳ�Ϊ�ݹ�
 * @author oracleOAEC
 *
 */
public class Demo {

	int i = 1;
	public static void main(String[] args) {
		Demo d = new Demo();
		d.sss();
		System.out.println(33333);
	}
	
	
	public void sss(){
		i++;
		if(i==3){
			return; 	
		}
		System.out.println(11111);
		sss();
		System.out.println(22222);
	}
	
	
}
