package prepared_Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeRead {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id to be printed ");
		int id=sc.nextInt();
	    String className="com.mysql.cj.jdbc.Driver";
	    String url="jdbc:mysql://localhost:3306/employe";
	    String user="root";
	    String pass="root";
	    String query="select * from employe where id=?";
	    Class.forName(className);
	    Connection con=DriverManager.getConnection(url, user, pass);
	    PreparedStatement ps=con.prepareStatement(query);
	    ps.setInt(1, id);
	    ResultSet rs=ps.executeQuery();
	    while(rs.next()) {
	    	System.out.println(rs.getInt(1));
	    	System.out.println(rs.getString(2));
	    	System.out.println(rs.getLong(3));
	    	System.out.println(rs.getString(4));
	    	System.out.println(rs.getString(5));
	    	System.out.println("=======================");
	    }
	    con.close();
	    System.out.println("printed ");
	    
	}

}
