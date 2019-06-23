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
			con.setAutoCommit(false);//默认为false,手动提交
			ps = con.prepareStatement("insert into section(id,name) values('100','1ddd')");
			ps.executeUpdate();
			//con.rollback();//回滚
			
			//con.commit();//提交
			
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
			ps.setString(1,"张三");
			ps.setDouble(2,5020.54);
			ps.addBatch();//将当前参数和sql语句交给PreparedStatement
			
			ps.setString(1,"李四");
			ps.setDouble(2,9527.23);
			ps.addBatch();//将当前参数和sql语句交给PreparedStatement
			
			ps.setString(1,"王五");
			ps.setDouble(2,1333.33);
			ps.addBatch();//将当前参数和sql语句交给PreparedStatement
			
			ps.executeBatch();//将多条记录的参数和sql语句再一次和数据库交互过程中传输给数据库并执行
*/			
		//	con.setAutoCommit(true);//默认为true,自动提交
			
			

		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			ConnectionFactory.close(rs, ps, con);
		}
	}
}
