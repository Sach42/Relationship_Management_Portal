package com.Sachin.Weekly_Test_Mapping.model;

import com.Sachin.Weekly_Test_Mapping.model.Enum.Branch;
import com.Sachin.Weekly_Test_Mapping.model.Enum.Department;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class,scope=Student.class,property="StudentId")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long StudentId;
    private  String StudentName;

    private  Integer StudentAge;

    @Pattern(regexp = "^[0-9]{10}$")
    private  String StudentContact;

    @Enumerated(EnumType.STRING)
    private Branch StudentBranch;

    @Enumerated(EnumType.STRING)
    private Department StudentDepartment;

    @OneToOne(mappedBy = "student")
    Address address;

    @OneToMany(mappedBy = "student")
    List<Course> courses;

    @OneToOne(mappedBy = "student")
    Laptop laptop;

    @OneToMany(mappedBy = "student")
    List<Book> books;
}
