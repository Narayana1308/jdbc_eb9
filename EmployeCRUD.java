package prepare_Statement1;

import java.sql.Connection;
import java.sql.DriverManager;

public class EmployeCRUD {
	public Connection getConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection  connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employe","root","root");
		return connection;	
	}
	public void saveEmploye() {
		
	}

}
