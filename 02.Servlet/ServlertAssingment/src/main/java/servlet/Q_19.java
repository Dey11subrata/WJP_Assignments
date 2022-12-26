package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Q_19")
public class Q_19 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	19. Create a servlet that prints WELCOME TO SERVLET WORLD using html's heading tag. 
		response.setContentType("text/html");	
	PrintWriter out = response.getWriter();
	out.print("<h1>WELCOME TO SERVLER WORLD</h1>");
	out.flush();
	out.close();
	}

}
