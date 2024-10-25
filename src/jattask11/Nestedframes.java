package jattask11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nestedframes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver chrome=new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.get("http://the-internet.herokuapp.com/nested_frames");
		
		//Switching to the top Frame using WebElement
		WebElement frametop=chrome.findElement(By.xpath("//frame[@src=\"/frame_top\"]"));
		chrome.switchTo().frame(frametop);
		
		List<WebElement> frameele=chrome.findElements(By.tagName("frame"));
		//To Find the number of frames in top frame.
		int sizeofframe=frameele.size();
		System.out.println(sizeofframe);
		
		//Switching to the left frame
		chrome.switchTo().frame(0);
		String leftframe=chrome.findElement(By.xpath("//body")).getText();
		System.out.println(leftframe);
		
		chrome.switchTo().parentFrame();
		
		//Switching to the Middle frame
		chrome.switchTo().frame(1);
		String middleframe=chrome.findElement(By.id("content")).getText();
		System.out.println(middleframe);
		
		chrome.switchTo().parentFrame();
		
		//Switching to the right frame
		chrome.switchTo().frame(2);
		String rightframe=chrome.findElement(By.xpath("//body")).getText();
		System.out.println(rightframe);
		
		chrome.switchTo().defaultContent();
		
		//Switching to the bottom frame
		chrome.switchTo().frame(1);
		String bottomframe=chrome.findElement(By.xpath("//body")).getText();
		System.out.println(bottomframe);
	}

}
