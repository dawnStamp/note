package cn.����.list.����1;

import java.util.ArrayList;

public class UserServiceImpl implements UserService{

	ArrayList<User> list = new ArrayList<User>();

	@Override
	public String login(String username, String password) {
		if(!list.isEmpty()){
			User uName = (User)list.get(0);
			if(username.equals(uName.getUsername()) && password.equals(uName.getPassword())){
				return "��½�ɹ�";
			}
		}
		return "��½ʧ��";
	}

	@Override
	public String register(User user) {
		try{
			if(!list.isEmpty()){
				User us = (User)list.get(0);
				
				if(!user.getUsername().equals(us.getUsername())){
					list.add(user);
				}else{
					return "�û����Ѵ���";
				}
			}else{
				list.add(user);
			}
			return "ע��ɹ�";
		}catch(Exception e){
			e.printStackTrace();
			return "ע��ʧ��";
		}
	}
}
