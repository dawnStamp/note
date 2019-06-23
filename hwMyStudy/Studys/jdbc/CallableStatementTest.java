package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallableStatementTest {

	public static void main(String[] args) {
		Connection con = null;
		CallableStatement st = null; 

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//值填数据库的驱动  不同的数据库，驱动不一样

			try {

				con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","le","123");

				String sql = "CALL reg_procedure(?,?)";	
				
				st =con.prepareCall(sql);
				st.setString(1,"java");
				st.registerOutParameter(2,java.sql.Types.VARCHAR);//设置第二个？号为varchar类型的出参
				st.executeQuery();//调用存储过程，存储过程会将出参的值填在第二个？中
				
				String name = st.getString(2);
				System.out.println(name);

			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
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
