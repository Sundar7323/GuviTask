package task16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wikipedia {
	
	public static void main(String[] args) {
		
		WebDriver chrome=new ChromeDriver();
		chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		chrome.manage().window().maximize();
		chrome.get("https://en.wikipedia.org/wiki/Wikipedia");
		chrome.findElement(By.name("search")).sendKeys("Artificial Intelligence");
		chrome.findElement(By.cssSelector("button.cdx-button.cdx-search-input__end-button")).click();		
		chrome.findElement(By.linkText("View history")).click();
		System.out.println(chrome.getTitle());
	}

}
