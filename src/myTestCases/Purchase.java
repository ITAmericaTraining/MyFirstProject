import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Purchase {
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
	public void purchases() throws Exception{
		baseUrl = "https://kathmanduyogi.com/";
		driver.get(baseUrl);
		
		WebElement menuclick, travel, item, qview, drpMenu, add2cart, chkout, coutMenu, fN, lN, sAddr, city, zip, phone, email, shipnbill, stateDrp, placeorder;
		
		menuclick = driver.findElement(By.id("menu-item-6684"));
		//By.id(""));
		travel = driver.findElement(By.id("menu-item-6687"));
		
		Actions act = new Actions(driver);
		act.moveToElement(menuclick).click(travel).build().perform();
		
		item = driver.findElement(By.xpath("//div[@style='background-image:url(https://kathmanduyogi.com/wp-content/uploads/2017/05/Travel-Brownish-Offwhite-Piping-2-466x466.jpg); background-size: 32px 32px; float:left; width:32px; height:32px;']"));
		item.click();
		
		qview = driver.findElement(By.xpath("//a[@data-prod='4661']"));
		qview.click();
		
		drpMenu = driver.findElement(By.xpath("//select[@id='pa_travel-cushion']"));
		
		Select itm = new Select(drpMenu);
		itm.selectByVisibleText("Black");
		
		add2cart = driver.findElement(By.xpath("//button[contains(.,'Add to cart')]"));
		add2cart.click();
		
		coutMenu = driver.findElement(By.xpath("//span[@class='header-cart-title']"));
		
		chkout = driver.findElement(By.xpath("//a[contains(.,'Checkout')]"));
		act.moveToElement(coutMenu).click(chkout).build().perform();
		
		fN = driver.findElement(By.xpath("//input[@id='billing_first_name']"));
		fN.sendKeys("Himavanth");
		
		lN = driver.findElement(By.xpath("//input[@id='billing_last_name']"));
		lN.sendKeys("Pabbati");
		
		sAddr = driver.findElement(By.xpath("//input[@id='billing_address_1']"));
		sAddr.sendKeys("2207 Birch Ln,");
		
		city = driver.findElement(By.xpath("//input[@id='billing_city']"));
		city.sendKeys("Rolling Meadows");
		
		/*stateDrp = driver.findElement(By.xpath("//span[contains(@id,'select2-billing_state-container')]"));
		Select stDrp = new Select(stateDrp);
		stDrp.selectByVisibleText("Illinois");*/
		
		zip = driver.findElement(By.xpath("//input[@id='billing_postcode']"));
		zip.sendKeys("60008");
		
		phone = driver.findElement(By.xpath("//input[@id='billing_phone']"));
		phone.sendKeys("206-240-5522");
		
		email = driver.findElement(By.xpath("//input[@id='billing_email']"));
		email.sendKeys("hima@gmail.com");
		
		shipnbill = driver.findElement(By.xpath("//input[@name='ship_to_different_address']"));
		shipnbill.click();
		
		placeorder = driver.findElement(By.xpath("//button[@id='place_order']"));
		placeorder.click();
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
