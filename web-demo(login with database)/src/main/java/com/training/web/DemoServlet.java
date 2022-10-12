package com.training.web;

import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;

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
		
//		String user = "admin";
//		String pass = "123";

		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
//		if (user.equals(username) && pass.equals(password)) {
//			out.println("<html><body>");
//			out.println("<h1>LOGIN SUCCESSFUL </h1>");
//			out.println("</body></html>");
//
//		} else {
//			out.println("<html><body>");
//			out.println("<h1>LOGIN FAILED</h1>");
//			out.println("</body></html>");
//			System.out.println(username);
//			System.out.println(password);
//		}
		
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			String url = "jdbc:oracle:thin:@localhost:1521/xe";
			String userName = "system";
			String passWord = "123";
			
			Connection con = DriverManager.getConnection(url,userName,passWord);
			
//			out.println("<html><body>");
//			out.println("<h1>CONNECTION SUCCESSFUL"+con+" </h1>");
//			out.println("</body></html>");
			
//			Statement stmt = con.createStatement();
			
//			query
//			String query = "CREATE TABLE UserPass(Username VARCHAR(20) NOT NULL, Password VARCHAR(20) NOT NULL)";
//			String query = "INSERT INTO UserPass VALUES(?,?)";
//			PreparedStatement stmt = con.prepareStatement(query);
//			stmt.setString(1,"user");
//			stmt.setString(2, "123");
			
			String query = "SELECT * FROM UserPass where Username = 'admin'";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()){
				String User = rs.getString("Username");
				String Pass = rs.getString("Password");
				
				if(User.equals(username) && Pass.equals(password)) {
					out.println("<html><body>");
					out.println("<h1>"+User +" "+Pass+" </h1>");
					out.println("<h1>LOGIN SUCCESFUL</h1>");
					out.println("</body></html>");
				}else {
					out.println("<html><body>");
					out.println("<h1>LOGIN FAILED</h1>");
					out.println("</body></html>");
				}
				
			}
//			
//			stmt.execute();
//			out.println("<html><body>");
//			out.println("<h1>TABLE CREATED"+query+" </h1>");
//			out.println("</body></html>");
			

//			out.println("<html><body>");
//			out.println("<h1>VALUE INSERTED"+stmt+" </h1>");
//			out.println("</body></html>");
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
