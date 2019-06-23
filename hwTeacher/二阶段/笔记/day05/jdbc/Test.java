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
		 * һ��ע��������ʵ���������ַ�ʽ��
		 */
		//1.��װ����
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//ֵ�����ݿ����������ͬ�����ݿ⣬������һ��

			/*	//2.ֱ��ʵ��������
		Driver driver = new oracle.jdbc.driver.OracleDriver();
		try {
			DriverManager.registerDriver(driver);
		} catch (SQLException e) {
			e.printStackTrace();
		}*/

			/**
			 * �������������ݿ������
			 */
			try {
				//��һ������Ϊ���ݿ�ĵ�ַ
				//�ڶ�������Ϊ�������ݿ���˺�
				//����������Ϊ�������ݿ������
				con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","yu","abc123");

				/**
				 * ��������statement����
				 */
				//׼����Ҫ�������ݿ������е�sql���
				String sql = "update emp set name = '����'";

				st = con.createStatement();//����֮ǰ�����ݿ⽨������������ ������ȡһ��Statement����

				/**
				 * �ģ�ִ��sql���
				 */
//				rs = st.executeQuery(sql);//��sql���ŵ����ݿ���ִ�У����ص�ResultSetΪ���ݿⷵ�ػ����Ľ��
				/*while(rs.next()){//next()��������˼����һ��
				String id = rs.getString("id");
				String name = rs.getString("name");

				System.out.println(id+","+name);
			}*/
				
				int re = st.executeUpdate(sql);//reΪ���ݿⷵ�ػ�������Ӱ�������
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
			 * �����ͷ���Դ
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
