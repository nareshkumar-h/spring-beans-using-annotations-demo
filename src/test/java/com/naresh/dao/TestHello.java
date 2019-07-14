package com.naresh.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.naresh.config.BeanConfig;
import com.naresh.demo.HelloBean;

public class TestHello {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);
		System.out.println("Started");
		HelloBean obj =  ctx.getBean("helloBean", HelloBean.class);
		obj.hello();
		((AnnotationConfigApplicationContext) ctx).close();

	}

}
