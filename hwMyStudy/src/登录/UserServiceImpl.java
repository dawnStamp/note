package ��¼;

import java.util.ArrayList;

public class UserServiceImpl implements UserService{

	ArrayList list = new ArrayList();

	public UserServiceImpl(){
		list.add("abc");
		list.add("123");
	}

	@Override
	public String login(String username, String password) {
		String uName = (String)list.get(0);
		String pWord = (String)list.get(1);

		if(username.equals(uName) && password.equals(pWord)){
			return "��½�ɹ�";
		}
		return "��½ʧ��";
	}

	@Override
	public String register(User user) {
		try{
			if(!user.getUsername().equals(list.get(0))){
				list.add(user.getUsername());
				list.add(user.getPassword());
				list.add(user.getName());
				list.add(user.getAge());
				list.add(user.getSex());
				return "ע��ɹ�";
			}else{
				return "�û����Ѵ���";
			}
		}catch(Exception e){
			return "ע��ʧ��";
		}

	}

}
