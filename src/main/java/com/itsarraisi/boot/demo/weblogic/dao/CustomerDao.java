package com.itsarraisi.boot.demo.weblogic.dao;

import com.itsarraisi.boot.demo.weblogic.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class CustomerDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Customer> findAll() {
        // Set Query for Select All value CustomerHomeServiceLocation Table By Id Customer
        //language=ORACLE-SQL
        String baseQuery = "SELECT ID, NAME, SINCE FROM CUSTOMER ";

        // Set Query Parameter
        MapSqlParameterSource queryParameter = new MapSqlParameterSource();

        // Execute SQL Query
        try {
           return this.jdbcTemplate.query(baseQuery, new RowMapper<Customer>() {
               @Override
               public Customer mapRow(ResultSet resultSet, int i) throws SQLException {
                   Customer customer = new Customer();
                   customer.setId(resultSet.getString("ID"));
                   customer.setName(resultSet.getString("NAME"));
                   customer.setSince(resultSet.getString("SINCE"));
                   return customer;
               }
           });
        } catch (EmptyResultDataAccessException message) {
            return null;
        }

    }
}
