package com.jsp.jdbc.prepared_st;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC_pst_insert {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		Connection  connection=null;

		try {
			//step-1:-Load and Register
			Class.forName("com.mysql.cj.jdbc.Driver");

			//step=-2:-Connection
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_studentdb?user=root&password=Akash@2002");


			//step-3  & 4:-create Statemnet												//index stratd 1..
			PreparedStatement pst=connection.prepareStatement("INSERT INTO STUDENT VALUES (?,?,?,?)");	
			System.out.println("Enter The Student Id:- ");
			pst.setInt(1, scanner.nextInt());
			System.out.println("Enter The Student Name:- ");
			pst.setString(2,scanner.next());
			System.out.println("Enter The Student Email:- ");
			pst.setString(3,scanner.next());
			System.out.println("Enter The Student Marks:- ");
			pst.setInt(4, scanner.nextInt());

			//Step 5:-
			int rowinsert=pst.executeUpdate();
			if(rowinsert>0)
			{
				System.out.println(rowinsert+" SucessFully Added!!!");
			}
			else
			{
				System.out.println("Data not Insert");
			}




		} catch (ClassNotFoundException | SQLException e) {

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
