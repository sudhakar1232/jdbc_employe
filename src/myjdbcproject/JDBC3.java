package myjdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class JDBC3 {

	private static Connection con;
	private static Statement stmt;
	private static ResultSet result;
	private static ResultSetMetaData rsmd;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/irctc";
		String username="root";
		String password="8919879219";
		String fetchMate="select* from `station`";
		
		try {
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//established Connection
			con=DriverManager.getConnection(url,username,password);
			stmt=con.createStatement();
			result=stmt.executeQuery(fetchMate);
			
			
			
			while(result.next())
			{
				System.out.println(result.getInt(1)+" "+result.getString(2)+" "+result.getString(3));
			}
			
			
			/*rsmd=result.getMetaData();
			int columnCount=rsmd.getColumnCount();
			for(int i=1;i<=columnCount;i++) {
				
				System.out.println("column "+i);
				System.out.println("column Name "+rsmd.getColumnName(i));
				System.out.println("column Type "+rsmd.getColumnType(i));
				System.out.println("column TypeName "+rsmd.getColumnTypeName(i));
				System.out.println();
			}*/
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
