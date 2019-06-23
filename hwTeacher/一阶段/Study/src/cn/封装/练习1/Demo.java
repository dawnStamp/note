package cn.��װ.��ϰ1;

/**
 * �������OPP
 * �������(OOP)���������ԣ�
 * 		1.��װ
 * 		2.�̳�
 * 		3.��̬
 * 
 * ��װ
 * 		1.������װ��һ��Ȼ�����µ�������ʽ���ֳ���
 * 		2.��Ϣ���أ����ض����ʵ��ϸ�ڣ������ⲿֱ�ӷ��ʵ�
 * 				���������ֶ�һ���װ��һ����Ԫ�У���Ԫ�������ʽ����
 * 		3.�����ࡢ���������ԡ������Ĺ��̳�Ϊ��װ��
 * 
 * ��Ϣ������OOP����Ҫ�Ĺ���֮һ��Ҳ��ʹ�÷������η���ԭ��	
 * ��Ϣ���ص�ԭ�������
 * 		1.��ģ����κ�ʵ��ϸ�������ĸ��Ĳ���Ӱ��ʹ�ø�ģ��Ĵ���		
 * 		2.��ֹ�û������޸�����
 * 		3.ʹ��ģ������ʹ�ú�ά��
 * 
 * �������η���
 * 		1.private
 * 		2.protected
 * 		3.Ĭ��
 * 		4.public
 * 
 * �������ã�
 * 		1.��java�ļ����ű���ķźã�������ڲ����Լ�����
 * 		2.
 * 
 * �ࡢ������ȫ�ֱ���
 * 
 * ��ֻ����public��Ĭ��
 * 
 * �ֶη�װ��ʵ�֣�
 * 		1.�޸��ֶεĿɼ��������ƶ��ֶεķ���
 * 		2.Ϊÿ���ֶδ���һ�Ը�ֵ(setter)������ȡֵ(getter)���������ڹ�������Щ�ֶεķ��ʽӿ�
 * 		3.���Ǳ��빫���ײ�ʵ��ϸ�ڣ��������е��ֶζ�Ӧ����private��װ
 * 
 * this�ؼ���
 * 		�����е�ĳһ������
 * 		this.xx   ��Ϊ   �����е�xx����
 * 
 * ��Ŀ1��
 * 		age				������СӦΪ22�꣬���������Ҫ��Ĭ�ϱ����������
 * 
 */
public class Demo {
	private int age;
	private int salary;
	
/*	public int getAge() {
		return age;
	}*/
	public void setAge(int age) {
		this.age = age;
	}
	/*public int getSalary() {
		return salary;
	}*/
	public void setSalary(int salary) {
		if(age>=30&&age<50){//��������30��50��֮��
			if(salary>=8000){//�����ʴ���8000
				this.salary = salary;
			}else{
				this.salary = 8000;
			}
		}
		
		if(age>=20&&age<30){
			if(salary>=5000){
				this.salary = salary;
			}else{
				this.salary = 5000;
			}
		}
		
		if(age>=10&&age<20){
			if(salary>=3000){
				this.salary = salary;
			}else{
				this.salary = 3000;
			}
		}
	}
}
