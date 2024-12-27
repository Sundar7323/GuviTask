package task24;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class basedemoblaze extends utils{
	
	@BeforeSuite
	public void Reports() {
		String path="C:\\Users\\it185\\eclipse-workspace\\seletasks\\reports";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("DemoBlaze report");
		
	    exreport= new ExtentReports();
		exreport.attachReporter(reporter);
	}
	
	@BeforeClass
	public void testdetails() {
		test=exreport.createTest(testName);
	}
	
	@BeforeTest
	public void browserLaunch() {
		launchBrowser();
	}
	
	@AfterTest
	public void closebrowser() {
		closeBrowser();
	}
	@AfterSuite
	public void reportClose() {
		exreport.flush();
	}
}
