package com.saniya;
import java.sql.Connection;
import java.sql.DriverManager;

public class TestDB {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/ServletLogin",
                "root",
                "root"
            );
            System.out.println("Database connected!");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
