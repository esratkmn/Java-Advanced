package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context= 
				new AnnotationConfigApplicationContext(IocConfig.class);
		
		ICustomerService customerService=context.getBean("service",ICustomerService.class);//ICustomerDal dal için database de ne yazýyorsa veriyorsa onu new le ver demek 
		customerService.add();
		
		
//CustomerManager manager=  new CustomerManager(context.getBean("database",ICustomerDal.class));
	//	manager.add();
	

	}

}
