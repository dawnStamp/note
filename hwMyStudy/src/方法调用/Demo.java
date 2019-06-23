package 方法调用;

public class Demo {
	
	//对象
	/*public String name;
	int age;
	String job;


	//方法
	public void buy(){
		System.out.println(name+"成功购买商品");
	}
	
	public void readMoney(){
		System.out.println(name+"买的商品的价格为100元");
	}
	public void money(){
		System.out.println(name+"购买了价格为100元");
	}*/
	
	//人的属性
	/*String name;//姓名
	int age;// 年龄
	String job;//工作
	String sex;//性别
	String height;//升高
	String weight;//体重
	
	public void getMoney(){}
	
	
	//ATM机
	String display;//显示器
	String mainboard;//主板
	String color;//颜色
	
	//银行卡
	String background;
	String chip;//芯片*/
	
	/*public static void main(String[] args) {
		//ss();
		Demo d = new Demo();
		//d.ss();
		d.xx();
		Demo.ss();
		
	}	*/
	//静态方法
	/*public static void ss(){
		
		System.out.println("静态方法");
		
	}
	//非静态方法
	public void xx(){
		
		System.out.println("非静态方法");
		
	}*/
	
	/**
	 * 静态的东西，是和类绑定的
	 * 非静态的东西，是和对象绑定的
	 * 
	 * void 无返回值
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		Demo g = new Demo();
		g.aa();
		//Demo2.bb();
		
	}
	
	
	public void aa(){
		System.out.println("aa方法");
		Demo2.bb();
	}
	
}
