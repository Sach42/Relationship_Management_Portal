package com.Sachin.Weekly_Test_Mapping.service;

import com.Sachin.Weekly_Test_Mapping.model.Student;
import com.Sachin.Weekly_Test_Mapping.repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    IStudentRepo studentRepo;

    public String addStudent(Student student) {
        studentRepo.save(student);
        return "Student-added";
    }

    public List<Student> getStudent() {
        return  studentRepo.findAll();
    }


    public String deleteStudent(Long studentId) {
      Optional<Student> optionalStudent = Optional.of(studentRepo.findById(studentId).orElseThrow());
      if(optionalStudent.isPresent()){
          studentRepo.deleteById(studentId);
          return "deleted";
      }
        return "Id not found";
    }
}
