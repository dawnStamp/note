package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FactoryTest {

	public static void main(String[] args) {
		Connection con = ConnectionFactory.getConnection();
		
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			con.setAutoCommit(false);//Ĭ��Ϊfalse,�ֶ��ύ
			ps = con.prepareStatement("insert into section(id,name) values('100','1ddd')");
			ps.executeUpdate();
			//con.rollback();//�ع�
			
			//con.commit();//�ύ
			
			/*String sql = "select * from section where id = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1,"666");
			rs =ps.executeQuery();
			while(rs.next()){
				String id = rs.getString("id");
				String name = rs.getString("name");
				System.out.println(id+","+name);
			}*/
			/*String sql = "insert into section(id,name,salary) values(aa.nextval,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1,"����");
			ps.setDouble(2,5020.54);
			ps.addBatch();//����ǰ������sql��佻��PreparedStatement
			
			ps.setString(1,"����");
			ps.setDouble(2,9527.23);
			ps.addBatch();//����ǰ������sql��佻��PreparedStatement
			
			ps.setString(1,"����");
			ps.setDouble(2,1333.33);
			ps.addBatch();//����ǰ������sql��佻��PreparedStatement
			
			ps.executeBatch();//��������¼�Ĳ�����sql�����һ�κ����ݿ⽻�������д�������ݿⲢִ��
*/			
		//	con.setAutoCommit(true);//Ĭ��Ϊtrue,�Զ��ύ
			
			

		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			ConnectionFactory.close(rs, ps, con);
		}
	}
}
