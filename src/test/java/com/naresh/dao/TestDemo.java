package com.naresh.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.naresh.config.BeanConfig;
import com.naresh.demo.DemoBean;

public class TestDemo {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);
		System.out.println("Started");
		DemoBean obj = ctx.getBean("demoBean", DemoBean.class);
		obj.hello();
		((AnnotationConfigApplicationContext) ctx).close();//stop ioc

	}

}
