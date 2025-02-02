package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServaleDemo  extends  GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String name=req.getParameter("n1");
		
		PrintWriter pw= res.getWriter();
		pw.print("<h1> Welcome Home "+name+" </h>");
		
	}

}
