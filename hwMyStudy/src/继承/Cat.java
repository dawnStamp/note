package �̳�;

public class Cat extends Animal{

	String huxu;//����
	String eyes;//�۾�
	public Cat(double height, String name, int age,String huxu,String eyes) {
		super(height, name, age);//���ø���Ĺ��췽��
		this.huxu = huxu;
		this.eyes = eyes;
	}
	int i = 20;
	
	
	//��è��
	public void maobu(){
		//System.out.println(this.i);�����е�i����
		//System.out.println(super.i);�����е�i����
		System.out.println("è������è��");
		 this.run();
		 super.run();
	}
	public void run(){
		System.out.println("è����Χǽ");
	}
	@Override
	public String toString() {
		return "Cat [huxu=" + huxu + ", eyes=" + eyes + ", i=" + i + "]";
	}
	@Override
	public void eat() {
		System.out.println("è����");
	}
}
