package cn.泛型.集合中使用泛型;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import cn.集合.list.例子1.User;

//集合中使用泛型，就是限制集合中保存的参数的类型
public class Test {
	public static void main(String[] args) {
		
		User use = new User();
		use.setAge(1);
		use.setName("张三");
		
//		User use2 = new User();
//		use.setAge(2);
//		use.setName("张三");
		
//		User use3 = new User();
//		use.setAge(3);
//		use.setName("张三");
//		
//		User use4 = new User();
//		use.setAge(4);
//		use.setName("张三");
	/*	
		List<User> list = new ArrayList<User>();
		list.add(use);
		
		Set<User> set = new HashSet<User>();*/
		
		Map<User,User> map = new HashMap<User,User>();
		map.put(use, use);
//		map.put(use2, use2);
//		map.put(use3, use3);
//		map.put(use4, use4);
		
		Zzz.zz(map,use);
		
	}
}
