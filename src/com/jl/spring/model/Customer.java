package com.jl.spring.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {
	@Autowired
	private Person person;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(Person person) {
		super();
		this.person = person;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
}
