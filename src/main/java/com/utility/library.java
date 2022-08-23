package com.utility;

import javax.swing.text.Element;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class library {
	public static ExtentTest test;

	public static void customsendkeys(WebElement element,String value,String fieldname) {
		try {
	element.sendKeys(value);
	test.log(Status.PASS, fieldname+"=value successfully send"+value);
	}catch (Exception e) {
		test.log(Status.FAIL, e.getMessage());
		System.out.println(e.getMessage());
	}
		
		}
	public static void custom_click(WebElement element) {
		try {
		element.click();
	
	}catch (Exception c) {
	
		// TODO: handle exception
		System.out.println(c.getMessage());}
	}
}
