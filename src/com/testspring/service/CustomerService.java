package com.testspring.service;

import java.util.List;

import com.testspring.model.Customer;

public interface CustomerService {

	List<Customer> findAll();

}