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
				Scanner sc = new Scanner(System.in);
				String str = sc.next();
				
				//׼����Ҫ�������ݿ������е�sql���
				String sql = "select * from section where id="+str;


				st = con.createStatement();//����֮ǰ�����ݿ⽨�����������ӣ�����ȡһ��Statement����

				/**
				 * �ģ�ִ��sql���
				 */

				rs =st.executeQuery(sql);//��sql��䷽�����ݿ���ִ�У��Żص�ResultSetΪ���ݿⷵ�ػ����Ľ��

				/**
				 * �壺��������
				 */

				while(rs.next()){//next()��������˼����һ��
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
			 * ��:�ͷ���Դ
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
