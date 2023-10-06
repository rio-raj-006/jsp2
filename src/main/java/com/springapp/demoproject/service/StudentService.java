package com.springapp.demoproject.service;

import com.springapp.demoproject.model.Student;
import com.springapp.demoproject.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    StudentRepo str;
    @Autowired
    public StudentService(StudentRepo str) {
        this.str = str;
    }
    public List<Student> getall(){
        return str.findAll();
    }
    public Student save(Student st){
        return str.save(st);
    }
    public void delete(int id){
        str.deleteById(id);
    }
}
