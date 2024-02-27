package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Program56 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement drag=driver.findElement(By.id("drag7"));
		WebElement drop=driver.findElement(By.id("div2"));
		Actions a1=new Actions(driver);
		a1.dragAndDrop(drag, drop).perform();
		Thread.sleep(2000);

		WebElement drag1=driver.findElement(By.id("div2"));
		WebElement drop1=driver.findElement(By.id("div1"));
		Actions a2=new Actions(driver);
		a2.dragAndDrop(drag1, drop1).perform();
		
		
		
		
		
	}

}
