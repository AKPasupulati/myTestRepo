package testJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignInToGitHub {

	public static void main(String[] args) throws IOException{
		String excelFilePath = "C:\\Users\\achyu\\Downloads\\TestDataOFGitHub.xlsx";
		
		FileInputStream fis = new FileInputStream(new File(excelFilePath));
		Workbook excelWorkBook = new XSSFWorkbook(fis);
		Sheet sheet = excelWorkBook.getSheet("Sheet1");
		
		
		
		for(int i=1;i<=sheet.getLastRowNum();i++) {
			Row rw= sheet.getRow(i);
			String username = rw.getCell(0).getStringCellValue();
			String password= rw.getCell(1).getStringCellValue();
			WebDriver driver = new ChromeDriver();
			driver.get("https://github.com/login");
			driver.navigate().refresh();
			GithubLogin gh= new GithubLogin(driver);
			gh.verifyFormTitle();
			gh.enterUserCred(username, password);
		}
		excelWorkBook.close();
		
	}

}
