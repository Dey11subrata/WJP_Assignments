package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Q_21
 */
@WebServlet("/Q_21")
public class Q_21 extends HttpServlet {
	private static final long serialVersionUID = 1L;
//21. Create a servlet that prints following error message using red color font.“CREATING GUI IS COMPLEX USING SERVLET”. 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1 style='color:red'>CREATING GUI IS COMPLEX USING SERVLET</h1>");
	}

}
