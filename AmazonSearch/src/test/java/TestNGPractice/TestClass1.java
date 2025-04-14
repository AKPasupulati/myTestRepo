package TestNGPractice;

//import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass1 {
	WebDriver driver;
//	@Test
//	public void testMethod1() {
//		Assert.assertEquals("same name", "same name","Both are same");
//	}
//	
//	@Test
//	public void TestMethod2() {
//		Assert.assertNotEquals(true, false);
//	}
	@BeforeTest
	public void launchBrowser() {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--headless");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
	}
	
	@Test(priority = 1)
	public void loginToSalesforce() {
		//ChromeOptions op= new ChromeOptions();
		//op.setPageLoadStrategy(PageLoadStrategy.EAGER);
		
		//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		WebElement uName= driver.findElement(By.xpath("//*[@id='username' and @name='username']"));
		WebElement pwd= driver.findElement(By.xpath("//*[contains(@id,'pass') and @name='pw']"));
		WebElement sbt= driver.findElement(By.xpath("//*[@type='submit']"));
		uName.sendKeys("achyuthkumar0010@gmail.com");
		pwd.sendKeys("Achyuth@123");
		if(sbt.isEnabled()) {
			sbt.submit();
			Assert.assertEquals(true, true);
		}
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		String id= driver.getWindowHandle();
		System.out.println("Window handle id: "+id);
		
	}
	@Test(priority=2)
	public void pageValidation() {
		Assert.assertEquals(driver.getTitle(), "Lightning Experience");
		String id= driver.getWindowHandle();
		System.out.println("Window handle id: "+id);
	}
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
	
	
	
//	@Test
//	public void getElementsInTutorialPoint() {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.tutorialspoint.com/selenium/selenium_webdriver_installation.htm");
//		List<WebElement>stepsCount= driver.findElements(By.xpath("//*[contains(text(),'Step')]"));
//		for(WebElement step: stepsCount) {
//			System.out.println(step.getText());
//		}
//		System.out.println(driver.getCurrentUrl());
//		driver.close();
//	}

}
