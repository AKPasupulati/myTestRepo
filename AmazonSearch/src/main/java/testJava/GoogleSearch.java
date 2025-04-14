package testJava;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		
		// Search some thing in a google search
		/*WebElement search= driver.findElement(By.id("APjFqb"));
		
		if(search.isEnabled()) {
			search.sendKeys("Achyuth");
			search.sendKeys(Keys.ENTER);
		}
		else {
			System.out.println("There is no such type of variable");
		} */
		
		//find hyper links in a google home page
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		ArrayList<WebElement> unBrokenLinks= new ArrayList<WebElement>();
		ArrayList<WebElement> brokenLinks = new ArrayList<WebElement>();
		int count=0;
		for(WebElement link: links) {
			String text= link.getText();
			if(!link.getText().isEmpty()) {
				unBrokenLinks.add(link);
			}
			else {
				count++;
				brokenLinks.add(link);
			}
		}
		System.out.println("UnBroken Links size is : "+unBrokenLinks.size());
		for(WebElement unBrokenLink : unBrokenLinks) {
			System.out.println(unBrokenLink.getText() +" : " + unBrokenLink.getAttribute("href"));
			
		}
		
		System.out.println("Broken Links size is : "+count);
		for(WebElement brokenLink: brokenLinks) {
			System.out.println(brokenLink.getText() + " : " + brokenLink.getAttribute("href"));
		}

	}

}
