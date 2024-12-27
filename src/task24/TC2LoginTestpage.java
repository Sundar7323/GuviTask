package task24;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC2LoginTestpage extends basedemoblaze{
	
	
	@BeforeTest
	public void Beforetesting() {
			testName="Login Test";
	}
	
	@Test(priority=2)
	public void Login() {
		Login lp=new Login(driver);
		lp.click();
		lp.GetDataLogin("Pradeep0800@gmail.com", "Sundar007");
		lp.submit();
		//String Title=driver.getTitle();
		//System.out.println(Title);
		String ExpectedTitle="STORE";
		String ActualTitle=driver.getTitle();
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		}	
}
