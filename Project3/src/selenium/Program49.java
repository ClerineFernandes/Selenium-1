package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Program49 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		WebElement login=driver.findElement(By.xpath("(//a[.='CONTINUE TO LOGIN'])[1]"));
		login.click();
		WebElement first_name=driver.findElement(By.id("username"));
		first_name.sendKeys("Clerine");
		WebElement last_name=driver.findElement(By.id("label2"));
		last_name.sendKeys("Fernandes123");
		WebElement login_captcha=driver.findElement(By.id("loginCaptchaValue"));
		 String captchaValue = login_captcha.getAttribute("refreshImgCaptcha");
	        System.out.println("Captcha Value: " + captchaValue);
		
		
		
		

	}

}
