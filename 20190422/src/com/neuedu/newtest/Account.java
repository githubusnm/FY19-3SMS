package com.neuedu.newtest;

import java.io.Serializable;

public class Account implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private transient String password;
	String getUsername() {
		return username;
	}
	void setUsername(String username) {
		this.username = username;
	}
	String getPassword() {
		return password;
	}
	void setPassword(String password) {
		this.password = password;
	}
	public Account(String username, String password) {
		this.username = username;
		this.password = password;
	}
	public Account() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Account [username=" + username + ", password=" + password + "]";
	}
	
	
}
