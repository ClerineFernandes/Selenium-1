package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program36 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/a849923/OneDrive%20-%20Eviden/Desktop/learningHTML1.html");
		WebElement l_name=driver.findElement(By.id("121"));
		boolean checking_l_name=l_name.isEnabled();
		if(checking_l_name==true && l_name.isDisplayed()==true )
		{
			l_name.sendKeys("Fernandes");
		}
		else
		{
			System.out.println("Component is Disabled");
		}
		
		

	}

}
