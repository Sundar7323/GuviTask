package task19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class all_locators {

	public static void main(String[] args) {
		WebDriver chrome=new ChromeDriver();
		chrome.manage().window().maximize();
	//	chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		chrome.get("https://www.guvi.in/register");
		
		//clicking the login link on the right side
		chrome.findElement(By.xpath("//a[@class='login']")).click();
		chrome.navigate().back();
		
		chrome.findElement(By.id("name")).sendKeys("Dinesh");
		chrome.findElement(By.cssSelector("input#email")).sendKeys("testguvi@hotmail.com");
		chrome.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("dineshtest09_");
		chrome.findElement(By.xpath("//input[@class='form-control countrycode-left']")).sendKeys("9098929892");
		chrome.findElement(By.id("signup-btn")).click();
		
	
	}

}
