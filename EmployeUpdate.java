package prepared_Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class EmployeUpdate {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name to be updated");
		String name=sc.next();
		System.out.println("enter id to be updated");
		int id=sc.nextInt();
		String className="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/employe";
		String user="root";
		String pass="root";
		String query="update employe set name=? where id=?";
		 Class.forName(className);
		 Connection con=DriverManager.getConnection(url, user, pass);
		 PreparedStatement ps=con.prepareStatement(query);
		 ps.setString(1, name);
		 ps.setInt(2, id);
		 ps.execute();
		 con.close();
		 System.out.println("updated");
		
		

	}

}
