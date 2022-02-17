package com.palmera.utilities;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig() {
		
		File source = new File("./Configuration/config.properties");
		
		try {
			FileInputStream read = new FileInputStream(source);
			pro = new Properties();
			pro.load(read);
		} catch (Exception e) {
			System.out.println("Exception is: "+ e.getMessage());
		}}
	
	
public String getapplication() {
	
	String URL = pro.getProperty("baseURL");
	return URL;
	}
	




public String getpassword() {
	String pass=pro.getProperty("btxtpassword");
	return pass;
	
}

public String getbrowser() {
	String browser=pro.getProperty("browser");
	return browser;
}


}
		
	
	

