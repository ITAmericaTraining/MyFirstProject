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

public class FindMortgageRate {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	
	@Before
	public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "C://Users/owner/Desktop/chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    baseUrl = "https://www.guaranteedrate.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
	 @Test
	  public void testUntitled() throws Exception {
		  driver.get(baseUrl + "/");
		  driver.findElement(By.xpath("//a[@title='Explore Loan Options']")).click();
		  driver.findElement(By.xpath("//button[contains(.,'I want to buy a home')]")).click();
		  driver.findElement(By.xpath("//button[contains(.,'Home to live in')]")).click();
		  driver.findElement(By.xpath("//button[contains(.,'Single family home')]")).click();
		  driver.findElement(By.xpath("//input[@id='Zipcode']")).sendKeys("21239");
		  driver.findElement(By.xpath("//li[contains(.,'Baltimore City, MD')]")).click();
		  driver.findElement(By.xpath("//button[contains(.,'Next')]")).click();
		  driver.findElement(By.xpath("//button[@data-value='20+ Yr']")).click();
		  driver.findElement(By.xpath("//input[@id='PurchasePrice']")).sendKeys("250,000");
		  driver.findElement(By.xpath("//input[@id='DownPayment']")).sendKeys("10,000");
		  driver.findElement(By.xpath("//button[contains(.,'Next')]")).click();
		  driver.findElement(By.xpath("//button[contains(.,'Yes')]")).click();
		  driver.findElement(By.xpath("//button[contains(.,'No')]")).click();
		  driver.findElement(By.xpath("//button[contains(.,'Lowest interest rate')]")).click();
		  driver.findElement(By.xpath("//button[@data-value='average']")).click();
		  driver.findElement(By.xpath("//button[contains(.,'No')]")).click();
		  driver.findElement(By.xpath("//h1[contains(.,'Here are your personalized results')]"));
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


