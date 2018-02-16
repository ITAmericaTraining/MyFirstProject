package verifylinks;
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
import org.openqa.selenium.interactions.Actions;

public class Verify_Links {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	
	@Before 
	public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "C://Users/owner/Desktop/chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    baseUrl = "https://kathmanduyogi.com/";
    
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
	 @Test
	  public void testUntitled() throws Exception {
		  driver.get(baseUrl + "/");  
		  driver.findElement(By.xpath("//a[contains(.,'About Us')]")).click();
		  driver.findElement(By.xpath("//a[contains(.,'Meditation Cushions')]")).click();
		  driver.findElement(By.xpath("//a[contains(.,'Meditation Beads')]")).click();
		  driver.findElement(By.xpath("//a[contains(.,'Yoga Bags')]")).click();
		  driver.findElement(By.xpath("//a[contains(.,'Accessories')]")).click();
		  driver.findElement(By.xpath("//a[contains(.,'Shop')]")).click();
		  driver.findElement(By.xpath("//a[contains(.,'CONTACT')]")).click();
		  driver.findElement(By.xpath("//strong[contains(.,'(312) 405-0722')]"));
		  driver.findElement(By.cssSelector("span")).click();
		  driver.findElement(By.xpath("//a[@class='button-social-login button-social-login-google']")).click();
		  //driver.findElement(By.linkText("Log in with Google")).click();
		  driver.findElement(By.xpath("//input[@type='email']")).sendKeys("soulsameer2008@gmail.com");
		  driver.findElement(By.xpath("//span[contains(.,'Next')]")).click();
		  driver.findElement(By.xpath("//input[@aria-label='Enter your password']")).sendKeys("Shrestha91");
		  driver.findElement(By.xpath("//span[contains(.,'Next')]")).click();
		 /* Actions a = new Actions(driver);
		  a.click(driver.findElement(By.xpath("//a[contains(.,'Logout')]")));
		  a.build();
		  a.perform();*/
		  
		  driver.findElement(By.xpath("//a[contains(.,'Logout')]")).click();
		  
		  //driver.findElement(By.xpath("//a[contains(@href,'https://kathmanduyogi.com/my-account/customer-logout/')]")).click();
		  //driver.findElement(By.xpath("//a[contains(.,'Confirm and log out')]")).click();
		
		  //driver.findElement(By.xpath("//a[contains(.,'Logout')]")).click();
		  
		  
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
	  //testing the comparision..

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







