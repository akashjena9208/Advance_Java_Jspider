package com.jsp.jdbc.staps;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC_Statement_insert {
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
//			int rowinsert=st.executeUpdate("INSERT INTO jdbc_studentdb.student VALUES (105,'JOHN','john@gmail.com',60)");
			
			//Multipule Data
			int rowinsert=st.executeUpdate("INSERT INTO jdbc_studentdb.student VALUES (104,'Subha','subha@gmail.com',90), (105,'Disha','Disha@gmail.com',90)");

			//step 5:- Process The Result
			if(rowinsert>0)
			{
				System.out.println(rowinsert+" SucessFully Added!!!");
			}
			else
			{
				System.out.println("Data not Insert");
			}

			//Step 6
			conn.close();


		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
