package com.jsp.jdbc.staps;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Statement_Delete {
	public static void main(String[] args) {
		try {
			//Step 1:-Load and Register
			Driver driver= new com.mysql.cj.jdbc.Driver();	//Load
			DriverManager.registerDriver(driver);		//Register

			//Step:-2:-Establish Relation

			Connection  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "Akash@2002");

			//Step 3:- Create Statement
			Statement st=	conn.createStatement();	

			//Step 4:- Executed the Query
			int rowupdate=st.executeUpdate("DELETE  from  jdbc_studentdb.student WHERE studentId in(103,104,105) ");
		

			//step 5:- Process The Result
			if(rowupdate>0)
			{
				System.out.println(rowupdate+" SucessFully Update!!!");
			}
			else
			{
				System.out.println("Update Uncessfull ");
			}

			//Step 6
			conn.close();


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
