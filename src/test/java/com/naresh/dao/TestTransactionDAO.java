package com.naresh.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.naresh.config.BeanConfig;

public class TestTransactionDAO {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);
		System.out.println("Started");
		TransactionDAO transactionDAO = (TransactionDAO) ctx.getBean("transactionDAO");
		transactionDAO.insert();

	}

}
