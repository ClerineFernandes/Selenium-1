//Program to upload file,Windows popup
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program46 {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement choose_file=driver.findElement(By.id("Resume"));
		choose_file.sendKeys("C:\\Users\\a849923\\OneDrive - Eviden\\Desktop\\Clerine_2YOE_SoftwareTesting.pdf");
		

	}

}
