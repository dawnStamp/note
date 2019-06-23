package cn.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {

		Connection con = null;
		ResultSet rs = null;
		Statement st = null;
		/**
		 * 一：注册驱动并实例化的两种方式：
		 */
		//1.类装载器
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//值填数据库的驱动，不同的数据库，驱动不一样

			/*	//2.直接实例化驱动
		Driver driver = new oracle.jdbc.driver.OracleDriver();
		try {
			DriverManager.registerDriver(driver);
		} catch (SQLException e) {
			e.printStackTrace();
		}*/

			/**
			 * 二：建立和数据库的连接
			 */
			try {
				//第一个参数为数据库的地址
				//第二个参数为连接数据库的账号
				//第三个参数为连接数据库的密码
				con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","yu","abc123");

				/**
				 * 三：创建statement对象
				 */
				//准备需要丢到数据库中运行的sql语句
				String sql = "update emp set name = '张三'";

				st = con.createStatement();//根据之前和数据库建立起来的连接 ，来获取一个Statement对象

				/**
				 * 四：执行sql语句
				 */
//				rs = st.executeQuery(sql);//将sql语句放到数据库中执行，返回的ResultSet为数据库返回回来的结果
				/*while(rs.next()){//next()方法，意思是下一条
				String id = rs.getString("id");
				String name = rs.getString("name");

				System.out.println(id+","+name);
			}*/
				
				int re = st.executeUpdate(sql);//re为数据库返回回来的受影响的行数
				System.out.println(re);
				/**
				 * 五：处理结果集
				 */
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally{
			/**
			 * 六：释放资源
			 */
			try {
//				rs.close();
				st.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
