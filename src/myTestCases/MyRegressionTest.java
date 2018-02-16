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
		
		// my name is ben.
<<<<<<< HEAD
=======

>>>>>>> d9edfb248b2ca5416e821b03f1d929249c2ad614
	// testing this code.
<<<<<<< HEAD
//<<<<<<< HEAD

//=======
//hello 
//=======
//>>>>>>> 81844a52ca92dc62a421a0b2323ae5f0bed88b0f
=======
>>>>>>> 4d83d076f5d734d3128918c5cda1b50d35531887
	//I am enjoying the github session.
<<<<<<< HEAD
//>>>>>>> 24e6630039ea0f0b34c3573e226782caaa624726
		
=======

	// editing and uodating the stuffs//
	
	
	//mama mia loving it.

>>>>>>> d9edfb248b2ca5416e821b03f1d929249c2ad614
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
		  @Test
		  public void MythirdTest()  throws Exception {
			  ServSafeHomePageLogin testLoginFeature = new ServSafeHomePageLogin(driver);
			  testLoginFeature= testLoginFeature.LaunchTheWebSite();
			  
			  testLoginFeature= testLoginFeature.ProvideExistingUserInfo();
			  testLoginFeature= testLoginFeature.VerfiyUserIsLoggedIn();
		  }
				
		  }
		  
		  @Test
		  public void TestForHimaBranch() throws Exception {
			  // nothing goes here
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
