package com.example.simplecrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.simplecrud.model.Customer;
import com.example.simplecrud.service.CustomerService;

@RestController

@RequestMapping("/api/v1/customer/")
public class CustomerController {
    
    @Autowired
    CustomerService service;
    
    @GetMapping("all")
    public List<Customer> getAllCustomers()
    {
        return service.getAllCustomers();
    }
    
    @GetMapping
    public Customer getCustomer(@Param("customerId") String customerId)
    {
        return service.getCustomer(Long.parseLong(customerId));
    }
    
    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer)
    {
        return service.createCustomer(customer);
    }
    
    @PutMapping
    public Customer updateCustomer(@RequestBody Customer customer)
    {
        return service.updateCustomer(customer);
    }
    
    @DeleteMapping
    public void deleteCustomer(String customerId)
    {
        service.deleteCustomer(Long.parseLong(customerId));
    }
   
}
