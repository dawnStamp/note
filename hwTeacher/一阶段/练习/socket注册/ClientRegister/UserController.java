package cn.register;

import java.util.Scanner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UserController {
	
	Scanner sc = new Scanner(System.in);
	
	//视图
	public void view(){
		
		System.out.println("欢迎来到哈哈商城！");
		System.out.println("(1)登陆   (2)注册");
		int choose = sc.nextInt();
		
		if(choose==1){
			//待补充
		}else if(choose==2){
			register();
		}else{
			System.out.println("选项不存在！");
		}
	}
	
	public void register(){
		User user = new User();
		System.out.println("请输入账号：");
		user.setUsername(sc.next());
		System.out.println("请输入密码：");
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
