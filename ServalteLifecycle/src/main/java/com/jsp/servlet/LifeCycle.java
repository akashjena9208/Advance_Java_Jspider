package com.jsp.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/one-clik")
public  class LifeCycle  extends GenericServlet{
	
	public LifeCycle()
	{
		System.out.println("Object Created");
	}
	
	@Override
	public void init() throws ServletException
	{
		System.out.println("init() Method call");
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service() Method Call");
		
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy() Method Call ");
	}



}
