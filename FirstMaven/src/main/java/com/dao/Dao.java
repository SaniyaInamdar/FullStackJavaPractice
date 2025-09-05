package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.entity.Student;

public class Dao {
	
	private static final String URL="jdbc:mysql://localhost:3306/Student";
	private static final String username="root";
	private static final String password="root";
	private Connection con;
	private PreparedStatement pstm;
	
	public Connection DBConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection(URL,username,password);
		return con;
	}
	
	public void insert(Student std) throws Exception {
		String sql="insert into Student values(?,?,?)";
		pstm=DBConnection().prepareStatement(sql);
		pstm.setInt(1,std.getId() );
		pstm.setString(2, std.getName());
		pstm.setInt(3,std.getAge() );
		pstm.executeUpdate();
		System.out.println("Inserted...");
	}
	
	public void delete(Student std) throws SQLException, Exception {
		String sql="delete from student where id= ?";
		pstm=DBConnection().prepareStatement(sql);
		pstm.setInt(1, std.getId());
		pstm.executeUpdate();
		System.out.println("Deleted Student..");
	}
	
	public void update(Student std) throws SQLException, Exception {
		String sql="update student set name= ? where id= ? ";
		pstm=DBConnection().prepareStatement(sql);
		pstm.setInt(2, std.getId());
		pstm.setString(1, std.getName());
		pstm.executeUpdate();
		System.out.println("Updated Student");
	}
}
