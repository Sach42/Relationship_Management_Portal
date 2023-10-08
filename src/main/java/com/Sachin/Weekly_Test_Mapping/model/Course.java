package com.Sachin.Weekly_Test_Mapping.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class,scope=Course.class,property="CourseId")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long CourseId;
    private  String CourseTitle;

    private  String CourseDescription;

    private LocalDateTime CourseDuration;

    @ManyToOne
    @JoinColumn(name = "fk_student_id")
    Student student;
}
