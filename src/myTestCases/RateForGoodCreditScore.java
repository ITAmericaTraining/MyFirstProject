package myTestCases;

import static org.junit.Assert.assertSame;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RateForGoodCreditScore {
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
	public void rateForGoodCreditScore() throws Exception{
		baseUrl = "https://www.guaranteedrate.com/";
		driver.get(baseUrl);
		
		WebElement explore, buyHome, home2Liv, singleF, zip, nxt, yrs, pp, fBuyer, noBtn, lowInterest, cScore;
		
		explore = driver.findElement(By.xpath("//a[@data-track='progressiveHeroMod-explore']"));
		explore.click();
		
		buyHome = driver.findElement(By.xpath("//button[@data-value='purchase']"));
		buyHome.click();
		
		home2Liv = driver.findElement(By.xpath("//button[@data-value='primary-residence']"));
		home2Liv.click();
		
		singleF = driver.findElement(By.xpath("//button[@data-value='single-family']"));
		singleF.click();
		
		zip = driver.findElement(By.xpath("//input[@id='Zipcode']"));
		Thread.sleep(5000);
		zip.sendKeys("60008");
		
		nxt = driver.findElement(By.xpath("//button[@class=' btn btn-primary btn-lg']"));
		nxt.click();
		
		yrs = driver.findElement(By.xpath("//button[@data-track-action='20+Click']"));
		yrs.click();
		
		pp = driver.findElement(By.xpath("//input[@id='PurchasePrice']"));
		pp.sendKeys("220,000");
		
		driver.findElement(By.xpath("//button[@data-track-action='NextClick']")).click();
		
		fBuyer = driver.findElement(By.xpath("//button[@data-track-action='YesClick']"));
		fBuyer.click();
		
		noBtn = driver.findElement(By.xpath("//button[@data-track-action='NoClick']"));
		noBtn.click();
		
		noBtn.click();
		
		lowInterest = driver.findElement(By.xpath("//button[@data-track-action='LowerRateClick']"));
		lowInterest.click();
		
		cScore = driver.findElement(By.xpath("//button[@data-track-action='good']"));
		cScore.click();
		
		noBtn.click();
		
		String text = driver.findElement(By.xpath("//h1[contains(.,'Here are your personalized results')]")).getText();
		String Exp = "Here are your personalized results";
		assertSame(Exp, text);
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
