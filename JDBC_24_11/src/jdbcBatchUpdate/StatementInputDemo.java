package jdbcBatchUpdate;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jdbcDemo.CentrilizedConnection;

public class StatementInputDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection con=CentrilizedConnection.getConnection();
		Statement st= con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		
		ResultSet rs=st.executeQuery("select * from students");
		//Traverse in Forward Order
		while(rs.next()) {
			System.out.println(rs.getInt(1) +"  "+ rs.getString(2) +"    "+ rs.getString(3));
		}
		
		//Traverse in fReverse Order
		System.out.println("*********************");
		while(rs.previous()) {
			System.out.println(rs.getInt(1) +"  "+ rs.getString(2) +"    "+ rs.getString(3));
		}
		
		
		System.out.println(rs.absolute(6));// Return True or False

	}

}
