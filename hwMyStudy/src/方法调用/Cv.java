package ��������;
import java.util.Scanner;
public class Cv {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��ӭע��xx��վ");
		System.out.println("�������������");
		
		String name = sc.next();
		
		System.out.println("�������������");
		int age = sc.nextInt();
		
		System.out.println("����������ʲô���͵��û�(1�������û�  2��qq�û�)");
		int type = sc.nextInt();
		Cx cx = new Cx();
		String[] str = null;
		
		if(type==1){
			str = cx.sinaUser(name,age);
		}else if(type==2){
			str = cx.qqUesr(name,age);
		}else{
			System.out.println("�����û�");
		}
		for (String res : str) {
			System.out.println(res);
		}
	}
}
