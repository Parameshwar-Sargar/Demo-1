package Com.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	
  static Connection con = null;
	
	public static Connection myconnection() throws SQLException {
		
		if (con==null) {
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student", "root", "root");
			
		System.out.println("If Condition Found");
		return con;
		}
		System.out.println("the connetion recalled");
		return con;
	}

}
