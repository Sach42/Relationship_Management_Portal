package com.Sachin.Weekly_Test_Mapping.repository;

import com.Sachin.Weekly_Test_Mapping.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepo extends JpaRepository<Address,Long> {
}
