package com.training.web;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.web.USERPASS;
/**
 * Servlet implementation class DemoServlet
 */
@WebServlet("/demo-servlet")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	String msg;
    
    String config;
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
		String username1 = request.getParameter("uname");
		String password1 = request.getParameter("pwd");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			String url = "jdbc:oracle:thin:@localhost:1521/xe";
			String userName = "system";
			String passWord = "123";
			
			Connection con = DriverManager.getConnection(url,userName,passWord);
			
			String query = "SELECT * FROM UserPass";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()){
				String User = rs.getString("Username");
				String Pass = rs.getString("Password");
				if(User.equals(username1) && Pass.equals(password1) ) {
					out.println("<html><body>");
					out.println("<h1>LOGIN SUCCESFUL</h1>");
					out.println("</body></html>");
				} else {
					out.println("<html><body>");
					out.println("<h1>LOGIN FAILED</h1>");
					out.println("</body></html>");
				}
				
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			String url = "jdbc:oracle:thin:@localhost:1521/xe";
			String userName = "system";
			String passWord = "123";
			
			Connection con = DriverManager.getConnection(url,userName,passWord);
			
			String query = "SELECT * FROM UserPass";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			List<USERPASS> a = new ArrayList<USERPASS>();
			while(rs.next()){
				String User = rs.getString("Username");
				String Pass = rs.getString("Password");

				out.println("<html><body>");
				out.println("<table>");
				out.println("<tr><td>"+ User+"</td></tr>");
				out.println("<tr><td>" + Pass + "</td></tr>");
				out.println("</table>");
				out.println("</body></html>");	
			}
			rs.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		doGet(request, response);
	}

}
