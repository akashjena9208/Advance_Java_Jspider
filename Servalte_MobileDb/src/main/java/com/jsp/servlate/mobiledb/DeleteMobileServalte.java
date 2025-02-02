package com.jsp.servlate.mobiledb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DeleteMobileServalte  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int mobileId = Integer.parseInt(req.getParameter("mobileId"));	
		Connection conn=null;

		try {
			//Step 1:-Load & Register
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Step 2:-Connection
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/servlate_mobiledb?user=root&password=Akash@2002");
			//Step 3:-Create Statement
			PreparedStatement pst = conn.prepareStatement("DELETE FROM mobile WHERE mobileId=?");
			pst.setInt(1, mobileId);

			
			int rowsDeleted = pst.executeUpdate();
			
			PrintWriter pw = res.getWriter();
			if(rowsDeleted>0)
				pw.print("<h1> "+rowsDeleted+" data deleted SucessFull !! </h1>");
			else
				pw.print("<h1>data not inserted !!</h1>");


		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//Step 6:-Close
		finally {

			if(conn!=null)
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

}
