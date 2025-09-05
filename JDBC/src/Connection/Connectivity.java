package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Connectivity {
	Scanner sc=new Scanner(System.in);
	
	public Connection DbConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/app","root","root");
		System.out.println("Connectivity Done...");
		return con;
	}
	
	public void createTable() throws Exception{
		String sql="create table student(id int primary key,name varchar(20), age int)";
		PreparedStatement pstmt=DbConnection().prepareStatement(sql);
		pstmt.execute();
		System.out.println("Table Created Successfully");
	}
	
	public void insertTable() throws Exception{
		System.out.println("Enter Id, Name, Age");
		int id=sc.nextInt();
		String name=sc.next();
		int age=sc.nextInt();                              
		String sql="insert into student values(?,?,?);";
		PreparedStatement pstmt=DbConnection().prepareStatement(sql);
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setInt(3, age);
		pstmt.executeUpdate();
		System.out.println("Data inserted...");
	}
	
	
	public void showTable() throws Exception{
		System.out.println("Enter a table name to show data :");
		String table=sc.next();
		String sql="SELECT * FROM " + table;
		PreparedStatement pstmt=DbConnection().prepareStatement(sql);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			System.out.println("Id : "+rs.getInt(1)+" "+"Name : "+rs.getString(2)+" "+"Age : "+rs.getInt(3));
		}
	}
	
	
	public void updateTable() throws Exception{
		System.out.println("Enter an ID to update");
		int updateid=sc.nextInt();
		System.out.println("Enter name : ");
		String name=sc.next();
		System.out.println("Enter Age : ");
		int age=sc.nextInt();
		String sql="update student set name = '"+name+ "' ,age = "+age+" where id= "+updateid;
		PreparedStatement pstmt=DbConnection().prepareStatement(sql);
		pstmt.executeUpdate();
		System.out.println("Updated....");
	}
	
	
	public void deleteTable() throws Exception{
		System.out.println("Enter a table name to delete : ");
		String table=sc.next();
		String sql="drop table "+table;
		PreparedStatement pstmt=DbConnection().prepareStatement(sql);
		pstmt.execute();
		System.out.println("Deleted table");
	}


}
