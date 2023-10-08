package com.Sachin.Weekly_Test_Mapping.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class,scope=Book.class,property="BookId")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long BookId;
    private  String BookTitle;

    private  String BookAuthor;

    private  String BookDescription;

    private  Integer BookPrice;

    @ManyToOne
    @JoinColumn(name = "fk_student_id")
    Student student;

}
