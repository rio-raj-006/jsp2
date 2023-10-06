package com.springapp.demoproject.repository;

import com.springapp.demoproject.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {
}
