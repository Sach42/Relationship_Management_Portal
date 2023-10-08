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
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class,scope=Address.class,property="AddressID")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long AddressID;
    private  String Landmark;

    private  Integer ZipCode;

    private  String District;

    private  String State;

    private  String Country;

    @OneToOne
    @JoinColumn(name = "fk_student_id")
    Student student;
}
