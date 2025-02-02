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

public class AddMobileServalte extends  GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int mobileId = Integer.parseInt(req.getParameter("mobileId"));
		String mobileName = req.getParameter("mobileName");
		String mobileBrand = req.getParameter("mobileBrand");
		int mobilePrice = Integer.parseInt(req.getParameter("mobilePrice"));

		//		PrintWriter pw= res.getWriter();
		//		pw.print("<h1> Welcome Home "+mobileId+""+mobileName+" "+mobileBrand +""+mobilePrice+" </h>");
		Connection conn=null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/servlate_mobiledb?user=root&password=Akash@2002");

			PreparedStatement pst = conn.prepareStatement("INSERT INTO mobile VALUES(?,?,?,?)");
			pst.setInt(1, mobileId);
			pst.setString(2, mobileName);
			pst.setString(3, mobileBrand);
			pst.setInt(4, mobilePrice);

			int rowsInserted = pst.executeUpdate();

			PrintWriter pw = res.getWriter();
			if(rowsInserted>0)
				pw.print("<h1> "+rowsInserted+" data inserted !! </h1>");
			else
				pw.print("<h1>data not inserted !!</h1>");



		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


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
