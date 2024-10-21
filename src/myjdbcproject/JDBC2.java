
//this connection to MyConnection

package myjdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC2 {
    private static String name,email,password,address;
    private  static int id,phone;
	private static Connection con;
	
	private static String insertQuery="Insert into `customer`values(?,?,?,?,?,?)";
	private static PreparedStatement pstmt;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the userId: ");
		id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Name: ");
		name=sc.nextLine();
		System.out.println("Enter the Email: ");
		email=sc.nextLine();
		System.out.println("Enter the password: ");
		password=sc.nextLine();
		System.out.println("Enter the phone: ");
		phone=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the address: ");
		address=sc.nextLine();
		try {
			
			con=MyConnection.connect();
			
			pstmt=con.prepareStatement(insertQuery);
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, email);
			pstmt.setString(4, password);
			pstmt.setInt(5, phone);
			pstmt.setString(6, address);
			 int res=pstmt.executeUpdate();
			 if(res==0) {
				 System.out.println("Data was not inserted");
			 }
			 else {
				 System.out.println("Data inserted");
			 }
			
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			MyConnection.disconnect(con, pstmt);
		}
		

	}

}
