package javax.servalet.ServalteResponse;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AddNumberServalteJava  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name1=req.getParameter("num1");
		int num1=Integer.parseInt(name1);
		int num2=Integer.parseInt(req.getParameter("num2"));
		
		int sum=num1+num2;
		
		PrintWriter pw=res.getWriter();
		pw.print("<h1> The Sum is : "+sum+"</h1>");
		
		
	}

}
