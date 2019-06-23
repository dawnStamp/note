package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {

	public static void main(String[] args){
		Connection con = null;
		Statement st = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			try{
				con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","le","123");

				String sql = "insert into section(id,name) values(666,'¿Ô∆§')";

				st = con.createStatement();

				int re = st.executeUpdate(sql);
				
				System.out.println(re);


			}catch(SQLException e){
				e.printStackTrace();
			}
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}finally{
			try {
				
				st.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

