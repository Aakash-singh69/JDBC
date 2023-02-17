package jdbcDemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecord {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con=CentrilizedConnection.getConnection();
		System.out.println("Connection Established!!");
		
		Statement st=con.createStatement();
		
		String sqlInsert="insert into customer values(5,'Soith','Delhi')";
		int rowAffected=st.executeUpdate(sqlInsert);
		if(rowAffected>0) {
			System.out.println("Records Inserted Successfully");
		}
		else {
			System.out.println("Record not Inserted");
		}
		
      
		ResultSet rs= st.executeQuery("select * from customer");
			
			while(rs.next()) {
				System.out.println(rs.getInt(1) + "   " + rs.getString(2)+ "   " + rs.getString(3));
			}
		

	}

}
