package task17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Alert;

public class Snapdeal {
	
	public static void main(String[] args) {
		
		WebDriver chrome=new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		try {
		chrome.get("https://www.demoblaze.com/index.html");
		chrome.findElement(By.id("signin2")).click();
		chrome.findElement(By.id("sign-username")).sendKeys("demosundar11@hotmail.com");
		chrome.findElement(By.id("sign-password")).sendKeys("Radnus");
		chrome.findElement(By.xpath("//button[text()=\"Sign up\"]")).click();
		
		 WebDriverWait wait = new WebDriverWait(chrome, Duration.ofSeconds(10));
         Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println("Pop-up message: " +alert.getText());
		alert.accept();
		}	catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            chrome.quit();
        }
		
	}

}
