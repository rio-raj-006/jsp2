package com.springapp.demoproject.controller;

import com.springapp.demoproject.model.Student;
import com.springapp.demoproject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("students")
public class Controller {
    StudentService sts;
    @Autowired
    public Controller(StudentService sts)
    {
        this.sts = sts;
    }
    @GetMapping("getall")
    public List<Student> getall(){
        return sts.getall();
    }
    @PostMapping("post")
    public Student add(@RequestBody Student st1){
        return sts.save(st1);
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        sts.delete(id);
    }
    @PutMapping("{id}")
    public Student update(@PathVariable int id,@RequestBody Student st){
        st.setId(id);
        return sts.save(st);
    }
}
