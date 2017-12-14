package pageObject;
import utilities.*;

import org.openqa.selenium.*;
import elementLocators.*;
import myTestData.*;

import static org.junit.Assert.assertEquals;

import org.junit.*;


public class ServSafeHomePageLogin extends BaseClass{
	
	public ServSafeHomePageLogin(WebDriver driver) {
		super(driver);
	}
	
	public ServSafeHomePageLogin ProvideExistingUserInfo() throws Exception {
		
		String ExcelDataUserName = ExcelUtils.getCellData(1, 0);
		 
		String ExcelDataPassword = ExcelUtils.getCellData(1, 2);

		 
		  driver.findElement(ServSafeHomePageLocator.ClickOnTheLoginLink).click();
		 //driver.findElement(ServSafeHomePageLocator.TypeUserName).sendKeys(ServSafeTestData.CorrectUserName);
		  
		  driver.findElement(ServSafeHomePageLocator.TypeUserName).sendKeys(ExcelDataUserName);
		  
		 
		  driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("password");
		  driver.findElement(By.xpath("//input[@id='loginButton']")).click();
		
		
		
		return new ServSafeHomePageLogin(driver);
	}
	
	public ServSafeHomePageLogin LaunchTheWebSite() {
		
		driver.get("https://www.servsafe.com");
		
		return new ServSafeHomePageLogin(driver);
	}
	public ServSafeHomePageLogin VerfiyUserIsLoggedIn() {
		
		assertEquals("ACCOUNT", driver.findElement(By.id("Account-link")).getText());
		
		return new ServSafeHomePageLogin(driver);
	}

}
