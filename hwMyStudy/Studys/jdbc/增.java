package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class �� {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null; 
		/**
		 * һ.ע��������ʵ���������ַ�ʽ��
		 * 
		 * 
		 */
		//1.��װ����(����)
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//ֵ�����ݿ������  ��ͬ�����ݿ⣬������һ��

			//2.ֱ��ʵ��������
			/*try {
			Driver driver = new oracle.jdbc.driver.OracleDriver();
		} catch (Exception e) {

		}*/



			/**
			 * ��:���������ݿ������
			 */

			try {
				//��һ������Ϊ���ݿ�ĵ�ַ
				//�ڶ�������Ϊ�������ݿ���˺�
				//����������Ϊ�������ݿ������
				con = DriverManager.getConnection("jbdc:oracle:thin:@localhost:1521:XE","le","123");




				/**
				 * ��������statement����
				 */
				//׼����Ҫ�������ݿ������е�sql���

				String sql = "insert into section(id,name) values(777,'���')";

				st = con.createStatement();//����֮ǰ�����ݿ⽨�����������ӣ�����ȡһ��Statement����

				/**
				 * �ģ�ִ��sql���
				 */


				int re = st.executeUpdate(sql);
				System.out.println(re);
				/**
				 * �壺��������
				 */

			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally{
			/**
			 * ��:�ͷ���Դ
			 */
			try {
				st.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
