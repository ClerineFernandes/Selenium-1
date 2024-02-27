package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program29 {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement name=driver.findElement(By.name("q"));
		name.sendKeys("India");
		Thread.sleep(1000);
		List<WebElement> results=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int counting_auto=results.size();
		System.out.println(counting_auto);
		Thread.sleep(3000);
		results.get(counting_auto-7).click();
		
		

	}

}
