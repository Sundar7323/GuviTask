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
		
		//ID:
		chrome.findElement(By.id("name")).sendKeys("Dinesh");
		//CSS Selector
		chrome.findElement(By.cssSelector("input#email")).sendKeys("testguvi@hotmail.com");
		//XPATH
		chrome.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("dineshtest09_");
		
		
		chrome.findElement(By.tagName("input")).sendKeys("9098929892");
		//CLASS NAME
		//chrome.findElement(By.className("btn signup-btn")).click();
	
	}

}
