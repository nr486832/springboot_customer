package com.example.customer.controller;

import com.example.customer.model.Customer;
import com.example.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    @Autowired
    private CustomerService service;

    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable Long id) {
        return service.getCustomerById(id);
    }

    @PutMapping
    public String updateCustomer(@RequestBody Customer customer) {
        service.updateCustomer(customer);
        return "Updated successfully";
    }

    @DeleteMapping("/{id}")
    public String deleteCustomer(@PathVariable Long id) {
        service.deleteCustomer(id);
        return "Deleted successfully";
    }

    @GetMapping("/purchases")
    public List<Customer> getCustomersSorted() {
        return service.getCustomersSortedByPurchases();
    }
}