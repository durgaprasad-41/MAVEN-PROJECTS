package com.durgaprasad.studentmanagement.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/student_management",
                    "root",
                    "root");

            System.out.println("Database Connected Successfully");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}