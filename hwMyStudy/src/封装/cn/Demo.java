package ��װ.cn;



/**�������(opp)
 * �������(oop)���������ԣ�
 * 		1.��װ
 * 		2.�̳�
 * 		3.��̬  
 * 
 * 
 * ��װ
 * 		1��������װ��һ��Ȼ�����µ�������ʽ���ֳ���
 * 		2����Ϣ���أ����ض����ʵ��ϸ�ڣ������ⲿֱ�ӷ��ʵ�
 * 		���������ֶ�һ���װ��һ����Ԫ�У���Ԫ�������ʽ����
 * 		3�������ࡢ���������ԡ������Ĺ��̳�Ϊ��װ��
 * 
 * ��Ϣ������oop����Ҫ�Ĺ���֮һ��Ҳ��ʹ�÷������η���ԭ��
 * ��Ϣ���ص�ԭ�������
 * 	  	1.��ģ����κ�ʵ��ϸ�������ĸ��Ĳ���Ӱ��ʹ�ø�ģ��Ĵ���
 * 		2.��ֹ�û������޸�����
 * 		3.ʹ��ģ��(����)����ʹ�ú�ά��
 * 
 * 
 * �������η���
 * 		1��private
 * 		2��protected
 * 		3��Ĭ��
 *		4��public
 * 
 * �������ã�
 * 		1.��java�ļ����ű���ķźã�������ڲ����Լ�����
 * 		2.
 * 
 * 
 * �������η��������Σ��ࡢ������ȫ�ֱ���
 * 
 * ��ֻ����public��Ĭ������
 * 
 * 
 * �ֶη�װ��ʵ�֣�
 * 	  1.�޸��ֶεĿɼ��������ƶ��ֶη���
 * 	  2.Ϊÿ���ֶδ���һ�Ը�ֵ(setter)������ȡֵ(getter)����,���ڹ�������Щ�ֶεķ��ʽӿ�
 *	  3.���Ǳ��빫���ײ�ʵ��ϸ�ڣ����������ֶζ�Ӧ����private��װ	
 * 
 * 
 * 	this �ؼ���
 * 		�����е�ĳһ������
 * 		this.xx(������) ��Ϊ  �����е�xx����
 * 
 * 
 * ���췽��
 * 		���췽����������ʼ��������Ϊ��������Ը����ʵĳ�ʼֵ
 * 
 * ���췽�����﷨����
 * 	1.���췽������������ͬ	
 * 	2.û�з�������
 * 	3.���췽����Ҫ��Ϊ�˸�������ʼ��
 * 
 * ���������֮���������ù��췽��
 * 
 * ps:
 * 		1.���췽�����Բ�ֹһ��
 *		2.���һ�����췽������д��ϵͳĬ����һ���޲εĹ��췽��
 *		  ���ǣ����һ���й��췽����Ĭ�ϵ��޲ι��췽����û�� 
 *		3.���췽����ȷ�����ʼ�ͳ�ʼ�����
 *
 * @author oracleOAEC
 *
 */

public class Demo {
	/*private int hello = 10;

	public int getHello() {
		return hello;
	}

	public void setHello(int hello) {
		this.hello = hello;
	}*/
	
	private String name;//����
	private int age;//����
	
	
	//���췽��
	public Demo(){
		//System.out.println("1111111");
	}
	
	public Demo(int age){
		//System.out.println("age="+age);
	}
	public Demo(String name){
		//System.out.println("name="+name);
	}
	public Demo(String name,int age){
		//System.out.println("name="+name+",age="+age);
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
	
	
}