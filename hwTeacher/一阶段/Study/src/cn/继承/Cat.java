package cn.�̳�;

public class Cat extends Animal{
	String huxu;//����
	String eyes;//�۾�
	
	
	public Cat(){
		
	}
	public Cat(double height, String name, int age,String huxu,String eyes) {
		super(height, name, age);//���ø���Ĺ��췽��
		this.huxu = huxu;
		this.eyes = eyes;
	}
	//��è��
	public void maobu(){
		
//		System.out.println(this.i);//�����е�i����
//		System.out.println(super.i);//�����е�i����
		System.out.println("è������è��");
		this.run();
		super.run();
	}
	
	
	public void run(){
		System.out.println("è������Χǽ");
	}
	

	public void eat() {
		super.eat();
	}
	
	@Override
	public String toString() {
		return "Cat [huxu=" + huxu + ", eyes=" + eyes + "]";
	}
}
