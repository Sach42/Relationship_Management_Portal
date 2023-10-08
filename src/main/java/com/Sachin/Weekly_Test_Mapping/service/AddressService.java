package com.Sachin.Weekly_Test_Mapping.service;

import com.Sachin.Weekly_Test_Mapping.model.Address;
import com.Sachin.Weekly_Test_Mapping.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;

    public String addAddress(Address address) {
        addressRepo.save(address);
        return "added";
    }

    public List<Address> getAddress() {
        return addressRepo.findAll();
    }

    public String deleteAddress(Long addressId) {
        Optional<Address> optionalAddress = addressRepo.findById(addressId);
        if(optionalAddress.isPresent()){
            addressRepo.deleteById(addressId);
            return "deleted";
        }
        return "id not found";
    }
}
