package cn.方法调用.练习;

public class UserType {

	public String[] sinaUser(String name,int age){
		String username = "新浪用户:"+name;
		
		SaveUser save = new SaveUser();
		String[] str = save.save(username, age);
		return str;
	}
	
	public String[] qqUser(String name,int age){
		String username = "腾讯用户:"+name;
		
		SaveUser save = new SaveUser();
		String[] str = save.save(username, age);
		return str;
	}
}
