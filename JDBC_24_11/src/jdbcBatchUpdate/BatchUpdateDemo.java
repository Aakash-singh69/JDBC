package jdbcBatchUpdate;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jdbcDemo.CentrilizedConnection;

public class BatchUpdateDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection con=CentrilizedConnection.getConnection();
		String data="Insert into students(studentid,studentName,city) values(?,?,?)";
		PreparedStatement pst=con.prepareStatement(data);
		
		con.setAutoCommit(false);
		
		pst.setString(1, "9");
		pst.setString(2,"Rahul");
		pst.setString(3,"Pune");
		pst.addBatch();

		pst.setString(1,"10");
		pst.setString(2,"Neha");
		pst.setString(3,"Bangalore");
		pst.addBatch();
		
		pst.executeBatch();
		System.out.println("Record added successfully...");
		con.commit();
	}

}
