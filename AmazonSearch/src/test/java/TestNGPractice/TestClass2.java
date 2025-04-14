package TestNGPractice;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass2 {
	
	@Test
	public void testMethod1() {
		ChromeOptions op= new ChromeOptions();
		op.setPageLoadStrategy(PageLoadStrategy.EAGER);
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_webdriver_driver_sessions.htm");
		WebElement ele= driver.findElement(By.xpath("//*[contains(text(),'Next')]"));
		if(ele.isEnabled()) {
			ele.click();
			System.out.println("Element clicked for method 1");
		}
	driver.findElement(By.linkText("abc"));
		SessionId ses= ((RemoteWebDriver)driver).getSessionId();
		System.out.println("Method 1 : "+ses);
//		driver.quit();
	}
	
	@Test
	public void testMethod2() {
		ChromeOptions op= new ChromeOptions();
		op.addArguments("--headless=new");
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_webdriver_driver_sessions.htm");
		WebElement ele= driver.findElement(By.xpath("//*[contains(text(),'Next')]"));
		if(ele.isEnabled()) {
			ele.click();
			System.out.println("Element clicked for method 2");
		}
		
		SessionId s= ((RemoteWebDriver)driver).getSessionId();
		System.out.println("Method 2 : "+s);
//		driver.quit();
	}
	
	@Test
	public void testMethod3() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/upload-download.php");
//		WebElement ele= driver.findElement(By.xpath("//*[@id='uploadFile']"));
		WebElement ele = driver.findElement(By.cssSelector("input#uploadFile[type='file']"));
		
		File f= new File("src/test/resources/Rohit.jpg");
		String path= f.getAbsolutePath();
		ele.sendKeys(path);
		
	}
	
	@Test
	public void testMethod4() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		WebElement ele = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
		ele.sendKeys("iphone");
		List<WebElement> bEle= null;
		
			ele.click();
			bEle = driver.findElements(RelativeLocator.with(By.xpath("//*[@class='left-pane-results-container']/child::div")).below(ele));
		for(WebElement ele2: bEle) {
			if(ele2.getText().contains("iphone")) {
				System.out.println("Your first search is : "+ele2.getText());
				Assert.assertTrue(true);
			}
			else {
				Assert.fail();
			}
		}
		List<WebElement> webElemts = driver.findElements(By.id("Achyuth"));
		System.out.println("Size of your web element is: "+webElemts.size());
		
		
		
		driver.quit();
	}
	
	@Test
	public void TestMethod4() {
		ChromeOptions op= new ChromeOptions();
		op.setCapability(null, false);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");
		WebElement ele = driver.findElement(By.xpath("//*[@id='fullname']"));
		ele.sendKeys("Achyuth");
		String text= driver.switchTo().activeElement().getAttribute("value");
		System.out.println("Active element method: "+text);
		
		String text2= ele.getAttribute("value");
		System.out.println("This is from element: "+ text2);
		
		//System.out.println(driver.getPageSource());
	}

}
