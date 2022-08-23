package com.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extentreporgenerator {
	public static ExtentReports extent;
	public static ExtentReports getreport() {
		String path="C:\\Users\\user\\eclipse-workspace\\framework\\reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Automation Test Report");
		reporter.config().setReportName("Facebook login");
		reporter.config().setTheme(Theme.DARK);
		
	    extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("project name", "Automation Test Freamwork");
		extent.setSystemInfo("module name", "facebook login");
		extent.setSystemInfo("exticuted by", "tejas patange");
		extent.setSystemInfo("selenium version", "4.3.0");
		return extent;
	}
}
