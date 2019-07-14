package com.naresh.dao;

public class TransactionDAO {

	private String name;
	
	public void setName(String name) {
		System.out.println("TransactionDAO- setter based injection");
		this.name = name;
	}
	
	public void insert() {
		System.out.println("TransactionDAO->insert : " + this);
	}


	
}

//String name="naresh";
//TransactionDAO dao = new TransactionDAO();
//dao.setName(name);

