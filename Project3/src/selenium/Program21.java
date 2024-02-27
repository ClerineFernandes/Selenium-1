package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program21 {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.className("gLFyf")).sendKeys("India");
		

	}

}
