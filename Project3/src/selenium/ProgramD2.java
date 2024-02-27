//Amazon Login DDT
package selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ProgramD2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream f1=new FileInputStream("C:\\Users\\a849923\\eclipse-workspace\\Project3\\Excel_sheet\\clerine.xlsx");
		Workbook wb=WorkbookFactory.create(f1);
		String UN1=wb.getSheet("Login").getRow(1).getCell(0).getStringCellValue();
		//String PW1=wb.getSheet("Login").getRow(1).getCell(1).getStringCellValue();
		String PW1=NumberToTextConverter.toText(wb.getSheet("Login").getRow(1).getCell(1).getNumericCellValue());

		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement e=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Actions a1=new Actions(driver);
		a1.moveToElement(e).perform();
		Thread.sleep(2000)	;
	    driver.findElement(By.linkText("Sign in")).click();
	    Thread.sleep(2000)	;
		driver.findElement(By.id("ap_email")).sendKeys(UN1);
		Thread.sleep(2000)	;
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys(PW1);
		Thread.sleep(2000)	;
		driver.findElement(By.id("signInSubmit")).click();
		

	}

}
