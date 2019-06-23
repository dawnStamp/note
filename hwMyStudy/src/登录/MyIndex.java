package 登录;

import java.util.Scanner;

public class MyIndex {
	Scanner sc = new Scanner(System.in);
	UserServiceImpl usi = new UserServiceImpl();
	User user = new User();
	
	public void view(){
		System.out.println("欢迎来到红客联盟！");
		System.out.println("1:登陆  2:注册");
		int choose = sc.nextInt();
		String result = null;
		if(choose==1){

			System.out.println("请输入您的账号：");
			String username = sc.next();
			System.out.println("请输入您的密码：");
			String password = sc.next();

			result = usi.login(username, password);

		}else if(choose==2){
			System.out.println("请输入您的账号：");
			user.setUsername(sc.next());
			
			System.out.println("请输入您的密码：");
			user.setPassword(sc.next());
			
			System.out.println("请输入您的姓名：");
			user.setName(sc.next());
			
			System.out.println("请输入您的年龄：");
			user.setAge(sc.nextInt());
			
			System.out.println("请输入您的性别：");
			user.setSex(sc.next());
			
			result = usi.register(user);
		}else{
			System.out.println("您输入的值不存在");
		}
		
		//输出结果
		System.out.println(result);
		
	}
}
