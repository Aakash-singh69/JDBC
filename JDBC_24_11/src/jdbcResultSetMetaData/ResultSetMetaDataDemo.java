package jdbcResultSetMetaData;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import jdbcDemo.CentrilizedConnection;

public class ResultSetMetaDataDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection con=CentrilizedConnection.getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("Select * from students");
		ResultSetMetaData rsMetaData= rs.getMetaData();
		
		int colm=rsMetaData.getColumnCount();
		System.out.println(colm);
		
		System.out.println();
		for(int i=1;i<=colm;i++) {
			System.out.println(rsMetaData.getColumnName(i)+"  "+rsMetaData.getColumnTypeName(i));
		}
		
		DatabaseMetaData meta=con.getMetaData();
		System.out.println(meta.getDriverMajorVersion());
		
		ResultSet rs1=meta.getCatalogs();
		while(rs1.next()) {
			System.out.println(rs1.getString(1));
		}

	}

}
