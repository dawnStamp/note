package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementTest {

	public static void main(String[] args) {
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement st = null; 

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//值填数据库的驱动  不同的数据库，驱动不一样

			try {

				con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","le","123");



				//String sql = "select * from section where id=? or name=?";
				
				String sql = "insert into section(id,name) values(?,?)";

				st = con.prepareStatement(sql);
				st.setString(2,"李四");
				st.setInt(1,6);
				int re = st.executeUpdate();
				System.out.println(re);
				/*st = con.prepareStatement(sql);
				st.setString(1,"1");
				st.setString(2,"徐晃");
				rs =st.executeQuery();*/


			/*	while(rs.next()){
					String id =	rs.getString("id");
					String name =rs.getString("name");
					
					System.out.println(id+","+name);
				}*/


			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally{
			try {
				//rs.close();
				st.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
