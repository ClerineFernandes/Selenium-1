package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program35 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/a849923/OneDrive%20-%20Eviden/Desktop/learningHTML1.html");
		WebElement Pass= driver.findElement(By.id("121"));
		boolean checking_Last_name=Pass.isEnabled();
		if(checking_Last_name==true && Pass.isDisplayed()==true)
		{
			Pass.sendKeys("1234");
		}
		else
		{
			System.out.println("Either component is not displaying or disabled");
		}
		
		
		

	}

}
