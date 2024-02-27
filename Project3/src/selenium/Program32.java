package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program32 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement  e1=driver.findElement(By.name("q"));
		e1.sendKeys("India");
		Thread.sleep(1000);
		List <WebElement> results=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int count=results.size();
		System.out.println(count);
		results.get(count-7).click();
		
		
		
	}

}
