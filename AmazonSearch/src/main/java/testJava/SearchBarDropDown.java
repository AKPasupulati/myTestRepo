package testJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchBarDropDown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		WebElement ele= driver.findElement(By.id("searchDropdownBox"));
		System.out.println(ele);
	}

}
