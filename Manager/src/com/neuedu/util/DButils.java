package com.neuedu.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DButils {

	private static Properties prop;
	
	static { 
		prop = new Properties();
		try {
			prop.load(DButils.class.getResourceAsStream("/settings.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//获得配置文件中的URL
	private static final String URL = prop.getProperty("url");
	
	//获得配置文件中的用户名
	private static final String USERNAME = prop.getProperty("username");
	
	//获得配置文件中的密码
	private static final String PASSWORD = prop.getProperty("password");
	
	//获取来源
	public static Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
	
	
}
