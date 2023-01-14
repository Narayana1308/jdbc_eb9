package prepared_Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PersonInsert {

	public static void main(String[] args) throws Exception{
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enetr the name");
		String name=sc.next();
		System.out.println("enter phone number");
		long phone=sc.nextLong();
		
		String className="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/persondb";
		String passward="root";
		String username="root";
		String query="Insert into person values(?,?,?)";
		
		Class.forName(className);
		Connection con=DriverManager.getConnection(url, username, passward);
		PreparedStatement ps=con.prepareStatement(query);
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setLong(3, phone);
		ps.execute();
		con.close();
		System.out.println("inserted");
		
	}

}
