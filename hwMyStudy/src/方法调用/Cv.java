package 方法调用;
import java.util.Scanner;
public class Cv {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("欢迎注册xx网站");
		System.out.println("请输入你的姓名");
		
		String name = sc.next();
		
		System.out.println("请输入你的年龄");
		int age = sc.nextInt();
		
		System.out.println("请输入你是什么类型的用户(1：新浪用户  2：qq用户)");
		int type = sc.nextInt();
		Cx cx = new Cx();
		String[] str = null;
		
		if(type==1){
			str = cx.sinaUser(name,age);
		}else if(type==2){
			str = cx.qqUesr(name,age);
		}else{
			System.out.println("其他用户");
		}
		for (String res : str) {
			System.out.println(res);
		}
	}
}
