package com.naresh.dao;

public class UserDAO {
	
	public UserDAO() {
		System.out.println("UserDAO -> Constructor ");
	}
	
	public void insert() {
		System.out.println("UserDAO->insert : " + this);
	}
}

//UserDAO dao ;// = new UserDAO();
//dao.insert();
