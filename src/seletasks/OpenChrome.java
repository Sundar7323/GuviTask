package seletasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.cssSelector("textarea.gLFyf")).sendKeys("Selenium Browser Driver");
		driver.findElement(By.id("jZ2SBf")).click();

	}

}
