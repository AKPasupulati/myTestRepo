package TestNGPractice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass3 {
	@Test
	public void testMethod1() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/browser-windows.php");
		WebElement ele = driver.findElement(By.xpath("//*[@class='btn btn-primary' and contains(text(),'New Window Message')]"));
		String winId= driver.getWindowHandle();
		ele.click();
		Set<String> winIds = driver.getWindowHandles();
		for(String id: winIds) {
			if(!winId.equalsIgnoreCase(id)) {
				driver.switchTo().window(id);
				WebElement e= driver.findElement(By.xpath("//*[@class='mb-3 fw-normal border-bottom text-left pb-2 mb-4']"));
				Assert.assertEquals(e.getText(),"New Window Message", "Test case Failed");
				break;
			}
		}
		
		driver.switchTo().window(winId);
		driver.quit();
	}
	
	@Test
	public void testMethod2() {
		WebDriver driver = new ChromeDriver();
	      
	      // adding implicit wait of 12 secs
	      driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	      
	      // Opening the webpage in window 1
	      driver.get("https://www.tutorialspoint.com/selenium/practice/check-box.php");
	      
	      // get text in window 1
	      WebElement e = driver.findElement
	         (By.xpath("/html/body/main/div/div/div[2]/h1"));
	      System.out.println("Text is: " + e.getText());
	      
	      // Initiate the Webdriver
	      WebDriver newDriver = driver.switchTo().newWindow(WindowType.WINDOW);
	      
	      // Opening the webpage in new window
	      driver.get("https://www.tutorialspoint.com/selenium/practice/radio-button.php");
	      
	      // get text in window 2
	      WebElement e1 = driver.findElement
	         (By.xpath("/html/body/main/div/div/div[2]/form/h1"));
	      System.out.println("Text in new window is: " + e1.getText());
	}

}
