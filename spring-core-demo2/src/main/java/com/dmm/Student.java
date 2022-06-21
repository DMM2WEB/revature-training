package com.dmm;

//import org.springframework.beans.factory.DisposableBean;
//import org.springframework.beans.factory.InitializingBean;
//
//public class Student implements InitializingBean, DisposableBean {
//
//    private String name;
//
//    public Student() {
//        super();
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                '}';
//    }
//
//    @Override
//    public void destroy() throws Exception {
//        System.out.println("destroy called");
//    }
//
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("init called");
//    }
//}

//public class Student {
//    private Course course;
//
//    public Course getCourse() {
//        return course;
//    }
//
//    public void setCourse(Course course) {
//        this.course = course;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "course=" + course +
//                '}';
//    }
//}

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
    private Course course;

    public Student(Course course) {
        this.course = course;
        System.out.println("constructor called");
    }

    public Course getCourse() {
        return course;
    }

    @Autowired
    public void setCourse(Course course) {
        this.course = course;
        System.out.println("setter called");
    }

    @Override
    public String toString() {
        return "Student{" +
                "course=" + course +
                '}';
    }
}

