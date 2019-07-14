package com.naresh.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloBean implements InitializingBean, DisposableBean {

	public void destroy() throws Exception {
		System.out.println("HelloBean->destroy");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("HelloBean->afterPropertiesSet");
	}

	public void hello() {
		System.out.println("HelloBean->hello");
	}

}
