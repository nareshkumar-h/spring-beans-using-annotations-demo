package com.naresh.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.naresh.dao.AccountDAO;
import com.naresh.dao.TransactionDAO;
import com.naresh.dao.UserDAO;
import com.naresh.demo.HelloBean;

@Configuration
public class BeanConfig {

	@Bean
	//@Scope(scopeName = "singleton")
	@Scope(scopeName = "prototype")
	public UserDAO userDAO() {
		UserDAO userDAO = new UserDAO();
		return userDAO;
	}
	
	//constructor based injection
	@Bean
	public AccountDAO accountDAO(DataSource dataSource) {
		AccountDAO accountDAO = new AccountDAO(dataSource);
		return accountDAO;
	}
	
	@Bean
	public DataSource dataSource() {
		BasicDataSource ds = new BasicDataSource();		
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		ds.setUrl("jdbc:oracle:thin:@trainingdb.cmqwe8vrjnur.us-east-1.rds.amazonaws.com:1521:orcl");
		ds.setUsername("naresh");
		ds.setPassword("password");
		return ds;
	}
	
	//setter based injection
	@Bean
	public TransactionDAO transactionDAO() {
		TransactionDAO transactionDAO = new TransactionDAO();
		transactionDAO.setName("naresh");
		return transactionDAO;
	}
	
	//Lifecycle - callback methods
	@Bean
	public HelloBean helloBean() {
		HelloBean bean = new HelloBean();
		return bean;
	}
	
}
