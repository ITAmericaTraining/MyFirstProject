package myTestCases;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Returns {
	
	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","D://IT America/Automation/chromedriver.exe");
		driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void returns() throws Exception{
		baseUrl = "https://kathmanduyogi.com/shipping-returns-policy/";
		driver.get(baseUrl);
		
		WebElement returns, add;
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		
		add = driver.findElement(By.className("et_bloom_close_button"));
		add.click();
		
		returns = driver.findElement(By.xpath("//a[contains(.,'RETURN')]"));
		returns.click();
		
		assertTrue(checkPresense("Shipping and Returns Policy"));
		assertTrue(checkPresense("15 days"));
		assertTrue(checkPresense("Himavanth"));
		
	}
	
	private boolean checkPresense(String Presense) {
		// TODO Auto-generated method stub
		try{
			boolean b = driver.getPageSource().contains(Presense);
			if(b){
				System.out.println(Presense +" is present");
			}else{
				System.out.println(Presense +" is Not present");
			}
		}catch(Exception e){
			return false;
		}
		return true;
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
