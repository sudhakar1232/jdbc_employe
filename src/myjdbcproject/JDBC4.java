package myjdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBC4 {
	
	
	
	private static int id ,phone;
	private static String name,email,passwor,address;
	private static Connection con;
	private static String url="jdbc:mysql://localhost:3306/irctc";
	private static String username="root";
	private static String password="8919879219";
	private static String insertQuery="Insert into customer value(?,?,?,?,?,?)";
	private static PreparedStatement pstmt;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the user_id:  ");
		id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Name: ");
          name=sc.nextLine();
		System.out.println("Enter the Email: ");
        email=sc.nextLine();
		System.out.println("Enter the Password");
        passwor=sc.nextLine();
        System.out.println("Enter the phone: ");
        phone=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the address: ");
        address=sc.nextLine();
		

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,username,password);
			pstmt=con.prepareStatement(insertQuery);
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, email);
			pstmt.setString(4, passwor);
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
		
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
