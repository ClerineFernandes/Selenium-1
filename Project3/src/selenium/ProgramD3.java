package selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ProgramD3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f1=new FileInputStream("C:\\Users\\a849923\\eclipse-workspace\\Project3\\Excel_sheet\\clerine.xlsx");
		Workbook wb=WorkbookFactory.create(f1);
		String UN1=wb.getSheet("Login").getRow(2).getCell(0).getStringCellValue();
		String PW1=wb.getSheet("Login").getRow(2).getCell(1).getStringCellValue();
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		

	}

}
