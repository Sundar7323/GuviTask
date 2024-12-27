package task24;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC1Signuptestclass extends basedemoblaze{

	Signup Signup;
	
	@BeforeTest
	public void setup() {
		Signup=new Signup(driver);
		testName="Sign-in";
		}
	
	@Test(priority=1)
	public void Signup() {
		Signup.click();
		Signup.EnterData("Pradeep0800@gmail.com", "Sundar007");
		Signup.submit();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();
		}	
}
