package com.jl.spring.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	
	public Person person;

	public Student(Person person) {
		super();
		this.person = person;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
}
