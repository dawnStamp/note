package cn.jdbc.xxxx.service.impl;

import cn.jdbc.xxxx.dao.MyDao;
import cn.jdbc.xxxx.dao.impl.MyDaoImpl;
import cn.jdbc.xxxx.entry.MyInfo;
import cn.jdbc.xxxx.service.MyService;

/**
 * ҵ���߼���(Service)
 */
public class MyServiceImpl implements MyService{

	@Override
	public String register(MyInfo info) {
		MyDao my = new MyDaoImpl();
		int row = my.register(info);
		if(row==0){
			return "ע��ʧ��";
		}else{
			return "ע��ɹ�";
		}
	}

	@Override
	public void login() {
		
	}

}
