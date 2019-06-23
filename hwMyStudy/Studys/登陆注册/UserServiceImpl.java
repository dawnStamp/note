package µÇÂ½×¢²á;

import java.util.ArrayList;

public class UserServiceImpl implements UserService{

	ArrayList list = new ArrayList();

	@Override
	public String login(String username, String password) {
		if(!list.isEmpty()){
			User uName = (User)list.get(0);
			if(username.equals(uName.getUsername()) && password.equals(uName.getPassword())){
				return "µÇÂ½³É¹¦";
			}
		}
		return "µÇÂ½Ê§°Ü";
		
		
	}

	@Override
	public String register(User user) {
		try{
			if(!list.isEmpty()){
				User us = (User)list.get(0);
				System.out.println(us.getUsername());

				if(!user.getUsername().equals(us.getUsername())){
					list.add(user);
				}else{
					return "ÓÃ»§ÃûÒÑ´æÔÚ";
				}
			}else{
				list.add(user);
			}
			return "×¢²á³É¹¦";
		}catch(Exception e){
			e.printStackTrace();
			return "×¢²áÊ§°Ü";
		}
	}
}
