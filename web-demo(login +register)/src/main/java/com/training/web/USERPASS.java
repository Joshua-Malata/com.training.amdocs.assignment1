package com.training.web;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class USERPASS {
	public static boolean validate(String accountType, String user,String pass){ 
		boolean status=false; 
		
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			String url = "jdbc:oracle:thin:@localhost:1521/xe";
			String userName = "system";
			String passWord = "123";
			
			Connection con = DriverManager.getConnection(url,userName,passWord);
			System.out.println("Connected to DB");
			
			Statement st = con.createStatement();
			PreparedStatement ps=con.prepareStatement("SELECT * FROM ACCOUNT WHERE ACCOUNTTYPE = ? and USERNAME = ? and PASSWORD = ?"); 
			ps.setString(1,accountType);  
			ps.setString(2,user);
			ps.setString(3,pass);
			ResultSet rs=ps.executeQuery();
			status=rs.next();  


			
		}catch(SQLException e) {
			e.printStackTrace();
			return status;
		}
		return status;
	}
}
