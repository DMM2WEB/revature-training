package com.dmm.spring.boot.data.demo.repository;

import com.dmm.spring.boot.data.demo.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
