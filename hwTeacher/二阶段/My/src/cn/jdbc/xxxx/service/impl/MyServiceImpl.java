package cn.jdbc.xxxx.service.impl;

import cn.jdbc.xxxx.dao.MyDao;
import cn.jdbc.xxxx.dao.impl.MyDaoImpl;
import cn.jdbc.xxxx.entry.MyInfo;
import cn.jdbc.xxxx.service.MyService;

/**
 * ÒµÎñÂß¼­²ã(Service)
 */
public class MyServiceImpl implements MyService{

	@Override
	public String register(MyInfo info) {
		MyDao my = new MyDaoImpl();
		int row = my.register(info);
		if(row==0){
			return "×¢²áÊ§°Ü";
		}else{
			return "×¢²á³É¹¦";
		}
	}

	@Override
	public void login() {
		
	}

}
