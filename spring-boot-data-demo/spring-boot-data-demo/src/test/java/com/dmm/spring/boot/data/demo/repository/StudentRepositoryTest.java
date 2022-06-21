package com.dmm.spring.boot.data.demo.repository;

import com.dmm.spring.boot.data.demo.entity.Guardian;
import com.dmm.spring.boot.data.demo.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository repository;

    @Test
    public void saveStudent(){
//        Student student = Student.builder()
//                .emailId("mathew@mail.com")
//                .firstName("Mathew")
//                .lastName("Evangelist")
////                .guardianName("Luke")
////                .guardianMobile("1112223333")
////                .guardianEmail("luke@mail.com")
//                .build();
//        repository.save(student);
    }

    @Test
    public void saveStudentWithGuardian(){

        Guardian guardian = Guardian.builder()
                .name("John")
                .mobile("9876543210")
                .email("john@mail.com")
                .build();

        Student student = Student.builder()
                .emailId("mark@mail.com")
                .firstName("Mark")
                .lastName("Evangelist")
                .guardian(guardian)
                .build();

        repository.save(student);
    }

    @Test
    public void printAllStudents(){
        List<Student> students = repository.findAll();
        System.out.println("studentList = " + students);
    }

    @Test
    public void getStudentByFirstAndLastName(){
        Student student = repository.findByFirstNameAndLastName("Mathew", "Evangelist");
        System.out.println(student);
    }

    @Test
    public void printStudentByEmailAddress(){
        Student student = repository.getStudentByEmailAddress("mathew@mail.com");
        System.out.println(student);

    }

}