package com.utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.github.dockerjava.api.model.Driver;


public  class listeners extends baseclass implements ITestListener {
	
	ExtentReports extent=Extentreporgenerator.getreport();
	ThreadLocal<ExtentTest> extenttest=new ThreadLocal<ExtentTest>();
	
	
	public void onTestStart(ITestResult result) {
		library.test=extent.createTest(result.getTestClass().getName()+"=="+result.getMethod().getMethodName());
		extenttest.set(library.test);
		extenttest.get().addScreenCaptureFromBase64String(getcapture());
	}

	public void onTestSuccess(ITestResult result) {
		extenttest.get().log(Status.PASS, "Test is pass");
		extenttest.get().addScreenCaptureFromBase64String(getcapture());
		
	}

	public void onTestFailure(ITestResult result) {
		extenttest.get().log(Status.FAIL, "Test is fail");
		extenttest.get().addScreenCaptureFromBase64String(getcapture());
	}

	public void onTestSkipped(ITestResult result) {
		extenttest.get().log(Status.SKIP, "Test is skip");
		
	}

	public void onFinish(ITestContext context) {
		extent.flush();
	}
	public static String getcapture() {
		TakesScreenshot ts=(TakesScreenshot) driver;
		return ts.getScreenshotAs(OutputType.BASE64);
	}
}
