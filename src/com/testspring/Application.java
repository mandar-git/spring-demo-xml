
package com.testspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.testspring.model.Customer;
import com.testspring.service.CustomerService;

public class Application {

	public static void main(String[] args) {
		
		// Test spring 
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		CustomerService service = context.getBean("customerService", CustomerService.class);
		Customer customer = service.findAll().get(0);
		System.out.println(customer);
		
		//Test constructor 
		ApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");
		CustomerService custserv = appContext.getBean("customerService", CustomerService.class);
		System.out.println(custserv.findAll().get(0));

		//Test constructor autowire
		
		ApplicationContext appCont = new ClassPathXmlApplicationContext("appCont.xml");
		CustomerService serv = appContext.getBean("customerService", CustomerService.class);
		for(Customer cust : serv.findAll()){
			System.out.println(cust);
		}
	}

}
