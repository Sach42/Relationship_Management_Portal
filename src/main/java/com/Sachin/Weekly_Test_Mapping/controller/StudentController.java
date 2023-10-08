package com.Sachin.Weekly_Test_Mapping.controller;

import com.Sachin.Weekly_Test_Mapping.model.Student;
import com.Sachin.Weekly_Test_Mapping.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("Student")
    public  String addStudent(@RequestBody @Valid Student student){
        return studentService.addStudent(student);
    }

    @GetMapping("Student")
    public List<Student> getStudent(){
        return studentService.getStudent();
    }

    @DeleteMapping("Student/{id}")
    public String deleteStudent(@PathVariable Long StudentId){
        return  studentService.deleteStudent(StudentId);
    }
}
