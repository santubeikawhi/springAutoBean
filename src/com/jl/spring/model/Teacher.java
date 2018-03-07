package com.jl.spring.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Teacher {
	@Autowired
	public Person personByType;
	@Autowired(required = false)//½ûÓÃspringµÄ ÒÀÀµ¼ì²é
	public Book book;

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(Person personByType) {
		super();
		this.personByType = personByType;
	}

	public Person getPersonByType() {
		return personByType;
	}

	public void setPersonByType(Person personByType) {
		this.personByType = personByType;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
}
