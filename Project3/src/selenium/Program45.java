package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program45 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement  e1=driver.findElement(By.name("q"));
		e1.sendKeys("Books");
		Thread.sleep(1000);
		List <WebElement> secondoptions=driver.findElements(By.xpath("//ul[@class='_1sFryS_2x2Mmc_3ofZy1']/li"));
		int count=secondoptions.size();
		System.out.println(count);
		driver.findElement(By.xpath("(//ul/li/div/a)[3]")).click();

	}

}
