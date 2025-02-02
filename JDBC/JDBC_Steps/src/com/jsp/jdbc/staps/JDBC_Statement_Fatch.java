package com.jsp.jdbc.staps;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC_Statement_Fatch {
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
			ResultSet res=	st.executeQuery("SELECT * FROM jdbc_studentdb.student");

			//only allignment propesed
			System.out.println("Student Id\tStudent Name\tStudent Email\tstudent Marks");
			//step 5:- Process The Result
			while(res.next())
			{
				//getString and getint Dependes on Sql Table Values studentId,studentName,studentValues
				//either uesd coulumn index like 1,2,3.. or Coulumn Name
				System.out.print(res.getString("studentId")+"\t\t");
				System.out.print(res.getString(2)+"\t\t");
				System.out.print(res.getString("studentEmail")+"\t\t");
				System.out.print(res.getInt(4)+"\t\t");
				System.out.println();
			}

			//Step 6
			conn.close();


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
