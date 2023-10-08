package com.Sachin.Weekly_Test_Mapping.repository;

import com.Sachin.Weekly_Test_Mapping.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILaptopRepo extends JpaRepository<Laptop,Long> {
}
