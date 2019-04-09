package com.neuedu.test;

public class Test2 {

	String[] usernames;
	String[] password;
	
	public Test2() {
		usernames = new String[] {"hello"};
		password = new String[] {"123456"};
	}
	public boolean checkUser(String username,String password) {
		for(int i = 0;i<username.length();i++) {
			if(usernames[i].equals(username) && this.password[i].equals(password)) {
				return true;
			}
		}
		return false;
	}

}