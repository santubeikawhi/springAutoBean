package com.jl.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jl.spring.model.Customer;
import com.jl.spring.model.Teacher;

/**   
* @Title: Webbapp_autowired_bean.java spring使用autowired自动装配
* @Package com.jl.spring.app 
* @Description: TODO
* @author jiangl  
* @date 2018年3月8日 下午8:54:22 
* @version V1.0   
*/
public class Webbapp_autowired_bean {
	public static void main(String args[]){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring_autowired_bean.xml");
		Customer customer = (Customer)applicationContext.getBean("customer");
		Teacher teacher = (Teacher)applicationContext.getBean("teacher");
		System.out.println("customer(autowired):"+customer.getPerson().name);
		System.out.println("teacher(autowired):"+teacher.getPersonByType().name);
	}
}
