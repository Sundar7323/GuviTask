package task24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	WebDriver driver;
	
	public Login(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login2") WebElement Loginpg;
	@FindBy(id="loginusername") WebElement Loginuname;
	@FindBy(id="loginpassword") WebElement Loginpsw;
	@FindBy(xpath="//button[@onclick=\"logIn()\"]") WebElement Clicklogin;
	
	public void click() {
		Loginpg.click();
	}
	public void GetDataLogin(String Loguname,String Logpsw) {
		Loginuname.sendKeys(Loguname);
		Loginpsw.sendKeys(Logpsw);
	}
	
	public void submit() {
		Clicklogin.click();	
	}
	
	
	
}
