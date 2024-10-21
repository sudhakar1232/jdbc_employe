package myjdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Update {

	private static Connection con;
	private static PreparedStatement pstmt;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/irctc";
		String username="root";
		String password="8919879219";
		Scanner sc = new Scanner(System.in);
		String fetchMate="select* from `customer`";
		String update="update `customer` set `address`=? where `user_id`=?";
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,username,password);
			pstmt=con.prepareStatement(update);
			System.out.println("Enter the Address ");
			String email=sc.nextLine();
			System.out.println("Enter the ID");
			int id=sc.nextInt();
			
			pstmt.setInt(2,id);
			pstmt.setString(1, email);
			int res=pstmt.executeUpdate();
			if(res!=0) {
				System.out.println("Data Updated");
			}
			else {
				System.out.println("Data is not Updated");
			}
			
			
			
			
		}
		catch (Exception e){
			e.printStackTrace();
		}


		
		

	}

}
