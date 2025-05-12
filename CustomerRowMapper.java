package com.example.customer.rowmapper;

import com.example.customer.model.Customer;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerRowMapper implements RowMapper<Customer> {
    public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
        Customer c = new Customer();
        c.setId(rs.getLong("id"));
        c.setName(rs.getString("name"));
        c.setEmail(rs.getString("email"));
        c.setPurchaseCount(rs.getInt("purchase_count"));
        return c;
    }
}