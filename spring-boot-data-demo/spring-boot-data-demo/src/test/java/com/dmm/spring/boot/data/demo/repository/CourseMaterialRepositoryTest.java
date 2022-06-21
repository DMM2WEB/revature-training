package com.dmm.spring.boot.data.demo.repository;

import com.dmm.spring.boot.data.demo.entity.Course;
import com.dmm.spring.boot.data.demo.entity.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseMaterialRepositoryTest {

    @Autowired
    private CourseMaterialRepository repository;

    @Test
    public void SaveCourseMaterial(){
//        Course course = Course.builder()
//                .title("html")
//                .credit(10)
//                .build();
//
//        CourseMaterial courseMaterial = CourseMaterial.builder()
//                .url("www.html.com")
//                .course(course)
//                .build();

        Course course = Course.builder()
                .title("css")
                .credit(5)
                .build();

        CourseMaterial courseMaterial = CourseMaterial.builder()
                .url("www.css.com")
                .course(course)
                .build();

        repository.save(courseMaterial);
    }

    @Test
    public void printAllCourseMaterialWithCourse(){
        List<CourseMaterial> courseMaterialList = repository.findAll();
        System.out.println(courseMaterialList);
    }

    @Test
    public void printAllCourseMaterial(){
        List<CourseMaterial> courseMaterialList = repository.findAll();
        System.out.println(courseMaterialList);
    }
}