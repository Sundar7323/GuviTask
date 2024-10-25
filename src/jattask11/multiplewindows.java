package jattask11;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplewindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver chrome=new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.get("https://the-internet.herokuapp.com/windows");
		chrome.findElement(By.linkText("Click Here")).click();
		
		Set<String> windowHandles=chrome.getWindowHandles();
		System.out.println(windowHandles);
		
		//To switch to the new Window/tab
		List<String> list=new ArrayList<String>(windowHandles);
		chrome.switchTo().window(list.get(1));
		//Verifying the code is in the new window
		String text=chrome.findElement(By.xpath("//h3")).getText();
		System.out.println("The Code/script is in the " +text);
		chrome.close();
		
		chrome.switchTo().window(list.get(0));
		//Verifying the code is back to the first window
		String text1=chrome.findElement(By.xpath("//h3")).getText();
		System.out.println("The Code/script is back to " +text1);
	
	}

}
