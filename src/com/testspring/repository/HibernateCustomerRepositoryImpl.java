package com.testspring.repository;

import java.util.List;

import com.testspring.model.Customer;

import java.util.ArrayList;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	public List<Customer> findAll() {

		List<Customer> customers = new ArrayList<Customer>();

		Customer customer = new Customer();

		customer.setFirstname("Maggi");
		customer.setLastname("Moldovan");

		customers.add(customer);
		return customers;

	}
}
