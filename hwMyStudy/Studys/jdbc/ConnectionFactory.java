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
	 * ��ȡ�����ļ��е���Ϣ
	 */
	static{
		//����һ��properties����
		Properties proper = new Properties();

		//��ȡjdbc.properties�ļ�
		InputStream is = ConnectionFactory.class.getResourceAsStream("jdbc.properties");

		try {
			//���������ļ� �����е����ݴ浽proper������
			proper.load(is);
			driver = proper.getProperty("driver");
			url = proper.getProperty("url");
			username = proper.getProperty("username");
			password = proper.getProperty("password");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//��ȡ���ݿ������
	public static Connection getConnection(){
		Connection con =null;
		try {
			//��������
			Class.forName(driver);
			try {
				//��ȡ����
				con = DriverManager.getConnection(url,username,password);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}		
		return con;
	}
	
	//�ͷ���Դ
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
