package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Program16 {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("clerine20@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("9889980");
		//driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
		
		
		

	}

}
