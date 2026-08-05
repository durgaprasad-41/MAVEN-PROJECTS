package com.durgaprasad.studentmanagement;

import com.durgaprasad.studentmanagement.model.Student;
import com.durgaprasad.studentmanagement.service.StudentService;
import java.io.*;

public class StudentManagementApp {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("===== STUDENT MANAGEMENT SYSTEM =====");
        System.out.println("1. Add Student");
        System.out.println("2. View Students");
        System.out.println("3. Update Student");
        System.out.println("4. Delete Student");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        int choice = Integer.parseInt(br.readLine());
        switch (choice) {
            case 1:
                StudentService service = new StudentService();
                String rollNo = br.readLine();
                String name = br.readLine();
                String gender = br.readLine();
                String email = br.readLine();
                String phone = br.readLine();
                String department = br.readLine();
                int year = Integer.parseInt(br.readLine());
                String section = br.readLine();
                Student student = new Student(0, rollNo, name, gender, email, phone, department, year, section);
                service.addStudent(student);
                break;
            case 2:
                StudentService service1 = new StudentService();
                service1.viewStudents();
                break;
            case 3:
                StudentService service2 = new StudentService();
                String rollNoToUpdate = br.readLine();
                service2.updateStudent(rollNoToUpdate);
                break;
            case 4:
                StudentService service3 = new StudentService();
                String rollNoToDelete = br.readLine();
                service3.deleteStudent(rollNoToDelete);
                break;
            default:
                System.out.println("Invalid choice");
        }
        br.close();
    }
}