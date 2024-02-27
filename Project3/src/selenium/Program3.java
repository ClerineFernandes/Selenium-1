package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program3 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("clerine20@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("878790");
		driver.findElement(By.name("login")).click();
	}

}
