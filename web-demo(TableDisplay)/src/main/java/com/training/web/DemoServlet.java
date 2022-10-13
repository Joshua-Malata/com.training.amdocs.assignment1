package com.training.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoServlet
 */
@WebServlet("/demo-servlet")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       String msg;
       
       String config;
       
       ServletContext context = getServletContext();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init(String config) {
    	msg = "Kevin G";
    	this.config = config;
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("uname");
		String password = request.getParameter("pwd");
		
		String dName = context.getInitParameter("dname");
		
//		String email = config.getInitParameter("email");
		
		String user = "admin";
		String pass = "123";

		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
//		if (user.equals(username) && pass.equals(password)) {
			out.println("<html><body>");
			out.println("<h1>LOGIN SUCCESSFUL "+ dName+" </h1>");
			out.println("</body></html>");

//		} else {
//			out.println("<html><body>");
//			out.println("<h1>LOGIN FAILED</h1>");
//			out.println("</body></html>");
//			System.out.println(username);
//			System.out.println(password);
//		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
