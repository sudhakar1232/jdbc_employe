package myjdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Delete {

	private static Connection con;
	private static PreparedStatement pstmt;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/irctc";
		String username="root";
		String password="8919879219";
		Scanner sc = new Scanner(System.in);
		String fetchMate="select* from `station`";
		String update="update `station` set `Station_name`=? where `Station_ID`=?";
		String delete="delete from `station` where `Station_ID`=?";
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,username,password);
			pstmt=con.prepareStatement(delete);
			System.out.println("Enter the id ");
			int id=sc.nextInt();
			pstmt.setInt(1, id);
			int res=pstmt.executeUpdate();
			if(res!=0) {
				System.out.println("Success");
			}
			else {
				System.out.println("Failure");
			}
			
	}
		catch (Exception e){
			e.printStackTrace();
		}
			
		}

}
