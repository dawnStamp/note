package text;
import java.util.Scanner;
public class Text {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("欢迎来到百度用户登陆界面");
		System.out.println("请输入您的账号");
		int zh = sc.nextInt();
		System.out.println("请输入您的密码");
		int mm = sc.nextInt();
		Login lo = new Login();
		if(zh==1&&mm==2){
			System.out.println("登陆成功");
			}else{
				System.out.println("账号密码不对，登陆失败");
			}
		
		
	}
}
