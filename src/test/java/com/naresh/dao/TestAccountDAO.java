package com.naresh.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.naresh.config.BeanConfig;

public class TestAccountDAO {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);
		System.out.println("Started");
		AccountDAO accountDAO = (AccountDAO) ctx.getBean("accountDAO");
		accountDAO.insert();
		AccountDAO accountDAO2 = (AccountDAO) ctx.getBean("accountDAO");
		accountDAO2.insert();

	}

}
