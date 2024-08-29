package task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoblaze {

	public static void main(String[] args) {
		WebDriver chrome=new ChromeDriver();
		chrome.manage().window().maximize();
		chrome.get("https://www.demoblaze.com/");
		String a= chrome.getTitle();
		System.out.println(a);
		String expectedtitle = "STORE";
		if(a.equals(expectedtitle)){
		System.out.println("Page Landed on Correct website");
		}
		else {
		System.out.println("Page Not Landed on Correct website");
		}

	}

}
