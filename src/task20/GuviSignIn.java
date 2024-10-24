package task20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.junit.*;


public class GuviSignIn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver chrome=new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		chrome.get("https://www.guvi.in/");
		chrome.findElement(By.xpath("//a[@class=\"bg-green-500 hover:bg-green-600 text-white font-normal py-2 px-4 rounded text-base min-h-8 h-8 align-middle mr-2\"]")).click();
		//Using Dummy details 
		chrome.findElement(By.id("name")).sendKeys("Pradeep");
		chrome.findElement(By.id("email")).sendKeys("praddeep21363@gmail.com");
		chrome.findElement(By.id("password")).sendKeys("Pradeep_022002");
		chrome.findElement(By.id("mobileNumber")).sendKeys("8934207343");
		chrome.findElement(By.id("signup-btn")).click();
	    Thread.sleep(2000);
		chrome.findElement(By.id("laterBtn")).click();
		Thread.sleep(2000);
		String signtext=chrome.findElement(By.xpath("//h1")).getText(); //Using Get text method to get the text
		System.out.println("User Register verification: "+signtext);
		Thread.sleep(1000);
		chrome.findElement(By.xpath("//a[@class='navbar-guvilogo-black']")).click();
		chrome.findElement(By.id("login-btn")).click();
		chrome.findElement(By.id("email")).sendKeys("textmesundar@gmail.com");
		chrome.findElement(By.id("password")).sendKeys("Sundar@007");
		chrome.findElement(By.id("login-btn")).click();
		Thread.sleep(2000);
		//Getting the title
		String title=chrome.getTitle();
		System.out.println("Title of the current Page is: " +title); //Printing the current page title
		Assert.assertEquals(title, "GUVI | courses");
		chrome.close();

	
		
		
		
		

	}

}
