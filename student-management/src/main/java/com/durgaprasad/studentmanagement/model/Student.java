package com.durgaprasad.studentmanagement.model;

public class Student {

    private int id;
    private int year;

    private String rollno;
    private String name;
    private String gender;
    private String email;
    private String phone;
    private String department;
    private String section;

    public Student(int id, String rollno, String name, String gender, String email, String phone, String department,
            int year, String section) {

        this.id = id;
        this.rollno = rollno;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.department = department;
        this.year = year;
        this.section = section;
    }

    public int getId() {
        return id;
    }

    public String getRollNo() {
        return rollno;
    }

    public String getFirstName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getDepartment() {
        return department;
    }

    public int getYear() {
        return year;
    }

    public String getSection() {
        return section;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRollNo(String rollno) {
        this.rollno = rollno;
    }

    public void setFirstName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setSection(String section) {
        this.section = section;
    }
}