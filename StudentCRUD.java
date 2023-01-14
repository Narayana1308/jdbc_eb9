package prepare_Statement1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentCRUD {
	public Connection getConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=	DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
		return connection;
	}
	public void saveStudent(int id,String name,int marks,String fatherName,String email,String address,long phone) throws Exception {
		Connection connection=getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("insert into student values(?,?,?,?,?,?,?)");
		preparedStatement.setInt(1,id);
		preparedStatement.setString(2, name);
		preparedStatement.setInt(3, marks);
		preparedStatement.setString(4, fatherName);
		preparedStatement.setString(5, email);
		preparedStatement.setString(6, address);
		preparedStatement.setLong(7, phone);
		preparedStatement.execute();
		connection.close();
	}
	public void updateStudent(int id,String name) throws Exception {
		Connection connection=getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("update student set sname=? where idstudent=?");
		preparedStatement.setString(1, name);
		preparedStatement.setInt(2, id);
		preparedStatement.execute();
		connection.close();
	}
	public void deleteStudent(int id) throws Exception {
		Connection connection =getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("delete from student where idstudent=?");
		preparedStatement.execute();
		connection.close();
	}
	public void getStudentDetails() throws Exception {
		Connection connection =getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("select * from student");
		ResultSet resultSet =preparedStatement.executeQuery();
		while(resultSet.next()) {
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2));
			System.out.println(resultSet.getInt(3));
			System.out.println(resultSet.getString(4));
			System.out.println(resultSet.getString(5));
			System.out.println(resultSet.getString(6));
			System.out.println(resultSet.getLong(7));
			System.out.println("================================");
			
		}
		
	}

}
