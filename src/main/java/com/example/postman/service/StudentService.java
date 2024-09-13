package com.example.postman.service;

import com.example.postman.entity.Student;
import com.example.postman.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public Student saveDetails(Student student)
    {
        return studentRepo.save(student);
    }

    public List<Student> getallDetails(Student student)
    {
        return studentRepo.findAll();
    }

    public Student updateDetails(Student student) {

        Student existingStudent = studentRepo.findById(student.getId())
                .orElse(null);

        if (existingStudent != null) {

            existingStudent.setName(student.getName());
            existingStudent.setMarks(student.getMarks());


            return studentRepo.save(existingStudent);
        }
        else
        {
            return null;
        }
        }


    }
