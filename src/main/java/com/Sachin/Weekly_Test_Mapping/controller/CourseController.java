package com.Sachin.Weekly_Test_Mapping.controller;

import com.Sachin.Weekly_Test_Mapping.model.Course;
import com.Sachin.Weekly_Test_Mapping.model.Laptop;
import com.Sachin.Weekly_Test_Mapping.service.CourseService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseService courseService;

    @PostMapping("Course")
    public  String addCourse(@RequestBody @Valid Course course){
        return courseService.addCourse(course);
    }

    @GetMapping("courses")
    public List<Course> getCourse(){
        return courseService.getCourse();
    }

    @DeleteMapping("course/{id}")
    public  String deleteCourse(@PathVariable Long CourseId)
    {
        return  courseService.deleteCourse(CourseId);
    }
}
