package jdbcDemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertRecordUsingPreparedStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection con=CentrilizedConnection.getConnection();
		String sqlInsert="insert into customer values(?,?,?)";
		PreparedStatement pst=con.prepareStatement(sqlInsert);
		
        pst.setString(1,"5");
        pst.setString(2,"Prince");
        pst.setString(3,"Noida");
        
        pst.executeUpdate();
        pst.clearParameters();
        con.close();
        
	}

}
