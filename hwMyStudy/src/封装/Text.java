package ��װ;
import java.util.Scanner;
public class Text {

	public static void main(String[] args) {
		//��һ��
		/*	Demo d = new Demo();
		Scanner sc = new Scanner(System.in);
		System.out.println("�������������");
		String name = sc.next();

		d.setName(name);
		System.out.println("�������������");
		int age = sc.nextInt();
		d.setAge(age);
		System.out.println("��������ǣ�"+name+"   ��������ǣ�"+d.getAge()+"  (�������22Ĭ��22��)");
		*/
		
		Demo m = new Demo();//����Demo�࣬�������󣬶��������Ϊm
		Scanner sc = new Scanner(System.in);//��������̨����Ķ��󣬶�����Ϊsc
		System.out.println("������������䣬����");
		int age = sc.nextInt();//������̨��������ִ浽age��
		int money = sc.nextInt();//������̨��������ִ浽money��
		m.setAge(age);//����setAge����������age��Ϊ�������ݹ�ȥ
		m.setMoney(money);//����setMoney����������money��Ϊ�������ݹ�ȥ
		System.out.println(m.getMoney());
	}
}	

