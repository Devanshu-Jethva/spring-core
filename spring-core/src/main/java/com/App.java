package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.controller.SessionLoginServlet;

public class App {
	public static void main(String[] args) {

//		SessionLoginServlet sessionLoginServlet = new SessionLoginServlet();
//
//		// login
//		sessionLoginServlet.login();
//		// signup
//		sessionLoginServlet.signup();
//
//		SessionLoginServlet sessionLoginServlet1 = new SessionLoginServlet();
//
//		// login
//		sessionLoginServlet1.login();
//		// signup
//		sessionLoginServlet1.signup();
//
//		System.out.println(sessionLoginServlet);
//		System.out.println(sessionLoginServlet1);

		// this way different users will make different object and it is memory
		// inefficient
		// spring provides way for this
		// it will create only one object and different users will be able to use it
		// which is obviously memory efficient

		// ApplicationContext context = new ClassPathXmlApplicationContext();

		// IoC container will provide use singalton design pattern

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		SessionLoginServlet sls1 = context.getBean("sessionController", SessionLoginServlet.class);
		SessionLoginServlet sls2 = context.getBean("sessionController", SessionLoginServlet.class);
		SessionLoginServlet sls3 = context.getBean("sessionController", SessionLoginServlet.class);

		System.out.println(sls1);
		System.out.println(sls2.toString());
		System.out.println(sls3);

	}
}
