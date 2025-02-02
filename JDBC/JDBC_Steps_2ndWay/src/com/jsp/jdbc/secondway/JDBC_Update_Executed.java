package com.jsp.jdbc.secondway;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Update_Executed {
	public static void main(String[] args) {
		Connection connection=null; //bcz of final bolock used 

		try {
			//Steps 1-Load and register
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Steps 2 :- Establis the conection
			 connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_studentdb?user=root&password=Akash@2002");

			//Steps 3:- create statement
			Statement statement= connection.createStatement();

			//Steps 4-exicted the query
			boolean res= statement.execute("UPDATE  STUDENT  SET studentEmail='akashjena@gmail.com' WHERE (studentId=200)");

			
			
			//Steps 5 :- PROCESS THE RESULT
			System.out.println("Return type Checked of execute method:- "+res);

			if(res==false) {
				System.out.println("data insert !! ");
				System.out.println("but one disadvantage it is not count");
			}
			else {
				System.out.println("Data not insert");
			}


		} 
		catch (ClassNotFoundException | SQLException  e) 
		{

			e.printStackTrace();
		} 
		
		finally {
			//step:6 connection closed
			if(connection!=null)
			{
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			
			
		}

	}
}
