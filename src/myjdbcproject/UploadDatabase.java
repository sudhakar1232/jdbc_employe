package myjdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UploadDatabase {
	private static int id ,phone;
	private static String name,email,location;
	private static Connection con;
	private static String url="jdbc:mysql://localhost:3306/irctc";
	private static String username="root";
	private static String password="8919879219";
	private static String insertQuery="Insert into station value(?,?,?)";
	private static PreparedStatement pstmt;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Station_id:  ");
		id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Station_Name: ");
          name=sc.nextLine();
		System.out.println("Enter the Location: ");
        location=sc.nextLine();
		
		

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,username,password);
			pstmt=con.prepareStatement(insertQuery);
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, location);
			
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
