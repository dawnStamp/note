package cn.泛型.集合中使用泛型;

import java.util.Map;

import cn.集合.list.例子1.User;

public class Zzz {

	public static void zz(Map<User,User> map,User use){
//		User us = new User();
		User u = map.get(use);
		System.out.println(u.getAge());
	}
}
