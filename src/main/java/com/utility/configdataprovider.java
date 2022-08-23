package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class configdataprovider {
	Properties pro;
	public configdataprovider () throws Exception{
		String path="C:\\Users\\user\\eclipse-workspace\\framework\\config\\config.properties";
		FileInputStream file=new FileInputStream(path);
		 pro=new Properties();
		 pro.load(file);
	}
	public String getbaseurl_QA1() {
		return pro.getProperty("baseurl_QA1");
	}
	public String getbaseurl_QA2() {
		return pro.getProperty("baseurl_QA2");
	}
	}

