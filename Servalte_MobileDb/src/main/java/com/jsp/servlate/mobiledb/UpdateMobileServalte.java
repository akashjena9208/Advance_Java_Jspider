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

public class UpdateMobileServalte  extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		int mobileId = Integer.parseInt(req.getParameter("mobileId"));
		String mobileName = req.getParameter("mobileName");
		int mobilePrice = Integer.parseInt(req.getParameter("mobilePrice"));

		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/servlate_mobiledb?user=root&password=Akash@2002");

			PreparedStatement pst = conn.prepareStatement("UPDATE mobile SET mobileName=? ,mobilePrice=? WHERE mobileId = ?");

			pst.setString(1, mobileName);
			pst.setInt(2, mobilePrice);
			pst.setInt(3, mobileId);

			int rowsUpdated = pst.executeUpdate();

			PrintWriter pw = res.getWriter();
			if(rowsUpdated>0)
				pw.print("<h1> "+rowsUpdated+" data updated  Sucesfull!! </h1>");
			else
				pw.print("<h1>data not inserted !!</h1>");


		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {

			if(conn!=null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}

}





