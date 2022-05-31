package com.dmm.Day07;

//program to validate student record

class Student {
    private int studentId;
    private String studentName;
    private int studentAge;

    public int getStudentId () {
        return studentId;
    }

    public void setStudentId (int id) throws Exception {
        if (id <= 0) {
            throw new Exception("ID can not be verified");
        }
        else {
            System.out.println(id);
        }
        this.studentId = id;
    }

    public String getStudentName () {
        return studentName;
    }

    public void setStudentName (String name) throws Exception {
        if (name.isBlank()) {
            throw new Exception("Name can not be blank");
        }
        else {
            System.out.println(name);
        }
        this.studentName = name;
    }

    public int getStudentAge () { return studentAge; }

    public void setStudentAge (int age) throws Exception {
        if (age <= 18) {
            throw new Exception("Age can not be less than 18");
        }
        else {
            System.out.println(age);
        }
        this.studentAge = age;
    }
}

public class Exercise6 {
    public static void main(String[] args) throws Exception {
        Student student = new Student();
        student.setStudentId(100);
        student.setStudentName("Peter");
        student.setStudentAge(19);

        Student student2 = new Student();
        student2.setStudentId(0);
        student2.setStudentName("");
        student2.setStudentAge(17);
    }
}//based on Demo13
