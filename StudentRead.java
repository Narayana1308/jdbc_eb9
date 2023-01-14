package prepared_Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class StudentRead {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id  ");
     	int id=sc.nextInt();
	    String className="com.mysql.cj.jdbc.Driver";
	    String url="jdbc:mysql://localhost:3306/student";
	    String user="root";
	    String pass="root";
	    String query="select * from student where idstudent=?";
	    Class.forName(className);
	    Connection com=DriverManager.getConnection(url, user, pass);
	    PreparedStatement ps=com.prepareStatement(query);
	    ps.setInt(1, id);
	    ResultSet rs=ps.executeQuery();
	    while(rs.next()) {
	    	System.out.println(rs.getInt(1));
	    	System.out.println(rs.getString(2));
	    	System.out.println(rs.getInt(3));
	    	System.out.println(rs.getString(4));
	    	System.out.println(rs.getString(5));
	    	System.out.println(rs.getString(6));
	    	System.out.println(rs.getLong(7));
	    	System.out.println("===============================");
	    }
	    com.close();
	    
	    

	}

}
