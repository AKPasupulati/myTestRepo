package testJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class GetByTomorrowCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://www.amazon.com");
		
		driver.navigate().refresh();
		driver.manage().window().maximize();
		WebElement ele= driver.findElement(By.id("twotabsearchtextbox"));
		System.out.println("You selected : "+ele);
		
		

	}

}
