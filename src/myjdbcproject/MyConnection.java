

 //This connection is JDBC2


package myjdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MyConnection 
{
	private static String url="jdbc:mysql://localhost:3306/irctc";
	private static String username="root";
	private static String password="8919879219";
	 private static Connection con;
	public static Connection connect()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,username,password);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return con;
	}
   public static void disconnect(Connection con, PreparedStatement pstmt) 
   {
	   try 
	      {
			
			 if(pstmt!=null) {
				pstmt.close();
				 System.out.println("pstmt closed");
			 }
			 
		  }
		 catch (SQLException e) {
			e.printStackTrace();
		}
		
		 
		 try {
			
			 if(con!=null) {
				 con.close();
					System.out.println("Connection closed");
			 }
		} 
		 catch (SQLException e) {
			e.printStackTrace();
		}
   }
	

}
