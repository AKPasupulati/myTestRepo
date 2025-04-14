package testJava;



import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnitedArlines {

	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.united.com/en/in");
		driver.manage().window().maximize();
//		WebElement ele= driver.findElement(By.xpath("//*[@title=\"Chrome\"]/parent::tr"));
//		ArrayList<String> loo=new ArrayList<>();
//		List<WebElement> text=ele.findElements(By.xpath("//*[starts-with(@class,'bs')]"));;
//		for(WebElement el: text) {
//			
//			loo.add(el.getAttribute("title"));
//		}
//		for(String txt: loo) {
//			System.out.println(txt);
//		}
//		
		
		
		
		
		
		WebElement subBtn= driver.findElement(By.xpath("//*[@type='submit']"));
		WebElement fromField= driver.findElement(By.xpath("//*[@id='bookFlightOriginInput']"));
		WebElement toField= driver.findElement(By.xpath("//*[@id='bookFlightDestinationInput']"));
		fromField.sendKeys("EWR");
		toField.sendKeys("DFW");
		subBtn.click();
		System.out.println("Test case passed");
		List<WebElement> getPrices= driver.findElements(By.xpath("//*[@class='atm-c-btn__text']"
				+ "//descendant::span/span[starts-with(text(),'$')]"));
		System.out.println("Test case failed");
		for(WebElement ele: getPrices) {
			System.out.println(ele.getText());
			System.out.println("Test case passed");
		}
		

	}

}
