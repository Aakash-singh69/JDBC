package jdbcDemo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection con=CentrilizedConnection.getConnection();
		Statement st=con.createStatement();
		boolean check;
		
		//Create Table
		String createTable="create table Bookstore (id int, bookName text)";
		check=st.execute(createTable);
		System.out.println("Table Created");
		System.out.println(check);
		
		//Drop Table
		String dropTable="drop table Bookstore";
		check=st.execute(dropTable);
		System.out.println(check);
		System.out.println("Table Droped");
		
		

	}

}
