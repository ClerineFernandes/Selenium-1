package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Package27 {

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
		 WebElement Permanent_Address=driver.findElement(By.id("Address"));
		 Permanent_Address.sendKeys("Mangalore Karnataka");
		 WebElement Pincode=driver.findElement(By.name("Pincode"));
		 Pincode.sendKeys("576214");
		 WebElement Agree=driver.findElement(By.name("Agree"));
		 Agree.click();
		 WebElement cate_dd=driver.findElement(By.id("Skills"));
		Select s1=new Select(cate_dd);
		s1.selectByValue("select1");
		WebElement skill_dd =driver.findElement(By.id("technicalskills"));
		Select s2=new Select(skill_dd);
		s2.selectByVisibleText("Manual Testing");
	WebElement country_dd=driver.findElement(By.id("Country"));
	Select s3=new Select(country_dd);
	s3.selectByIndex(8);
	WebElement Religion_dd=driver.findElement(By.id("Relegion"));
	Select s4=new Select(Religion_dd);
	s4.selectByValue("Atheism");
		
		
		
	
		
		

	}

}
