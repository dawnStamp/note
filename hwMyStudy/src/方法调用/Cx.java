package 方法调用;

public class Cx {
	
	Cz cz = new Cz();
	String[] str = null;
	
	public String[] sinaUser(String name,int age){
		String username = "新浪用户："+name;
			
		str = cz.save(username, age);
		return str;
	}
	
	public String[] qqUesr(String name,int age){
		String username = "腾讯用户："+name;
		
		str = cz.save(username, age);
		return str;
	}
}
