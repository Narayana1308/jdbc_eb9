package prepare_Statement1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PersonCRUD {
	public Connection getConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/persondb", "root", "root");
		return connection;
	}

	public void savePerson(int id,String name,long phone) throws Exception {
		Connection connection=getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("insert into person values(?,?,?)");
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);
		preparedStatement.setLong(3, phone);
		preparedStatement.execute();
		preparedStatement.close();
		connection.close();
		System.out.println("successfully added");
	}
	public void updatePerson(int id,String name) throws Exception {
		Connection connection=getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("update person set name=? where id=?");
		preparedStatement.setInt(2, id);
		preparedStatement.setString(1, name);
		preparedStatement.execute();
		connection.close();
		System.out.println("Successfully Updated");
		
		
	}
	public void deletePerson(int id) throws Exception {
		Connection connection=getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("delete from person where id=?");
		preparedStatement.setInt(1, id);
		preparedStatement.execute();
		connection.close();
		System.out.println("successfully deleted");
	}
	public void getPersonDetails() throws Exception {
		Connection connection=getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("select * from person");
		ResultSet resultset=preparedStatement.executeQuery();
		while(resultset.next()) {
			System.out.println(resultset.getInt("id"));
			System.out.println(resultset.getString(2));
			System.out.println(resultset.getLong(3));
		}
	}

}
