package jdbcDemo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRecord {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection con=CentrilizedConnection.getConnection();
		Statement st=con.createStatement();
		String delete="delete from customer where id=5";
        
		int status=st.executeUpdate(delete);
		if(status>0){
			System.out.println("Row Deleted");
		}
		else {
			System.out.println("Row not Found");
		}

	}

}
