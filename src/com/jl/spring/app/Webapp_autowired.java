package com.jl.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jl.spring.model.Customer;
import com.jl.spring.model.Teacher;

public class Webapp_autowired {
	public static void main(String args[]){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring_autowired.xml");
		Customer customer = (Customer)applicationContext.getBean("customer");
		Teacher teacher = (Teacher)applicationContext.getBean("teacher");
		System.out.println("customer(autowired):"+customer.getPerson().name);
		System.out.println("teacher(autowired):"+teacher.getPersonByType().name);
	}
}
