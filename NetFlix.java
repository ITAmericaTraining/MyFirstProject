package myTestCases;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObjectPractice.*;

public class NetFlix {
	
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	
	@Before
	public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "C://Users/souls/Desktop/chromedriver.exe");
    driver = new ChromeDriver();
    baseUrl = "https://www.netflix.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
	 @Test
	  public void MyFirstTest() throws Exception {
		 NetFlixLogin testLoginFeature = new NetFlixLogin(driver); //creating object (instance of class)//
		  // meaning whatever method is inside the class NetFlixLogin I am bringing here and activating and using by object creation//
		 testLoginFeature.LaunchTheWebsite();
		 testLoginFeature.ProvideUserInfo();
		 testLoginFeature.VerifyUserIsLoggedIn();
		 
		 
		 
		 
		 
		  //driver.get(baseUrl + "/");
		  //driver.findElement(By.xpath("//a[@href='/login']")).click();
		  //driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Soulsameer2008@gmail.com");
		  //driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Truman1985");
		  //driver.findElement(By.xpath("//button[contains(.,'Sign In')]")).click();
	  }
	 @Test
	 public void MySecondTest() throws Exception {
		 driver.get("http://www.facebook.com");
		 //driver.navigate().to("http://www.facebook.com");
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("soulsameer2008@gmail.com");
		 driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Shrestha91");
		 driver.findElement(By.xpath("//input[@value='Log In']")).click();
		 
	 }
	 @Test
	 public void TryTheFailingTest(){
		 NetFlixLogin testing = new NetFlixLogin(driver);
		 testing.LaunchTheWebsite();
		 testing.ProvideUserInfo();
		 
		 testing = testing.LaunchTheWebsite();
		 
		 
	 }

	  @After
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }
	  
	  private boolean isAlertPresent() {
		    try {
		      driver.switchTo().alert();
		      return true;
		    } catch (NoAlertPresentException e) {
		      return false;
		    }
		  }

		  private String closeAlertAndGetItsText() {
		    try {
		      Alert alert = driver.switchTo().alert();
		      String alertText = alert.getText();
		      if (acceptNextAlert) {
		        alert.accept();
		      } else {
		        alert.dismiss();
		      }
		      return alertText;
		    } finally {
		      acceptNextAlert = true;
		    }
		  }
}




