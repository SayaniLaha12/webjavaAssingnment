package Assigment1;

import java.io.IOException;
import java.io.PrintWriter;

 import javax.servlet.http.HttpServlet;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 
 
 public class logServlet extends HttpServlet{
	 public void service(HttpServletRequest req,HttpServletResponse res)
			 throws IOException
	 {
		 String UserName=req.getParameter("usn");
		 String password=req.getParameter("pwd");
		 PrintWriter out=res.getWriter();
		 
		 if(UserName.equals("Sayani") && password.equals("sayani"))
		 {
			 out.println("Hello");
		 }
		 else
			out.println("login failed");
	 }
}