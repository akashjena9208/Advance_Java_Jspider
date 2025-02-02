package com.jsp.servlet.request_distpact;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Demo_Servalet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int receivedid=Integer.parseInt(req.getParameter("UserID"));
		String  receivedName=req.getParameter("UserName");
		
		req.setAttribute("key1", receivedid);	//what
		req.setAttribute("key2", receivedName);	//what
		
		RequestDispatcher rd=req.getRequestDispatcher("output.jsp");	//where
		rd.forward(req, res);//transfer
		System.out.println("Back to Current Sevlet");
		
		
		
		
		
	}
	

}
