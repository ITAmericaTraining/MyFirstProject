package myTestCases;

import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObject.ServSafeHomePageLogin;
import utilities.Constant;
import utilities.ExcelUtils;

public class MyRegressionTest {
		
		
		
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
		  public void testSecondTest() throws Exception{
			  
			  driver.get("https://www.google.com");
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

		  @After
		  public void tearDown() throws Exception {
		    //driver.quit();
		    String verificationErrorString = verificationErrors.toString();
		    if (!"".equals(verificationErrorString)) {
		      fail(verificationErrorString);
		    }
		  }
		
		
		
		
		



}
