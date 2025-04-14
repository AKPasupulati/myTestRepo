package testJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLoginAutomation {

	public static void main(String[] args) throws IOException{
		
		
			String excelFilePath = "C:\\Users\\achyu\\Downloads\\Facebook login cred.xlsx";
			FileInputStream fis = new FileInputStream(new File(excelFilePath));
			Workbook excelWorkBook = new XSSFWorkbook(fis);
			Sheet sheet = excelWorkBook.getSheet("Test Data for FB Login");
			for(int i=1;i<=sheet.getLastRowNum();i++) {
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.facebook.com");
				driver.manage().window().maximize();
				
				WebElement newAccountbtn= driver.findElement(By.linkText("Create new account"));
				newAccountbtn.click();
				Row rw= sheet.getRow(i);
				String fName = rw.getCell(0).getStringCellValue();
				String lName= rw.getCell(1).getStringCellValue();
				String mon= rw.getCell(2).getStringCellValue();
				double day= rw.getCell(3).getNumericCellValue();
				double year= rw.getCell(4).getNumericCellValue();
				String gender= rw.getCell(5).getStringCellValue();
				String email= rw.getCell(6).getStringCellValue();
				String password= rw.getCell(7).getStringCellValue();
				WebElement firstName = driver.findElement(By.name("firstname"));
				firstName.sendKeys(fName);
				WebElement lastName = driver.findElement(By.name("lastname"));
				lastName.sendKeys(lName);
				WebElement month = driver.findElement(By.id("month"));
				Select dob = new Select(month);
				dob.selectByContainsVisibleText(mon);
				WebElement daysElement = driver.findElement(By.id("day"));
				Select daySelect = new Select(daysElement);
				daySelect.selectByContainsVisibleText(String.valueOf((int)day));
				
				WebElement yearElement = driver.findElement(By.id("year"));
				Select yearSelect = new Select(yearElement);
				yearSelect.selectByContainsVisibleText(String.valueOf((int)year));
				WebElement femaleGenderEle = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[4]/span/span[1]/label"));
				WebElement maleGenderElement = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[4]/span/span[2]/label"));
				WebElement otherGenderElement = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[4]/span/span[3]/label"));
				
				String femaleGenderTxt= femaleGenderEle.getText();
				String maleGenderTxt= maleGenderElement.getText();
				String otherGenderTxt= otherGenderElement.getText();
				if(femaleGenderTxt.equals(gender)) {
					femaleGenderEle.click();
				}else if(maleGenderTxt.equals(gender)) {
					maleGenderElement.click();
				}else {
					otherGenderElement.click();
				}
				WebElement phoneNum = driver.findElement(By.name("reg_email__"));
				phoneNum.sendKeys(String.valueOf(email));
				WebElement pwd = driver.findElement(By.name("reg_passwd__"));
				pwd.sendKeys(password);
				WebElement signUpBtn = driver.findElement(By.name("websubmit"));
				signUpBtn.click();
				
			
		}
	}

}
