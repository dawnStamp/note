package ��¼;

import java.util.Scanner;

public class MyIndex {
	Scanner sc = new Scanner(System.in);
	UserServiceImpl usi = new UserServiceImpl();
	User user = new User();
	
	public void view(){
		System.out.println("��ӭ����������ˣ�");
		System.out.println("1:��½  2:ע��");
		int choose = sc.nextInt();
		String result = null;
		if(choose==1){

			System.out.println("�����������˺ţ�");
			String username = sc.next();
			System.out.println("�������������룺");
			String password = sc.next();

			result = usi.login(username, password);

		}else if(choose==2){
			System.out.println("�����������˺ţ�");
			user.setUsername(sc.next());
			
			System.out.println("�������������룺");
			user.setPassword(sc.next());
			
			System.out.println("����������������");
			user.setName(sc.next());
			
			System.out.println("�������������䣺");
			user.setAge(sc.nextInt());
			
			System.out.println("�����������Ա�");
			user.setSex(sc.next());
			
			result = usi.register(user);
		}else{
			System.out.println("�������ֵ������");
		}
		
		//������
		System.out.println(result);
		
	}
}
