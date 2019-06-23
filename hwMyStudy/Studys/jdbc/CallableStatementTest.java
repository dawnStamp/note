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
			Class.forName("oracle.jdbc.driver.OracleDriver");//ֵ�����ݿ������  ��ͬ�����ݿ⣬������һ��

			try {

				con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","le","123");

				String sql = "CALL reg_procedure(?,?)";	
				
				st =con.prepareCall(sql);
				st.setString(1,"java");
				st.registerOutParameter(2,java.sql.Types.VARCHAR);//���õڶ�������Ϊvarchar���͵ĳ���
				st.executeQuery();//���ô洢���̣��洢���̻Ὣ���ε�ֵ���ڵڶ�������
				
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
