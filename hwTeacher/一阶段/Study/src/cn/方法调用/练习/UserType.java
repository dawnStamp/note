package cn.��������.��ϰ;

public class UserType {

	public String[] sinaUser(String name,int age){
		String username = "�����û�:"+name;
		
		SaveUser save = new SaveUser();
		String[] str = save.save(username, age);
		return str;
	}
	
	public String[] qqUser(String name,int age){
		String username = "��Ѷ�û�:"+name;
		
		SaveUser save = new SaveUser();
		String[] str = save.save(username, age);
		return str;
	}
}
