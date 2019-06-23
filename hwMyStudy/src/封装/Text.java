package 封装;
import java.util.Scanner;
public class Text {

	public static void main(String[] args) {
		//第一题
		/*	Demo d = new Demo();
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的姓名");
		String name = sc.next();

		d.setName(name);
		System.out.println("请输入你的年龄");
		int age = sc.nextInt();
		d.setAge(age);
		System.out.println("你的姓名是："+name+"   你的年龄是："+d.getAge()+"  (年龄低于22默认22岁)");
		*/
		
		Demo m = new Demo();//根据Demo类，创建对象，对象的名称为m
		Scanner sc = new Scanner(System.in);//创建控制台输入的对象，对象名为sc
		System.out.println("请输入你的年龄，工资");
		int age = sc.nextInt();//将控制台输入的数字存到age中
		int money = sc.nextInt();//将控制台输入的数字存到money中
		m.setAge(age);//调用setAge方法，并将age作为参数传递过去
		m.setMoney(money);//调用setMoney方法，并将money作为参数传递过去
		System.out.println(m.getMoney());
	}
}	

