package com.naresh.demo;

public class DemoBean {

	public void customInit() {
		System.out.println("DemoBean - init");
	}
	
	public void customDestroy() {
		System.out.println("DemoBean - destroy");
	}
	

	public void hello() {
		System.out.println("DemoBean->hello");
	}

}
