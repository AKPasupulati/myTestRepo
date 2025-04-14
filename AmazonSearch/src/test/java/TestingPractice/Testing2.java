package TestingPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.lang.Thread;
public class Testing2 {
	@Test
	public void testing2Method1() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.global/flight/search?itinerary=NYC-LAX-01/04/2025&tripType=O&paxType=A-1_C-0_I-0&intl=true&cabinClass=E&lang=eng");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement ele= driver.findElement(By.xpath("//*[@id='listingFilterCheckbox']//attribute::type"));
		System.out.println(ele.getText());
	}

}
