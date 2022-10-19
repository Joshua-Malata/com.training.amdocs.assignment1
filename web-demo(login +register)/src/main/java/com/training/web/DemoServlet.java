package com.training.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
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
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String u = request.getParameter("username");
		String p = request.getParameter("userpass");
		String  s = request.getParameter("accountType");
		
		String admin ="admin";
		String user = "user";
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
	    if(USERPASS.validate(s, u, p)){  
	    	if (admin.equals(s)) {
	    		RequestDispatcher rd=request.getRequestDispatcher("main-servlet");  
	    		System.out.println(s);
	    		rd.forward(request,response); 
	    	}else if(user.equals(s)) {
	    		RequestDispatcher rd=request.getRequestDispatcher("user-servlet");  
	    		System.out.println(s);
	    		rd.forward(request,response);
	    	}
	    }
	    else{  
	    out.print("Sorry username or password error");  
	    RequestDispatcher rd=request.getRequestDispatcher("index.html");  
	    rd.include(request,response);  
	    } 
	       
	  
	     
	          
	    out.close(); 
		
	}

}