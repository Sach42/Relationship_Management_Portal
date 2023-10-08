package com.Sachin.Weekly_Test_Mapping.service;

import com.Sachin.Weekly_Test_Mapping.model.Course;
import com.Sachin.Weekly_Test_Mapping.repository.ICourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    @Autowired
    ICourseRepo courseRepo;

    public String addCourse(Course course) {
        courseRepo.save(course);
        return "added";
    }

    public List<Course> getCourse() {
        return courseRepo.findAll().stream().toList();
    }

    public String deleteCourse(Long courseId) {
        Optional<Course> optionalCourse = courseRepo.findById(courseId);
        if(optionalCourse.isPresent()){
            courseRepo.deleteById(courseId);
            return "deleted";
        }
        return "Id not found";
    }
}
