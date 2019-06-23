package 封装.cn;

public class Text {

	public static void main(String[] args) {
		/*Demo d = new Demo();
		//get方法是取值      set方法是赋值
		int hello =d.getHello();
		System.out.println(hello);
		d.setHello(7);
		int hello =d.getHello();
		System.out.println(hello);*/
		
		Demo de = new Demo("闪现",4);//根据Demo类，创建一个叫做de的对象
		System.out.println(de.getName()+","+de.getAge());
	
	}
}
