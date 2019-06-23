package jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {

	private static String driver;
	private static String url;
	private static String username;
	private static String password;

	/**
	 * 获取配置文件中的信息
	 */
	static{
		//创建一个properties对象
		Properties proper = new Properties();

		//获取jdbc.properties文件
		InputStream is = ConnectionFactory.class.getResourceAsStream("jdbc.properties");

		try {
			//加载配置文件 将流中的数据存到proper对象中
			proper.load(is);
			driver = proper.getProperty("driver");
			url = proper.getProperty("url");
			username = proper.getProperty("username");
			password = proper.getProperty("password");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//获取数据库的连接
	public static Connection getConnection(){
		Connection con =null;
		try {
			//加载驱动
			Class.forName(driver);
			try {
				//获取连接
				con = DriverManager.getConnection(url,username,password);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}		
		return con;
	}
	
	//释放资源
	public static void close(ResultSet rs,PreparedStatement ps,Connection con){

		try {
			if(rs!=null){
				rs.close();
			}
			if(ps!=null){
				ps.close();
			}

			if(con!=null){
				con.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}	
}
