package testJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver obj= new ChromeDriver();
		
		obj.get("https://www.amazon.com");
		

	}

}
