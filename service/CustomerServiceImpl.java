package com.example.simplecrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.simplecrud.model.Customer;
import com.example.simplecrud.repository.CustomerRepository;

@Service
public class CustomerServiceImpl  implements CustomerService{
    
    @Autowired
    CustomerRepository customerRepository;
    
    @Override
    public List<Customer> getAllCustomers()
    {
        return customerRepository.findAll();
    }
    
    @Override
    public Customer getCustomer(Long customerId)
    {
        return customerRepository.findById(customerId).get();
    }
    
    @Override
    public Customer createCustomer(Customer customer)
    {
        return customerRepository.save(customer);
    }
    
    @Override
    public Customer updateCustomer(Customer customer)
    {
        return customerRepository.saveAndFlush(customer);
    }
    
    @Override
    public void deleteCustomer(Long customerId)
    {
        customerRepository.deleteById(customerId);
    }
    

}
