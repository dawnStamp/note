package cn.��������.��ϰ;


public class SaveUser {

	public String[] save(String name,int age){
		String[] arr = new String[2];
		
		arr[0] = name;
		
		//�ַ������κζ�����ӣ��õ��Ķ���һ���ַ���
		arr[1] =age+"";
//		arr[1] =String.valueOf(age);
		
		
		
		return arr;
	}
}
