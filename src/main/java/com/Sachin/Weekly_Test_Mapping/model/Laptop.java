package com.Sachin.Weekly_Test_Mapping.model;

import com.Sachin.Weekly_Test_Mapping.model.Enum.Brand;
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
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class,scope=Laptop.class,property="LapId")
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long LapId;
    private  String LapName;

    @Enumerated(EnumType.STRING)
    private Brand LapBrand;

    private  Integer LapPrice;

    @OneToOne
    @JoinColumn(name = "fk_student_id")
    Student student;
}
