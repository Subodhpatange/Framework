package com.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {
	 public static WebDriver driver;
	 public static Exceldataprovider excel;
	 public static configdataprovider config;
	 
@BeforeSuite

public void BS() throws Exception {
	
	 excel=new Exceldataprovider();
	 config=new configdataprovider();
}
@Parameters({"browser"})
@BeforeMethod
public void setup(String browser) {
	if(browser.equalsIgnoreCase("chrome")) {
	WebDriverManager.chromedriver().setup();
    driver =new ChromeDriver();}
	else if(browser.equalsIgnoreCase("edg")) {
		WebDriverManager.edgedriver().setup();
	    driver =new EdgeDriver();
	}
	driver.get(config.getbaseurl_QA2());
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
@AfterMethod
public void AM() {
 //driver.close();
}

}

