package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program48 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/javascript-popup/");
		driver.switchTo().alert().accept();
		
		
		driver.manage().window().maximize();
		WebElement popup=driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div/div[1]/div/h1"));
		
		
	}

}
