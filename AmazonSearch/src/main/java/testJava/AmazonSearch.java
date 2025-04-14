package testJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
public class AmazonSearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		
		String res= driver.getTitle();
		
		if(res.contains("Amazon.com")) {
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Test case failed");
		}
		
		
		
		driver.manage().window().maximize();
		driver.navigate().refresh();
	}

}
