package cn.�̳�;

/**
 *  �̳���Ҫ���ϵĹ�ϵ��
 *  			is-a
 *  			��������������
 *  			�����ͨ�ø�����
 *  
 *  �̳б����˼����ǻ����Ѵ��ڵ����������µ���
 *  
 *  super�ؼ��֣�
 *  		super��this����
 *  			this�������е�ĳһ��
 *  			super�������е�ĳһ��
 *  
 *  			super.������			���ø����ĳһ������
 *  			super.������()       ���ø����ĳһ������
 *  			super()						���ø���Ĺ��췽��
 *  
 *  ps:
 *  			1.private���εĲ��ᱻ�̳�
 *  			2.static�����в���ʹ��this��super
 *  			3.���췽�����ᱻ�̳�
 *  			4.����Ĺ��췽���У�ͨ��super�ؼ��ֵ��ø���Ĺ��췽��
 *  						��Ҫ��super(xx,xx,xx)������ǰ��
 *  
 *  ������д(override)
 *  			������д��ָ������Ը�����Ҫ�ԴӸ���̳����ķ������и�д���Ƕ�̬���Ƶ�ǰ��
 *  
 *  ps:
 *  			1.��д��������ͱ���д����������ͬ�ķ������ơ������б�ͷ���ֵ
 *  			2.��д��������ʹ�ñȱ���д�������ϸ�ķ���Ȩ��
 *  			3.�����е�˽�з������ܱ���д�����췽�����ܱ���д
 *  			4.��������д�ķ����п���ʹ��super.������()�������ø���ķ���
 *  
 *  final�ؼ���
 *  			1.final�����������α�������������
 *  			2.���α���������������ͳ��˳���
 *  			3.���η��������������ܱ���д
 *  			4.�����࣬�����಻�ܱ��̳�
 *  
 *  Object��������ĸ��࣬�����඼ֱ�ӻ��Ӽ̳���Object,����
 */
public class Animal{

	double height;//����
	private String name;//����
	private int age;//����

	public Animal(){
		
	}
	public Animal(double height,String name,int age){
		this.height = height;
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	//�Զ���
	public void eat(){
		System.out.println("�����ڳԶ���");
	}

	//��è��
	public void run(){
		System.out.println("���ﱼ��������");
	}
}
