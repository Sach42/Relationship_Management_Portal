package com.Sachin.Weekly_Test_Mapping.controller;

import com.Sachin.Weekly_Test_Mapping.model.Laptop;
import com.Sachin.Weekly_Test_Mapping.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {
    @Autowired
    LaptopService laptopService;

    @PostMapping("Laptop")
    public String addLaptop(Laptop laptop){
        return laptopService.addLaptop(laptop);
    }

    @GetMapping("laptop/{laptopId}")
    public List<Laptop> getLaptop(){
        return laptopService.getLaptop();
    }

    @DeleteMapping("laptop/{id}")
    public  String deleteLaptop(@PathVariable Long LapId)
    {
        return  laptopService.deleteLaptop(LapId);
    }


}
