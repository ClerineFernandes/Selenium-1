package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program47 {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/a849923/OneDrive%20-%20Eviden/Desktop/learningHTML1.html");
		driver.switchTo().alert().accept();
		
		
		driver.manage().window().maximize();
		WebElement firstname=driver.findElement(By.id("1"));
		firstname.sendKeys("Clerine");
		
		

	}

}
