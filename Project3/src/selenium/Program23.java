package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program23 
{

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement firstname=driver.findElement(By.name("fname"));
		firstname.sendKeys("Clerine");
		WebElement Lastname=driver.findElement(By.name("lname"));
		Lastname.sendKeys("Fernandes");
		WebElement Username=driver.findElement(By.name("Username"));
		Username.sendKeys("ClerineFernandes");
		WebElement Password=driver.findElement(By.name("password"));
		Password.sendKeys("123drfs");
		WebElement Gender1=driver.findElement(By.name("Male"));
		Gender1.click();
		WebElement Gender2=driver.findElement(By.name("FeMale"));
		Gender2.click();
		WebElement Present_Address=driver.findElement(By.name("w3review"));
		Present_Address.sendKeys("Pune Maharastra");
		 WebElement Permanent_Address=driver.findElement(By.name("w3review"));
		 Permanent_Address.sendKeys("Mangalore Karnataka");
		 WebElement Pincode=driver.findElement(By.name("Pincode"));
		 Pincode.sendKeys("576214");
		 WebElement Agree=driver.findElement(By.name("Agree"));
		 Agree.click();
		 driver.findElements(By.id(""));
		 
		 
		 
		 
		 
		 
		 
		 
		
		
		
	}

}
