package Assignment1;

import java.io.IOException;
///import java.io.PrintWriter;

 import javax.servlet.RequestDispatcher;
 import javax.servlet.ServletException;
 import javax.servlet.http.HttpServlet;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 
 
 public class pwServlet extends HttpServlet{
	 public void service(HttpServletRequest req,HttpServletResponse res)
			 throws IOException,ServletException
	 {
		 int i=Integer.parseInt(req.getParameter("Sayani"));
		 int j=Integer.parseInt(req.getParameter("servlet"));
		 int k=i+j;
		 req.setAttribute("k is:",k);
		 RequestDispatcher rd = req.getRequestDispatcher("nextS");
		 rd.forward(req, res);
	 }}
