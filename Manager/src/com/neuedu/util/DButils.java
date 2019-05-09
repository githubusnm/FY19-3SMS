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
	
	//��������ļ��е�URL
	private static final String URL = prop.getProperty("url");
	
	//��������ļ��е��û���
	private static final String USERNAME = prop.getProperty("username");
	
	//��������ļ��е�����
	private static final String PASSWORD = prop.getProperty("password");
	
	//��ȡ��Դ
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
