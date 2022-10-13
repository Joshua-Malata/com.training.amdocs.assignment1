package com.training.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class mainServlet
 */
@WebServlet("/main-servlet")
public class mainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public mainServlet() {
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
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
		String u = request.getParameter("username");
		out.println("WELCOME" + u);
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			String url = "jdbc:oracle:thin:@localhost:1521/xe";
			String userName = "system";
			String passWord = "123";
			
			Connection con = DriverManager.getConnection(url,userName,passWord);
			System.out.println("Connected to DB");
			String query = "SELECT * FROM COURSETB"; 
			
			PreparedStatement st = con.prepareStatement(query);
			
			ResultSet rs = st.executeQuery();
			
			while(rs.next()) {
				String courseId = rs.getString("COURSEID");
				String courseName = rs.getString("COURSENAME");
				String courseDuration = rs.getString("COURSEDURATION");
				String courseFee = rs.getString("COURSEFEE");
				
				out.println("<table>");
				out.println("<th><td>" + courseId + "</td></th>");
				out.println("<th><td>" + courseName + "</td></th>");
				out.println("<th><td>" + courseDuration + "</td></th>");
				out.println("<th><td>" + courseFee + "</td></th>");
				out.println("</table>");
			}
			rs.close();
			
		}catch(SQLException e) {
			e.printStackTrace();

		}
	}

}
