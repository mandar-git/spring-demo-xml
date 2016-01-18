package com.testspring.model;

public class Customer {

	private String firstname;
	private String lastname;

	public Customer(){
		//System.out.println("calling Constructor");
	}
	
	public String getFirstname() {
		//System.out.println("calling getter on firstname");
		return firstname;
	}

	public String getLastname() {
		//System.out.println("calling getter on lastname");
		return lastname;
	}

	public void setFirstname(String firstname) {
		//System.out.println("calling setter on firstname");
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		//System.out.println("calling setter on lasttname");
		this.lastname = lastname;
	}
	
	@Override
	public String toString(){
		return "Customer[firstname= " + firstname + " ,lastname= " + lastname + "]" ;
		
	}

}
