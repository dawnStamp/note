package ��������;

public class Cx {
	
	Cz cz = new Cz();
	String[] str = null;
	
	public String[] sinaUser(String name,int age){
		String username = "�����û���"+name;
			
		str = cz.save(username, age);
		return str;
	}
	
	public String[] qqUesr(String name,int age){
		String username = "��Ѷ�û���"+name;
		
		str = cz.save(username, age);
		return str;
	}
}
