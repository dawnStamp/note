package cn.register;

import java.util.Scanner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UserController {
	
	Scanner sc = new Scanner(System.in);
	
	//��ͼ
	public void view(){
		
		System.out.println("��ӭ���������̳ǣ�");
		System.out.println("(1)��½   (2)ע��");
		int choose = sc.nextInt();
		
		if(choose==1){
			//������
		}else if(choose==2){
			register();
		}else{
			System.out.println("ѡ����ڣ�");
		}
	}
	
	public void register(){
		User user = new User();
		System.out.println("�������˺ţ�");
		user.setUsername(sc.next());
		System.out.println("���������룺");
		user.setPassword(sc.next());
		
		ObjectMapper om = new ObjectMapper();
		try {
			String info = om.writeValueAsString(user);
			CSocket cs = new CSocket();
			cs.cSocket(info);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}
}
