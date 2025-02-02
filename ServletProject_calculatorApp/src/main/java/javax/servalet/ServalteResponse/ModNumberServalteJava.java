package javax.servalet.ServalteResponse;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ModNumberServalteJava  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name1=req.getParameter("num1");
		int num1=Integer.parseInt(name1);
		int num2=Integer.parseInt(req.getParameter("num2"));
		
		int mod=num1%num2;
		
		PrintWriter pw=res.getWriter();
		pw.print("<h1> The Mod is : "+mod+"</h1>");
	}

}
