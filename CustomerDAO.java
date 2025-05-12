package com.example.customer.dao;

import com.example.customer.model.Customer;
import com.example.customer.rowmapper.CustomerRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Customer> findAll() {
        return jdbcTemplate.query("SELECT * FROM customer", new CustomerRowMapper());
    }

    public Customer findById(Long id) {
        return jdbcTemplate.queryForObject("SELECT * FROM customer WHERE id = ?", new CustomerRowMapper(), id);
    }

    public int update(Customer customer) {
        return jdbcTemplate.update("UPDATE customer SET name=?, email=?, purchase_count=? WHERE id=?",
            customer.getName(), customer.getEmail(), customer.getPurchaseCount(), customer.getId());
    }

    public int delete(Long id) {
        return jdbcTemplate.update("DELETE FROM customer WHERE id = ?", id);
    }

    public List<Customer> getCustomersSortedByNameBasedOnPurchases() {
        return jdbcTemplate.query("SELECT * FROM customer WHERE purchase_count > 0 ORDER BY name ASC", new CustomerRowMapper());
    }
}