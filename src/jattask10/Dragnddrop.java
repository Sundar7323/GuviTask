package jattask10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragnddrop {
	public static void main(String[] args) {
		WebDriver chrome=new ChromeDriver();
		chrome.manage().window().maximize();
		//chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		chrome.get("https://jqueryui.com/droppable/");
		chrome.switchTo().frame(chrome.findElement(By.className("demo-frame")));
		WebElement Drag=chrome.findElement(By.id("draggable"));
		WebElement Drop=chrome.findElement(By.id("droppable"));
		
		Actions Act=new Actions(chrome);
		Act.dragAndDrop(Drag, Drop).build().perform();
		
		//VERIFYING THE TEXT IN THE CONSOLE
		 String droppedText = Drop.getText();
	        if (droppedText.equals("Dropped!")) {
	            System.out.println("Drag and drop successful!");
	        } else {
	            System.out.println("Drag and drop failed.");
	        }
	}

}
