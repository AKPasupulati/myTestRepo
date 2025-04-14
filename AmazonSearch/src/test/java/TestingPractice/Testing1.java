//package TestingPractice;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class Testing1 {
//	
//	@Test(priority = 1)
//	public void Test1() {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("https:www.github.com");
//		driver.manage().window().maximize();
//		driver.navigate().refresh();
//		driver.navigate().refresh();
//		driver.findElement(By.name("field-keywords")).sendKeys("Shoes",Keys.ENTER);
//	}
//	@Test(priority = 2)
//	public void Test2() {
//		WebDriver driver = new EdgeDriver();
//		driver.get("https:www.amazon.com");
//		driver.manage().window().maximize();
//		driver.navigate().refresh();
//		driver.findElement(By.name("field-keywords")).sendKeys("Shoes",Keys.ENTER);
//	}
//	@Test(priority = 0)
//	public void a_Test3() {
//		Assert.assertEquals(true, false);
//	}
//
//}
