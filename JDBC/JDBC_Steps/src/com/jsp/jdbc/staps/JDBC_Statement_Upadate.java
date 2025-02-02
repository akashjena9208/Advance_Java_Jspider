package com.jsp.jdbc.staps;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Statement_Upadate {
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
			int rowupdate=st.executeUpdate("Update jdbc_studentdb.student SET  studentEmail='akashjena@gmail.com' WHERE (studentId=101)");
		

			//step 5:- Process The Result
			if(rowupdate>0)
			{
				System.out.println(rowupdate+" SucessFully Update!!!");
			}
			else
			{
				System.out.println("Update UncessFull Pls Again Try!!!");
			}

			//Step 6
			conn.close();


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
