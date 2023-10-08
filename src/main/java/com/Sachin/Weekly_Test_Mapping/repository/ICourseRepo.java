package com.Sachin.Weekly_Test_Mapping.repository;

import com.Sachin.Weekly_Test_Mapping.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourseRepo extends JpaRepository<Course,Long> {
}
