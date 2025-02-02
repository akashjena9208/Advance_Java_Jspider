package com.jsp.servlate.mobiledb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FindMobileServalte  extends GenericServlet{
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
			PreparedStatement pst = conn.prepareStatement("SELECT * FROM  mobile WHERE mobileId=?");
			pst.setInt(1, mobileId);
			
//			//Step 4:-Executed Query
//			ResultSet rSet =pst.executeQuery();
//			//Step 5:-Process the Result
//			PrintWriter pw = res.getWriter();
//			while(rSet.next())
//			{
//				pw.print("<h1> "+"Mobile Id:- "+rSet.getInt(1)+" Mobile Name:- "+rSet.getString(2)+":- Mobile Brand:- "+rSet.getString(3)+" Mobile Price :- "+rSet.getInt(4)+" </h1>");
//				System.out.println();
//			}
			
			//Step 4:-Executed Query
			ResultSet rs = pst.executeQuery();
			//Step 5:-Process the Result
			PrintWriter pw = res.getWriter();
			pw.print("<h1></h1>\n");
			while(rs.next())
			{
				int id = rs.getInt(1);
				String mobileModel = rs.getString(2);
				String mobileBrand = rs.getString(3);
				int mobilePrice =rs.getInt(4);
				
				pw.print("<h2>Mobile Id: - "+id+"</h2>");
				pw.print("<h2>Mobile Name : - "+mobileModel+"</h2>");
				pw.print("<h2>Mobile Brand : - "+mobileBrand+"</h2>");
				pw.print("<h2>Mobile Price : - "+mobilePrice+"</h2>");
			}

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
