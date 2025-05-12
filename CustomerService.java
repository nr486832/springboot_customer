package com.example.customer.service;

import com.example.customer.dao.CustomerDAO;
import com.example.customer.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerDAO dao;

    public Customer getCustomerById(Long id) {
        return dao.findById(id);
    }

    public int updateCustomer(Customer customer) {
        return dao.update(customer);
    }

    public int deleteCustomer(Long id) {
        return dao.delete(id);
    }

    public List<Customer> getCustomersSortedByPurchases() {
        return dao.getCustomersSortedByNameBasedOnPurchases();
    }
}