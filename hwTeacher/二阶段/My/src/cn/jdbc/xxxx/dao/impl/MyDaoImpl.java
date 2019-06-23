package cn.jdbc.xxxx.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import cn.jdbc.xxxx.dao.MyDao;
import cn.jdbc.xxxx.entry.MyInfo;
import cn.jdbc.xxxx.util.ConnectionFactory;

/**
 * Êý¾Ý·ÃÎÊ²ã
 */
public class MyDaoImpl implements MyDao{

	@Override
	public int register(MyInfo info) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement ps = null;
		int row = 0;
		try {
			String sql = "insert into emp(username,password,name) values(?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, info.getUsername());
			ps.setString(2, info.getPassword());
			ps.setString(3, info.getName());
			row = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return row;
	}

}
