package com.bdd.automation.stepDefinitions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wikipedia {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
//		for(int i=1;i<=4;i++) {
//			System.out.print(i+". ");
//			WebElement text= driver.findElement(By.xpath("//*[@id=\"mp-itn\"]/ul/li["+i+"]"));
//			System.out.println(text.getText());
//		}	
		
		List<WebElement> elemnts= driver.findElements(By.xpath("//*[@id='mp-itn']/ul/li"));
		
		
		for(int i=0;i<elemnts.size();i++) {
			System.out.println((i+1)+". "+elemnts.get(i).getText());
			
		}
	}

}
