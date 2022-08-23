package com.test;

import static org.testng.Assert.assertTrue;

import org.apache.hc.core5.util.Asserts;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;
import com.pageobject.login_pom;
import com.utility.baseclass;
import com.utility.library;



public class test_2 extends baseclass{

	
	@Test
	public void test() {
		
		login_pom login=PageFactory.initElements(driver, login_pom.class);
		
		library.customsendkeys(login.getTxt_email(), excel.getstringdata("Sheet1", 0, 0), "email");
		library.customsendkeys(login.getTxt_pass(), excel.getstringdata("Sheet1", 0, 1), "passward");
		library.custom_click(login.getBut_in());
		
	}
        


}
