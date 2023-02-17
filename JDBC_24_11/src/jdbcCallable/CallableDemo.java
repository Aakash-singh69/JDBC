package jdbcCallable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import jdbcDemo.CentrilizedConnection;

public class CallableDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection con=CentrilizedConnection.getConnection();
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter student id: ");
		String id=sc.next();
		CallableStatement callable=con.prepareCall("{call checkStudentExist(?,?)}");
		callable.setString(1,id);
		
		callable.registerOutParameter(2, java.sql.Types.VARCHAR);
		callable.executeUpdate();
		
		String holder=callable.getString(2);
		System.out.println("Name of Student: "+holder);
		
		
		

	}

}

