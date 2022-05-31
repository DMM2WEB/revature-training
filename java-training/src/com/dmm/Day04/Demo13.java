package com.dmm.Day04;

class Student {
    private int studentId;
    private String studentName;

    public int getStudentId () {
        return studentId;
    }

    public void setStudentId (int id) throws Exception {
        if (id <= 0) {
            throw new Exception("ID can not be verified");
        }
        this.studentId = id;
    }

    public String getStudentName () {
        return studentName;
    }

    public void setStudentName (String studentName) throws Exception {
        if (studentName.isBlank()) {
            throw new Exception("Name can not be blank");
        }
        this.studentName = studentName;
    }
    public int getPassMark () {
        int passMark = 50;
        return passMark;

    }
}

public class Demo13 {
    public static void main(String[] args) throws Exception {
        Student student = new Student();

        /*student.getStudentId = -1;
        student.setStudentName = null;
        student.getPassMark = 20;

        System.out.println(student.studentId);
        System.out.println(student.studentName);
        System.out.println(student.passMark);*/

        student.setStudentId (100);
        student.setStudentName ("Mark");

        System.out.println("Student Id: " + student.getStudentId());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Pass Mark: " + student.getPassMark());
    }
}
