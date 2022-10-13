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

/**
 * Servlet implementation class TableServlet
 */
@WebServlet("/table-servlet")
public class TableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TableServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
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
					System.out.println("LOGIN SUCCESSFUL");
				} else {
					System.out.println("LOGIN FAILED");
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
			
			String query = "SELECT * FROM TableUser";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()){
				String ID = rs.getString("Id");
				String NAME = rs.getString("Name");
				String EMAIL = rs.getString("Email");
				String ADDRESS = rs.getString("Address");
				
				out.println("<html><body>");
				out.println("<table>");
				out.println("<tr><td>"+ ID+"</td></tr>");
				out.println("<tr><td>" + NAME + "</td></tr>");
				out.println("<tr><td>" + EMAIL + "</td></tr>");
				out.println("<tr><td>" + ADDRESS + "</td></tr>");
				out.println("</table>");
				out.println("</body></html>");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		doGet(request, response);
	}

}
