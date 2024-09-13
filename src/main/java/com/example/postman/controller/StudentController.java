package com.example.postman.controller;

import com.example.postman.entity.Student;
import com.example.postman.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public Student postDetails(@RequestBody Student student)
    {
        return studentService.saveDetails(student);
    }

    @GetMapping("/getallDetails")
    public List<Student> getDetails(@RequestBody Student student)
    {
        return studentService.getallDetails(student);
    }
    @PutMapping("/updateDetails")
    public  Student putDetails(@RequestBody Student student)
    {
        return studentService.updateDetails(student);
    }
}
