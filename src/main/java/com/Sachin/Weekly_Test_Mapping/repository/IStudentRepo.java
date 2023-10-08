package com.Sachin.Weekly_Test_Mapping.repository;

import com.Sachin.Weekly_Test_Mapping.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepo extends JpaRepository<Student,Long> {
}
