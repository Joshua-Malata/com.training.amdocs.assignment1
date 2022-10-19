package com.training.web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class accountDAO {
	
	public int accountRegister(account Account) throws ClassNotFoundException {
		int result = 0;
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			String url = "jdbc:oracle:thin:@localhost:1521/xe";
			String userName = "system";
			String passWord = "123";
			
			Connection con = DriverManager.getConnection(url,userName,passWord);
			System.out.println("Connected to DB");
			
			Statement st = con.createStatement();
			PreparedStatement ps=con.prepareStatement("INSERT INTO ACCOUNT(ACCOUNTTYPE,USERNAME,PASSWORD) VALUES(?,?,?)");

			ps.setString(1, Account.getAcountType());
            ps.setString(2, Account.getUsername());
            ps.setString(3, Account.getPassword());

			ps.executeQuery(); 
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return result;
    }

}
