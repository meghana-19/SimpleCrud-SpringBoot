package com.example.simplecrud.service;

import java.util.List;

import com.example.simplecrud.model.Customer;

public interface CustomerService {
    
    List<Customer> getAllCustomers();
    
    Customer getCustomer(Long customerId);
    
    Customer createCustomer(Customer customer);
    
    Customer updateCustomer(Customer customer);
    
    void deleteCustomer(Long customerId);

}
