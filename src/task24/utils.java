package task24;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class utils {

	public static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest test;
	public String testName;
	ExtentReports exreport;
	
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	
	
}
