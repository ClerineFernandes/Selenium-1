package selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ProgramD1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream f1=new FileInputStream("C:\\Users\\a849923\\eclipse-workspace\\Project3\\Excel_sheet\\clerine.xlsx");
		Workbook wb=WorkbookFactory.create(f1);
		Sheet s1=wb.getSheet("Login");
		Row r1=s1.getRow(1);
		Cell c1=r1.getCell(0);
		String UN1=c1.getStringCellValue();
		System.out.println(UN1);
		Row r2=s1.getRow(1);
		Cell c2=r2.getCell(1);
		String PW1=c2.getStringCellValue();
		System.out.println(PW1);
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		
		driver.manage().window().maximize();
		WebElement e=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions a1=new Actions(driver);
		a1.moveToElement(e).perform();
		WebElement e1=driver.findElement(By.linkText("Sign in"));
		e1.click();
		driver.findElement(By.id("ap_email")).sendKeys(UN1);
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys(PW1);
		driver.findElement(By.id("signInSubmit")).click();
		
	}

}
