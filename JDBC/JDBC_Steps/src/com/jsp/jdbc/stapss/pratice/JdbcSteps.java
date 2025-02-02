package com.jsp.jdbc.stapss.pratice;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcSteps 
{
	public static void main(String[] args) {

		try {
			//load and register
			//			Driver driver=new com.mysql.cj.jdbc.Driver();
			//			DriverManager.registerDriver(driver);
			
//			Class.forName(null)

			//establish the connection
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "Akash@2002");

			//creat statement
			connection.createStatement();

			


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}




/*class preant java lang package
 * forname is static method it used to load  the  file  ,it accept one arugrument in string format that is fully qualified name
 * com.mysql.cj.jdbc.Driver register it selef bcz it  preasnt static block
 * 
 * ..........................
 * jdbc_studentdb it is resources path
 * user=root&pw=quwery parametra ,key & value pair
 * executed() i can not count the  draw back is i can not count 4 row effecterd 
 * */










