package com.jsp.jdbc.secondway;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Fatch_Executed {
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
			boolean res= statement.execute("Select * from  student");
			ResultSet result =statement.getResultSet();

			//Steps 5 :- PROCESS THE RESULT
			System.out.println("Return type Checked of execute method:- "+res);
			
			while(result.next())
			{
				System.out.println(result.getInt(1));
				System.out.println(result.getString(2));
				System.out.println(result.getString(3));
				System.out.println(result.getInt(4));
				System.out.println("------------------------");
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
