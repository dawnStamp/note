package cn.���췽��;

/**
 * ���췽��
 *			���췽����������ʼ��������Ϊ��������Ը����ʵĳ�ʼֵ
 *			
 *���췽�����﷨����
 *			1.���췽������������ͬ
 *			2.û�з�������
 *			3.���췽����Ҫ��Ϊ�˸�������ʼ��
 *
 *���������֮���������ù��췽��
 *
 *ps:
 *			1.���췽�����Բ�ֹһ��
 *			2.���һ�����췽������д��ϵͳĬ����һ���޲εĹ��췽��
 *				���ǣ����һ���й��췽����Ĭ�ϵ��޲ι��췽����û��
 *			3.���췽����ȷ�����ʼ�ͳ�ʼ�����
 *
 *		
 *		
 */
public class Demo {

	private String name;//����
	private int age;//����
	

	/**
	 * ���췽��
	 */
/*	public Demo(){
	}
	*/
	
	public Demo(String name,int age){
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
