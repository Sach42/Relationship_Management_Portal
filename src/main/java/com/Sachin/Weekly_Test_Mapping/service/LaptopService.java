package com.Sachin.Weekly_Test_Mapping.service;

import com.Sachin.Weekly_Test_Mapping.model.Laptop;
import com.Sachin.Weekly_Test_Mapping.repository.ILaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LaptopService {
    @Autowired
    ILaptopRepo laptopRepo;

    public String addLaptop(Laptop laptop) {
        laptopRepo.save(laptop);
        return "laptop added";
    }

    public List<Laptop> getLaptop() {
        return laptopRepo.findAll();
    }

    public String deleteLaptop(Long lapId) {
    Optional<Laptop> laptopOptional = Optional.of(laptopRepo.findById(lapId).orElseThrow());
    if(laptopOptional.isPresent()){
        laptopRepo.deleteById(lapId);
        return "deleted";
    }
    return "Id not found";
    }
}
