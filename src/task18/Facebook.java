package task18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		
		WebDriver chrome=new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		chrome.get("https://www.facebook.com/");
		chrome.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		chrome.findElement(By.name("firstname")).sendKeys("Karthk");
		chrome.findElement(By.name("lastname")).sendKeys("Kumar");
		chrome.findElement(By.name("reg_email__")).sendKeys("testuser@yahoo.com");
		chrome.findElement(By.name("reg_passwd__")).sendKeys("Qwerty123456");
		
		WebElement Day=chrome.findElement(By.name("birthday_day"));
		Select Daydwn=new Select(Day);
		Daydwn.selectByVisibleText("11");
		
		WebElement Mon=chrome.findElement(By.name("birthday_month"));
		Select Mondwn=new Select(Mon);
		Mondwn.selectByIndex(4);
		
		WebElement Year=chrome.findElement(By.name("birthday_year"));
		Select Yeardwn=new Select(Year);
		Yeardwn.selectByVisibleText("1985");
		
		chrome.findElement(By.xpath("//label[text()=\"Female\"]")).click();
		chrome.findElement(By.name("websubmit")).click();
		

	}

}
