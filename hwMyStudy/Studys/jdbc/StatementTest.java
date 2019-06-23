package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StatementTest {

	public static void main(String[] args) {
		Connection con = null;
		ResultSet rs = null;
		Statement st = null; 
		/**
		 * 一.注册驱动并实例化的两种方式：
		 * 
		 * 
		 */
		//1.类装载器(常用)
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//值填数据库的驱动  不同的数据库，驱动不一样

			//2.直接实例化驱动
			/*try {
			Driver driver = new oracle.jdbc.driver.OracleDriver();
		} catch (Exception e) {

		}*/



			/**
			 * 二:建立和数据库的连接
			 */

			try {
				//第一个参数为数据库的地址
				//第二个参数为连接数据库的账号
				//第三个参数为连接数据库的密码
				con = DriverManager.getConnection("jbdc:oracle:thin:@localhost:1521:XE","le","123");




				/**
				 * 三：创建statement对象
				 */
				Scanner sc = new Scanner(System.in);
				String str = sc.next();
				
				//准备需要丢到数据库中运行的sql语句
				String sql = "select * from section where id="+str;


				st = con.createStatement();//根据之前和数据库建立起来的连接，来获取一个Statement对象

				/**
				 * 四：执行sql语句
				 */

				rs =st.executeQuery(sql);//将sql语句方法数据库中执行，放回的ResultSet为数据库返回回来的结果

				/**
				 * 五：处理结果集
				 */

				while(rs.next()){//next()方法，意思是下一条
					String id =	rs.getString("id");
					String name =rs.getString("name");

					System.out.println(id+","+name);
				}


			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally{
			/**
			 * 六:释放资源
			 */
			try {
				rs.close();
				st.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
