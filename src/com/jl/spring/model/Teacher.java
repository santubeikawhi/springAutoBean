package com.jl.spring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Teacher {
	@Autowired
	@Qualifier("person") //������������Ƶ� bean �� bean �����ļ���������
	public Person personByType;
	@Autowired(required = false)//����spring�� �������
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
