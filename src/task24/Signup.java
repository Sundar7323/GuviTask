package task24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup {

	WebDriver driver;
	public Signup(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="signin2")
	WebElement signin;
	@FindBy(id ="sign-username")
	WebElement username;
	@FindBy(id ="sign-password")
	WebElement password;
	@FindBy(xpath ="//button[@onclick=\"register()\"]")	
	WebElement ClickSignin;
	
	public void click() {
		signin.click();
	}
	
	public void EnterData(String uname,String psw) {
		username.sendKeys(uname);
		password.sendKeys(psw);
	}
	public void submit() {
		ClickSignin.click();
	}
}
