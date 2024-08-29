package task17;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {
	
	public static void main(String[] args) {
		
		WebDriver chrome=new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		chrome.get("http://www.snapdeal.com");
		
	}

}
