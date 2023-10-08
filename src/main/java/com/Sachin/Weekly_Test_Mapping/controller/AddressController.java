package com.Sachin.Weekly_Test_Mapping.controller;

import com.Sachin.Weekly_Test_Mapping.model.Address;
import com.Sachin.Weekly_Test_Mapping.model.Book;
import com.Sachin.Weekly_Test_Mapping.service.AddressService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    @PostMapping("Address")
    public  String addAddress(@RequestBody @Valid Address address){
        return addressService.addAddress(address);
    }

    @GetMapping("Address")
    public List<Address> getAddress(){
        return addressService.getAddress();
    }

    @DeleteMapping("address/{id}")
    public  String deleteAddress(@PathVariable Long addressId)
    {
        return  addressService.deleteAddress(addressId);
    }
}
