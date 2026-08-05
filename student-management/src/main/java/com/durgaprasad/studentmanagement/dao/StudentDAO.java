package com.durgaprasad.studentmanagement.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.durgaprasad.studentmanagement.model.Student;
import com.durgaprasad.studentmanagement.util.DBConnection;

public class StudentDAO {
    public void addStudent(Student student) {

        try {
            Connection con = DBConnection.getConnection();
            String sql = "INSERT INTO student (roll_no, first_name, gender, email, phone, department, year, section) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, student.getRollNo());
            ps.setString(2, student.getFirstName());
            ps.setString(3, student.getGender());
            ps.setString(4, student.getEmail());
            ps.setString(5, student.getPhone());
            ps.setString(6, student.getDepartment());
            ps.setInt(7, student.getYear());
            ps.setString(8, student.getSection());
            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Student Added Successfully");
            }
            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void viewStudent() {
        try {
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            String sql = "select *from student";
            ResultSet row = st.executeQuery(sql);
            System.out.println("Student Details");
            System.out.println("ID\tRoll No\tName\tGender\tEmail\tPhone\tDepartment\tYear\tSection");
            while (row.next()) {
                System.out.println("-----------------------------");
                System.out.print(row.getInt("id") + "\t");
                System.out.print(row.getString("roll_no") + "\t");
                System.out.print(row.getString("first_name") + "\t");
                System.out.print(row.getString("gender") + "\t");
                System.out.print(row.getString("email") + "\t");
                System.out.print(row.getString("phone") + "\t");
                System.out.println(row.getString("department") + "\t");
                System.out.println(row.getInt("year") + "\t");
                System.out.println(row.getString("section") + "\t");
                System.out.println();
            }
            row.close();
            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateStudent(String rollNo) {
        try {
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            String sql = "update student set first_name='deva naik' where roll_no='" + rollNo + "'";
            int rows = st.executeUpdate(sql);
            if (rows > 0) {
                System.out.println("Student updated successfully.");
            }
            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteStudent(String rollNo) {
        try {
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            String sql = "delete from student where roll_no='" + rollNo + "'";
            int rows = st.executeUpdate(sql);
            if (rows > 0) {
                System.out.println("Student deleted successfully.");
            }
            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
