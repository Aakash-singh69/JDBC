package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CentrilizedConnection {
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/test";
		 return DriverManager.getConnection(url,"root",Password.password);
	}

}


/*Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:mysql://sql6.freemysqlhosting.net/sql6580998";
 return DriverManager.getConnection(url,"sql6580998","BbfHfDpjv9");*/