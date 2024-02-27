package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program59 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement country=driver.findElement(By.linkText("Canada"));
		Point location=country.getLocation();
		int x=location.getX();
		int y=location.getY();
		System.out.println(x);
		System.out.println(y);
		JavascriptExecutor jse=driver;
		jse.executeScript("window.scrollBy(0,"+y+")");
		jse.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(10000);
		jse.executeScript("window.scrollBy(0,-5000)");
		

	}

}
