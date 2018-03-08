package com.jl.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jl.spring.model.Customer;
import com.jl.spring.model.Teacher;
import com.jl.spring.model.Worker;

/**   
* @Title: Webapp_autowired.java ʹ�� context:annotation-config ʵ��bean�Զ�װ��
* @Package com.jl.spring.app 
* @Description: TODO
* @author jiangl  
* @date 2018��3��8�� ����8:58:42 
* @version V1.0   
*/
public class Webapp_autowired {
	public static void main(String args[]){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring_autowired.xml");
		Customer customer = (Customer)applicationContext.getBean("customer");
		Teacher teacher = (Teacher)applicationContext.getBean("teacher");
		Worker worker = (Worker)applicationContext.getBean("worker");
		System.out.println("customer(autowired):"+customer.getPerson().name);
		System.out.println("teacher(autowired):"+teacher.getPersonByType().name);
		System.out.println("worker(autowired):"+worker.getPerson().name);
	}
}
