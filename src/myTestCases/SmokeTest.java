package myTestCases;

import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;
import pageObject.*;
import utilities.Constant;
import utilities.ExcelUtils;


public class SmokeTest {
	
	
	
	  private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @Before
	  public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C://Users/rajes/Downloads/chromedriver_win32/chromedriver.exe");
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
		 
	    driver = new ChromeDriver();
	    baseUrl = "https://www.servsafe.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void MyFirstTest() throws Exception {
	 
	  ServSafeHomePageLogin testLoginFeature = new ServSafeHomePageLogin(driver);
	  testLoginFeature= testLoginFeature.LaunchTheWebSite();
	  
	  testLoginFeature= testLoginFeature.ProvideExistingUserInfo();
	  testLoginFeature= testLoginFeature.VerfiyUserIsLoggedIn();
		
	    
	    
	 }
	  @Test
	  public void MySecodTest()  throws Exception {
		  ServSafeHomePageLogin testLoginFeature = new ServSafeHomePageLogin(driver);
		  testLoginFeature= testLoginFeature.LaunchTheWebSite();
		  
		  testLoginFeature= testLoginFeature.ProvideExistingUserInfo();
		  testLoginFeature= testLoginFeature.VerfiyUserIsLoggedIn();
			
	  }
	  @Test
	  public void ErroredTest() throws Exception {
		  
		  driver.get("https://www.google.com");
		    driver.manage().window().maximize();
		    assertEquals("Google", driver.getTitle());
		    driver.findElement(By.cssSelector("a.gb_b.gb_cc")).click();
		    driver.findElement(By.cssSelector("#gb36 > span.gb_2")).click();
		    assertEquals("YouTube", driver.getTitle());
		    driver.findElement(By.id("text")).click();
		    assertEquals("YouTube", driver.getTitle());
		    /*driver.findElement(By.name("hiddenPassword")).clear();
		    driver.findElement(By.name("hiddenPassword")).sendKeys("password");
		    driver.findElement(By.id("identifierId")).clear();*/
		    driver.findElement(By.id("identifierId")).sendKeys("poojabom40@gmail.com");
		    driver.findElement(By.xpath("//div[@aria-haspopup='true']")).click();
		    /*driver.switchTo().frame(driver.findElement(By.name("iFrameTitle")));
		    assertEquals("Create your Google Account", driver.getTitle());*/
		    // adding to test
		 
		  }
		  
		  
		  
	  

	  @After
	  public void tearDown() throws Exception {
	    //driver.quit();
		  driver.close();
		  
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	  
	  
	 /* private boolean isElementPresent(By by) {
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
	      acceptNextAlert = true;*/
	    
	  
	}


	
	
	
	
	


