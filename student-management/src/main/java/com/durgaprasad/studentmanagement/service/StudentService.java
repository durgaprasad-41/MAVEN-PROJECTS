package com.durgaprasad.studentmanagement.service;

import com.durgaprasad.studentmanagement.dao.StudentDAO;
import com.durgaprasad.studentmanagement.model.Student;

public class StudentService {

    StudentDAO dao = new StudentDAO();

    public void addStudent(Student student) {
        dao.addStudent(student);
    }

    public void viewStudents() {
        dao.viewStudent();
    }

    public void updateStudent(String rollNo) {
        dao.updateStudent(rollNo);
    }

    public void deleteStudent(String rollNo) {
        dao.deleteStudent(rollNo);
    }
}