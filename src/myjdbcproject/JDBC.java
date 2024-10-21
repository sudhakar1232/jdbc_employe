package myjdbcproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;

public class JDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con;
		Statement stmt;
		ResultSet resultSet;
		String url="jdbc:mysql://localhost:3306/irctc";
		String username="root";
		String password="8919879219";
		try {
			//load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Established connection
				con=DriverManager.getConnection(url,username,password);
				//create the SQL
				stmt=con.createStatement();
				//Execute SQL Statement
// insert of the Customer of ExecuteQuery
		//resultSet=stmt.executeQuery("select*from Customer");
				
//insert of the Train of ExecuteQuery			
		//resultSet=stmt.executeQuery("select*from train");
				
//		insert of the Route of ExecuteQuery
		//resultSet=stmt.executeQuery("select*from route");
				
// insert of the Station of ExecuteQuery
	  //resultSet=stmt.executeQuery("select*from station");
	
// insert the Schedule of ExecuteQuery
	//resultSet=stmt.executeQuery("select*from schedule");
				
//insert the Booking of ExecuteQuery
	//resultSet=stmt.executeQuery("select*from booking");
				
//insert the Seat of ExecuteQuery
				resultSet=stmt.executeQuery("select*from seat");
				//process the Result
				while(resultSet.next()) {
					
 //Customer information
					/*System.out.println(resultSet.getInt(1)+" "+
							resultSet.getString(2)+" "+
							resultSet.getString(3)+" "+
							resultSet.getString(4)+" "+
							resultSet.getLong(5)+" "+
							resultSet.getString(6));*/
					
//Train table Information
					/*System.out.println(resultSet.getInt(1)+" "+
			           resultSet.getInt(2)+" "+
			          resultSet.getString(3)+" "+
			           resultSet.getInt(4)+" "+
			          resultSet.getInt(5));*/
		
					
//Route table Information
			/*System.out.println(resultSet.getInt(1)+" "+
                     resultSet.getInt(2)+" "+
				     resultSet.getInt(3)+" "+
			         resultSet.getBigDecimal(4));*/
					
//Station table Information
					/*System.out.println(resultSet.getInt(1)+" "+
							resultSet.getString(2)+" "+
							resultSet.getString(3));*/
								         
//Schedule table Information
		/*System.out.println(
				resultSet.getInt(1)+" "+
		        resultSet.getInt(2)+" "+
				resultSet.getTime(3)+" "+
		        resultSet.getTime(4)+" "+
				resultSet.getString(5));*/
				
//Booking table Information
			/*	System.out.println(
				resultSet.getInt(1)+" "+
				resultSet.getInt(2)+" "+
				resultSet.getInt(3)+" "+
				resultSet.getInt(4)+" "+
				resultSet.getString(5)+" "+
				resultSet.getDate(6)+" "+
				resultSet.getBigDecimal(7));  */
						
//Seat Table Information
				System.out.println(
				  resultSet.getInt(1)+" "+
				  resultSet.getInt(2)+" "+
				  resultSet.getString(3)+" "+
				  resultSet.getString(4)+" "+
				  resultSet.getString(5));
							
				}
		     }
			catch (SQLException e) 
		     {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 catch (ClassNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	}


