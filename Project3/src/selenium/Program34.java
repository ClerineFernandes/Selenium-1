package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program34
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement first_name=driver.findElement(By.xpath("//input[@id='fname']"));
		boolean checking_first_name= first_name.isDisplayed();
		if(checking_first_name==true)
		{
			first_name.sendKeys("Clerine");
		}
		else
		{
			System.out.println("Do Nothing");
		}
		
		

	}

}
