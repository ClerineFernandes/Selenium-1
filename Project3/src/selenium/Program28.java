package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program28 {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/x-path/#1");
		driver.findElement(By.xpath("//span[@class='folder']")).click();
		driver.findElement(By.xpath("//nav[@class='tree-nav default']/ul/li/span")).click();
		driver.findElement(By.xpath("//ul[@class='main-items']/li/span[1]")).click();
		driver.findElement(By.xpath("//ul[@class='main-items']/li/span[1]")).click();
	    driver.findElement(By.xpath("//ul[@class='sub-items']/li/span[1]")).click();
		driver.findElement(By.xpath("//ul[@class='main-items']/li/ul/li[2]/span")).click();
		driver.findElement(By.xpath("//ul[@class='main-items']/li/ul/li[2]/span")).click();
		driver.findElement(By.xpath("//ul[@class='main-items']/li/ul/li[3]/span")).click();
		driver.findElement(By.xpath("//ul[@class='main-items']/li/ul/li[3]/span")).click();
		driver.findElement(By.xpath("//ul[@class='main-items']/li/ul/li[4]/span")).click();
		
		
		

	}

}
