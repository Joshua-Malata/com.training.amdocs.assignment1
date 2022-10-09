package jdbcDemo;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;

public class jdbcdemo {
	public static void main(String[] args) {
		try {
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		String userName = "system";
		String passWord = "123";
		
		Connection con = DriverManager.getConnection(url,userName,passWord);
		
//		Statement stmt = con.createStatement();
		
//		query
//		String query = "CREATE TABLE STUDENT("
//						+ "STUD_ID VARCHAR(255) PRIMARY KEY,"
//						+ "STUD_NAME VARCHAR(255) NOT NULL,"
//						+ "ADDRESS VARCHAR(255) NOT NULL,"
//						+ "BRANCH VARCHAR(255) NOT NULL)";
//		
//		
//		stmt.execute(query);
//		
//		System.out.println("Table Created");
//		String query = "{? = call STUD_DETAIL(?)}";
//		
//		CallableStatement cs = con.prepareCall(query);
//	
//		cs.registerOutParameter(1, Types.VARCHAR);
//		
//		cs.setString(2, "102");
//		
//		cs.execute();
		
//		String query1 = "INSERT INTO STUDENT VALUES('101', 'ADOR', 'LAOAG', 'MANILA')";
//		
//		stmt.execute(query1);
//		PreparedStatement stmt = con.prepareStatement("insert into student values(?,?,?,?)");
//		PreparedStatement stmt = con.prepareStatement("call STUDENT(?,?,?,?)");
//		stmt.setString(1, "102");
//		stmt.setString(2, "JB");
//		stmt.setString(3, "PHILIPPINES");
//		stmt.setString(4, "CS");
//		
		Statement stmt = con.createStatement();
		ResultSet studRec = stmt.executeQuery("SELECT * FROM STUDENT");
		
		ArrayList <Student> students = new ArrayList<Student>();
		
		while(studRec.next()) {

			students.add(new Student(studRec.getString(1), 
					studRec.getString(2), 
					studRec.getString(3),
					studRec.getString(4)));
		}
		
		students.stream()
		.sorted(Comparator.comparing(Student::getStudName))
		.forEach(a -> System.out.println(a.getStudId() 
				+ " " + a.getStudName() 
				+ " " + a.getStudAddress() 
				+ " " + a.getDepartments()));
		
	}catch(SQLException e) {
		e.printStackTrace();
	}

	}

}
