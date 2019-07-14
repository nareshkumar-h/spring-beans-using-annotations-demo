package com.naresh.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.naresh.config.BeanConfig;

public class TestUserDAO {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);
		System.out.println("Started");
		UserDAO userDAO = ctx.getBean("userDAO", UserDAO.class); // new UserDAO();
		userDAO.insert();
		UserDAO userDAO2 = ctx.getBean("userDAO", UserDAO.class);
		userDAO2.insert();

		System.out.println("Completed");
	}

}
