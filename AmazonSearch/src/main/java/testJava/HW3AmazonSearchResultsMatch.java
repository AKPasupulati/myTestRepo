package testJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HW3AmazonSearchResultsMatch {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.com");
		driver.navigate().refresh();
		driver.manage().window().maximize();
		WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("IPhone");
		WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
		searchButton.click();
        WebElement totalResultsElement = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/h2/span[1]"));
        String totalResultsText = totalResultsElement.getText();
        
        System.out.println("Total Results Text: " + totalResultsText);

       
        List<WebElement> searchedCount = driver.findElements(By.cssSelector("[data-component-type='s-search-result']"));
        int resultsPerPage = searchedCount.size();
        System.out.println("Results Per Page: " + resultsPerPage);

       
        if (resultsPerPage > 0) {
            System.out.println("Search results per page count is consistent.");
        } else {
            System.out.println("Mismatch in search results count!");
        }

	}

}
