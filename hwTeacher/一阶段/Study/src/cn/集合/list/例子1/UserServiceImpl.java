package cn.集合.list.例子1;

import java.util.ArrayList;

public class UserServiceImpl implements UserService{

	ArrayList<User> list = new ArrayList<User>();

	@Override
	public String login(String username, String password) {
		if(!list.isEmpty()){
			User uName = (User)list.get(0);
			if(username.equals(uName.getUsername()) && password.equals(uName.getPassword())){
				return "登陆成功";
			}
		}
		return "登陆失败";
	}

	@Override
	public String register(User user) {
		try{
			if(!list.isEmpty()){
				User us = (User)list.get(0);
				
				if(!user.getUsername().equals(us.getUsername())){
					list.add(user);
				}else{
					return "用户名已存在";
				}
			}else{
				list.add(user);
			}
			return "注册成功";
		}catch(Exception e){
			e.printStackTrace();
			return "注册失败";
		}
	}
}
