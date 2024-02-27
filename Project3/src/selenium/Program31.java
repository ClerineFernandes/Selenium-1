package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program31 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		driver.findElement(By.id("fname")).sendKeys("Manish Kumar Tiwari");
		driver.findElement(By.id("fname")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.id("fname")).sendKeys(Keys.CONTROL+"c");
		driver.findElement(By.id("lname")).sendKeys(Keys.CONTROL+"v");
		driver.findElement(By.id("Username")).sendKeys(Keys.CONTROL+"v");
		driver.findElement(By.id("password")).sendKeys(Keys.CONTROL+"v");

	}

}
