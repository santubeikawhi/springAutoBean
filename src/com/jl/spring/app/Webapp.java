package com.jl.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jl.spring.model.Customer;
import com.jl.spring.model.Student;
import com.jl.spring.model.Teacher;

public class Webapp {
	public static void main(String args[]){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");
		//根据ref 方式自动装配customer的person属性
		Customer customer = (Customer)applicationContext.getBean("customer");
		//根据autowire = byName 方式 自动装配student的person属性
		Student student = (Student)applicationContext.getBean("student");
		//根据autowire = byType 方式自动装配teacher的person属性
		Teacher teacher = (Teacher)applicationContext.getBean("teacher");
		//根据autowire = constructor 方式自动装配teacher_constructor 的person 属性
		Teacher teacher_constructor = (Teacher)applicationContext.getBean("teacher_constructor");
		//根据autowire = autotdetect  方式先根据构造函数搜索person属性，若没有再根据 type 类搜索person属性
		Teacher teacher_autodetect = (Teacher)applicationContext.getBean("teacher_autodetect");
		System.out.println("customer(ref):"+customer.getPerson().getName());
		System.out.println("student(byName):"+student.getPerson().getName());
		System.out.println("teacher(byType):"+teacher.getPersonByType().getName());
		System.out.println("teacher_constructor(constructor):"+teacher_constructor.getPersonByType().getName());
		System.out.println("teacher_autodetect(autodetect):"+teacher_autodetect.getPersonByType().getName());
	}
}
