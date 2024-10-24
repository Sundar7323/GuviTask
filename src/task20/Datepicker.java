package task20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver chrome=new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.get("https://jqueryui.com/datepicker/");
		chrome.switchTo().frame(chrome.findElement(By.className("demo-frame"))); //Switching to the frame
		chrome.findElement(By.id("datepicker")).click();
		chrome.findElement(By.xpath("//a[@title=\"Next\"]")).click();
		chrome.findElement(By.xpath("//a[@data-date=\"22\"]")).click();
		Thread.sleep(1000);
		String SelDate=chrome.findElement(By.id("datepicker")).getAttribute("value"); //Printing the selected date in console.
		System.out.println("Date Selected is: " +SelDate);
		chrome.close();
		

	}

}
