package prepared_Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class StudentDelete {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id  to be deleted ");
		int id=sc.nextInt();
	    String className="com.mysql.cj.jdbc.Driver";
	    String url="jdbc:mysql://localhost:3306/student";
	    String user="root";
	    String pass="root";
	    String query="delete from student where idstudent=?";
	    Class.forName(className);
	    Connection con=DriverManager.getConnection(url, user, pass);
	    PreparedStatement ps=con.prepareStatement(query);
	    ps.setInt(1, id);
	    ps.execute();
	    con.close();
	    System.out.println("deleted");
	}

}
