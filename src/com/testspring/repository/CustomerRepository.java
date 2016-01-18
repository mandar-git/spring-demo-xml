package com.testspring.repository;

import java.util.List;

import com.testspring.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}