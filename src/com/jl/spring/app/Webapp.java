package com.jl.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jl.spring.model.Customer;
import com.jl.spring.model.Student;
import com.jl.spring.model.Teacher;

public class Webapp {
	public static void main(String args[]){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");
		//����ref ��ʽ�Զ�װ��customer��person����
		Customer customer = (Customer)applicationContext.getBean("customer");
		//����autowire = byName ��ʽ �Զ�װ��student��person����
		Student student = (Student)applicationContext.getBean("student");
		//����autowire = byType ��ʽ�Զ�װ��teacher��person����
		Teacher teacher = (Teacher)applicationContext.getBean("teacher");
		//����autowire = constructor ��ʽ�Զ�װ��teacher_constructor ��person ����
		Teacher teacher_constructor = (Teacher)applicationContext.getBean("teacher_constructor");
		//����autowire = autotdetect  ��ʽ�ȸ��ݹ��캯������person���ԣ���û���ٸ��� type ������person����
		Teacher teacher_autodetect = (Teacher)applicationContext.getBean("teacher_autodetect");
		System.out.println("customer(ref):"+customer.getPerson().getName());
		System.out.println("student(byName):"+student.getPerson().getName());
		System.out.println("teacher(byType):"+teacher.getPersonByType().getName());
		System.out.println("teacher_constructor(constructor):"+teacher_constructor.getPersonByType().getName());
		System.out.println("teacher_autodetect(autodetect):"+teacher_autodetect.getPersonByType().getName());
	}
}
