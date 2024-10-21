

//Incomplete Query this SQL Program

package myjdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBC1 {
	private static Connection con;
	private static PreparedStatement pstmt;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/octjdbc";
		String username="root";
		String password="8919879219";
		String fetchSpecificEmployee="select*from employee where empid=?";
		
      try {
    	  System.out.println("Enter the empid"); 
    	  int id=new Scanner(System.in).nextInt();
    	  
		Class.forName("com.mysql.cj.jdbc.Driver");
		 con = DriverManager.getConnection(url,username,password);
		 pstmt=con.prepareStatement(fetchSpecificEmployee);
	      } 
      
      catch (Exception e) 
      {
		// TODO Auto-generated catch block
		e.printStackTrace();
	 }
	}

}
