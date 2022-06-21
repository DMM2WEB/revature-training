package com.dmm.spring.boot.data.demo.repository;

import com.dmm.spring.boot.data.demo.entity.CourseMaterial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseMaterialRepository extends JpaRepository<CourseMaterial, Long> {
}
