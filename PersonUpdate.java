package prepared_Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PersonUpdate {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id to be upadted");
		int id=sc.nextInt();
		System.out.println("enter the name to be updated");
		String name=sc.next();
		System.out.println("enter the number to be updated");
		long phone=sc.nextLong();
		
		
		String className="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/persondb";
		String user="root";
		String passward="root";
		String query="update person set name=? ,phone=? where id=?";
		
		Class.forName(className);
		Connection con=DriverManager.getConnection(url, user, passward);
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1, name);
		ps.setLong(2, phone);
		ps.setInt(3, id);
		ps.execute();
		ps.close();
		System.out.println("updated");

	}

}
