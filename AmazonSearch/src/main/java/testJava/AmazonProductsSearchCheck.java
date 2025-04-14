package testJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonProductsSearchCheck {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		String searchText= "Mac Book laptops";
		driver.navigate().refresh();
		driver.navigate().refresh();
		driver.manage().window().maximize();
		
		WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox"));
		if(searchBox.isEnabled()) {
			searchBox.sendKeys(searchText);
			WebElement searchButton= driver.findElement(By.id("nav-search-submit-button"));
			searchButton.click();
		}
		else {
			System.out.println("Your Search box is not enabled");
		}
		WebElement searchResult = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/h2"));
		String serachResultText = searchResult.getText();
		if(serachResultText.contains(searchText)) {
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Test case failed");
		}
		
		/*List<WebElement> AllPrimeCheckBox = driver.findElements(By.xpath("//*[@id=\"p_90/8308921011\"]/span/a/span"));
		if(AllPrimeCheckBox.get(0).isEnabled()) {
			AllPrimeCheckBox.get(0).click();
			System.out.println("Clicked on Get it by Tomorrow check box");
		} */
		
		WebElement displaySizes= driver.findElement(By.xpath("//*[@id=\"filter-p_n_size_browse-bin\"]"));
		System.out.println(displaySizes.getText());
	}

}
