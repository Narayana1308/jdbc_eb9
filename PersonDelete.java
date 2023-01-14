package prepared_Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PersonDelete {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id");
		int id=sc.nextInt();
		
		String className="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/persondb";
		String user="root";
		String  passward="root";
		String query="delete  from person where id=?";
		
		Class.forName(className);
		Connection com=DriverManager.getConnection(url, user, passward);
		PreparedStatement ps=com.prepareStatement(query);
		ps.setInt(1, id);
		ps.execute();
	    com.close();
	    System.out.println("deleted");
	    

	}

}
