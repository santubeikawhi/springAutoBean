package com.jl.spring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Teacher {
	@Autowired
	@Qualifier("person") //解决有两个类似的 bean 在 bean 配置文件中声明。
	public Person personByType;
	@Autowired(required = false)//禁用spring的 依赖检查
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
