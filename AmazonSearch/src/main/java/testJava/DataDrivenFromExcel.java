package testJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DataDrivenFromExcel {

	public static void main(String[] args) throws IOException{
		
		String excelFilePath = "C:\\Users\\achyu\\Downloads\\Testing Data Driven Framework.xlsx";
		FileInputStream fis = new FileInputStream(new File(excelFilePath));
		
		Workbook excelWorkBook = new XSSFWorkbook(fis);
		
		Sheet sheet = excelWorkBook.getSheet("Products");
		
		for(int i=1;i<=sheet.getLastRowNum();i++) {
			Row rw= sheet.getRow(i);
			String value= rw.getCell(0).getStringCellValue().toLowerCase();
			WebDriver driver = new EdgeDriver();
			driver.get("https://www.amazon.com");
			driver.manage().window().maximize();
			driver.navigate().refresh();
			WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox"));
			searchBox.sendKeys(value);
			WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
			searchButton.click();
			WebElement searchedText= driver.findElement(By.cssSelector("#search > span > div > h1 > div > div.sg-col-14-of-20.sg-col-18-of-24.sg-col.s-breadcrumb.sg-col-10-of-16.sg-col-6-of-12 > div > h2 > span.a-color-state.a-text-bold"));
			if(searchedText.getText().contains(value)) {
				System.out.println("Test case passed for : " + value);
			}
			else {
				System.out.println("Test case failed : "+ value);
			}
			driver.close();
		}
		
		
	}

}
