package cn.����.������ʹ�÷���;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import cn.����.list.����1.User;

//������ʹ�÷��ͣ��������Ƽ����б���Ĳ���������
public class Test {
	public static void main(String[] args) {
		
		User use = new User();
		use.setAge(1);
		use.setName("����");
		
//		User use2 = new User();
//		use.setAge(2);
//		use.setName("����");
		
//		User use3 = new User();
//		use.setAge(3);
//		use.setName("����");
//		
//		User use4 = new User();
//		use.setAge(4);
//		use.setName("����");
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
